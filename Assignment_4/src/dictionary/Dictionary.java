package dictionary;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Dictionary {

	private String[] words;
	private int capacity;
	private int numWordsInDictionary = 0;

	// Doubles the Size of the existing dictionary
	private void doubleTheSize() {

		String[] tempWords = this.words;
		capacity *= 2;
		words 	  = new String[capacity + 1];
		int i 	  = 0;
		while (tempWords[i] != null) {
			words[i] = tempWords[i];
			i++;
		}
		words[i]  = null;
	}

	// Will compare two strings and return 'true' if a match and return 'false' if
	// not a match
	private boolean matched(String a, String b) {
		boolean match = true;
		int 	count = 0;
		for (int i = 0; i < a.length() && i < b.length() && count < 3; i++) {

			if (a.toLowerCase().charAt(i) == b.toLowerCase().charAt(i))
				count++;
			else
				count = 0;
		}

		if (count >= 3)
			return match;
		else
			return !match;

	}

	// Constructor - creates empty dictionary of capacity 2
	public Dictionary() {
		this.capacity 	= 2;
		this.words 		= new String[this.capacity];

	}

	// Constructor - creates empty dictionary of specified capacity
	public Dictionary(int c) {
		this.capacity 	= c;
		this.words 		= new String[c];

	}

	// Locates a word in the dictionary
	public int findWord(String word) {
		int i = 0;
		while (words[i] != null && !words[i].equalsIgnoreCase(word)) {
			i++;
		}
		if (words[i] == null)
			return -1;
		else
			return i;
	}

	// Takes a string & adds it to the dictionary array
	public void addWord(String word) {
		while (this.numWordsInDictionary >= words.length - 1) {
			doubleTheSize();
		}
		words[numWordsInDictionary] = word;
		numWordsInDictionary++;
	}

	// removes a word from the dictionary
	public void removeWord(String word) {
		int i = findWord(word);
		if (i != -1) {
			numWordsInDictionary--;
			words[i] = words[numWordsInDictionary];
			words[numWordsInDictionary] = null;
		}

	}

	// suggests a like word
	public String suggest(String word) {
		String matches = "";
		boolean match = true;
		for (int i = 0; i < words.length; i++) {

			if (words[i] != null && matched(word, words[i]) == match) {
				matches = matches + " " + words[i];
			}
		}
		return matches;

	}

	// loads the dictionary given a file name as a string
	public void loadDictionary(String in) throws FileNotFoundException {

		Scanner inFile = new Scanner(new FileReader(in));
		while (inFile.hasNextLine()) {
			String tempWord = inFile.nextLine();
			addWord(tempWord);
		}
		inFile.close();
	}

	// saves the dictionary as a given file name
	public void saveDictionary(String out) throws FileNotFoundException {
		PrintWriter outFile = new PrintWriter(out);
		for (int i = 0; i < words.length && words[i] != null; i++) {
			outFile.println(words[i] + "\n");
		}
		outFile.flush();
		outFile.close();
	}

}
