import java.io.FileNotFoundException;
import java.util.Arrays;

import dictionary.*;

//created a QA class in the default package to test the dictionary

public class QA {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Dictionary d = new Dictionary();
		
		System.out.println("load dictionary...");
		d.loadDictionary("Dict.txt");
		
		//temp made words[] public
		System.out.println("\n\n ...Print dictionary/array...");
		//System.out.println(Arrays.toString(d.words));
		
		System.out.println("\n\nadd word Blackboard. Then use find word to locate it");
		d.addWord("Blackboard");
		System.out.println(d.findWord("BlaCKboard")); 
		
		//temp made words[] public
		System.out.println("\n\n ...Print dictionary/array...");
		//System.out.println(Arrays.toString(d.words));
		
		System.out.println("\n\nremove word Blackboard. Then use find word to locate it");
		d.removeWord("Blackboard");
		System.out.println(d.findWord("BlaCKboard"));
		
		//temp made words[] public
		System.out.println("\n\n ...Print dictionary/array...");
		//System.out.println(Arrays.toString(d.words));
		
		//temp change Dictionary matched() to public
		//Passed manual test
		//System.out.println("used for manually testing matched");		
		//d.matched("String", "Strong");
		//System.out.println(d.matched("slown", "stown"));
		
		System.out.println("\n\nTest Suggest. sell is in dictionary. Look for suggestion for tell");
		//d.suggest("Tell");
		System.out.println(d.suggest("Tell"));
		System.out.println("\n\nadd wordx2: fell and stell. Then re-run suggest(Tell)");
		d.addWord("fell");
		d.addWord("steel");
		System.out.println(d.suggest("Tell"));
		
		System.out.println("Save dictionary and then open the save3.txt file from local to see if sell, fell, & stell all exist");
		d.saveDictionary("D:\\Personal Files\\Documents\\My Documents\\College\\2021 Fall\\APC 300\\save3.txt");
		
	}

}
