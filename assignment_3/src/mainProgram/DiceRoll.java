package mainProgram;

import javax.swing.JOptionPane;
import Die.*;

public class DiceRoll {
	
	//Instructs user about the program
	public static void userInstruct() {
		//Pre: none
		//Post: none
		JOptionPane.showMessageDialog(null, "Welcome to Dice Toss!"
											+ "\n\nGuidance & Instructions:"
											+ "\n -This program will toss a set of dice 3 times. "
											+ "\n -You will see the results of each of the 3 tosses."
											+ "\n -The total of the 3 tosses will display at the end."
											+ "\n\n -You only need to decide how many sides your dice will have!",
											"Dice Toss", JOptionPane.INFORMATION_MESSAGE);
	}
	
	//Asks user to decide the number of sides the die has
	public static int userSides() {
		//Pre: none
		//Post: Returns the user's input to be used in the Die class.
		int num = Integer.parseInt(JOptionPane.showInputDialog(null,"How many sides should your dice have?","How many sides?",JOptionPane.QUESTION_MESSAGE));
		return num;
	}


	public static void QA() {
		System.out.println("Begin QA./n/n");
		
		//test the user instructions
		System.out.println("Testing userInstruct method...");
		userInstruct();
		
		//dummy variables for testing methods
		int x = 1;
		int y = 2;
		int sides;
		
		//Test userSides() method
		System.out.println("\n\nTesting userInput method...");
		JOptionPane.showMessageDialog(null,"NOTE:\n\n"
									+ "**For the purposes of testing constructors, please do not enter 6 on the next dialog**",
									"TESTING NOTE!",JOptionPane.WARNING_MESSAGE);
		sides =userSides();
		System.out.println("User Input Results: "+ sides);
		
		//Test Dice methods
		//Die(int,int), getFaceValue, toString, getNumFaces
		System.out.println("\n\nTesting Dice methods...");
		System.out.println(" Testing Die(int,int), toString(), getNumFaces()..."
							+ "\n as Die d1 = new Die(x,sides); :");
		Die d1 = new Die(x,sides);
		System.out.println("  FaceValue should equal 1 (value of 'x' passed to the constructor)");
		System.out.println("    GetFaceValue(): " + d1.getFaceValue());
		System.out.println("  Additionally, validate d1.toString(). Will display as (1):");
		System.out.println("    toString(): "+ d1.toString());
		System.out.println("  NumFaces should equal the number of sides entered by the user");
		System.out.println("    GetNumFaces(): "+ d1.getNumFaces());
				
		
		//Die(int), getFaceValue, toString, getNumFaces
		System.out.println("\n\n Testing Die(int), toString(), getNumFaces()......"
							+ "\n as Die d2 = new Die(y); :");
		Die d2 = new Die(y);
		System.out.println("  FaceValue should equal 2 (value of 'y' passed to the constructor) ");
		System.out.println("    GetFaceValue(): " + d2.getFaceValue());
		System.out.println("  Additionally, validate d2.toString(). Will display as (2):");
		System.out.println("    toString(): "+ d2.toString());
		System.out.println("  NumFaces should equal 6 - the DEFAULT_NUM_FACES from die class ");
		System.out.println("    GetNumFaces(): "+ d2.getNumFaces());
		
		//Die(), getFaceValue, toString, getNumFaces
		System.out.println("\n\n Testing Die(int), toString(), getNumFaces()..."
							+ "\n as Die d3 = new Die(); :");
		Die d3 = new Die();
		System.out.println("  FaceValue should equal 6 - the DEFAULT_NUM_FACES from die class ");
		System.out.println("    GetFaceValue(): " + d3.getFaceValue());
		System.out.println("  Additionally, validate d3.toString(). Will display as (6):");
		System.out.println("    toString(): "+ d3.toString());
		System.out.println("  NumFaces should equal 6 - the DEFAULT_NUM_FACES from die class ");
		System.out.println("    GetNumFaces(): "+ d3.getNumFaces());
		
		//Test Deep Copy using the copy constructor & setFaceValue
		System.out.println("\n\n Testing Die(Die) & setFaceValue(int)..."
				+ "\n as Die d3 = new Die(); :");
		Die d4 = new Die(d1);
		System.out.println("  FaceValue should equal 1 (value of 'x' passed to the constructor)");
		System.out.println("    D1 GetFaceValue(): " + d1.getFaceValue());
		System.out.println("    D4 GetFaceValue(): " + d4.getFaceValue());
		System.out.println("  Update d1 faceValue to equal the user input # of sides by running d1.setFaceValue(sides);");
		d1.setFaceValue(sides);
		System.out.println("    New D1 GetFaceValue(): " + d1.getFaceValue());
		System.out.println("    D4 GetFaceValue() remains the same: " + d4.getFaceValue());
	
		//Test roll()
		//1 sided die
		System.out.println("\n\n Test roll() with a 1 sided die..." + "\n Die d5 = new Die(x,1)");
		Die d5 = new Die(x,1);
		System.out.println("\n Call d5.roll()"
							+ "\n   This should always equal 1 for this test.");
		d5.roll();
		int numRoll= Integer.parseInt(JOptionPane.showInputDialog(null,"How many rolls to test?",null,JOptionPane.QUESTION_MESSAGE));
		for (int i=1; i<=numRoll; i++) {
			System.out.println("    Roll "+i+" D5 GetFaceValue(): " + d5.toString()); 
								
		}
		//2 sided die
		System.out.println("\n\n Test roll() with a 2 sided die..." + "\n Die d6 = new Die(x,2);");
		Die d6 = new Die(x,2);
		System.out.println("\n Call d6.roll()"
							+ "\n   This should only equal 1 or 2 for this test.");
	
		numRoll= Integer.parseInt(JOptionPane.showInputDialog(null,"How many rolls to test?",null,JOptionPane.QUESTION_MESSAGE));
		for (int i=1; i<=numRoll; i++) {
			d6.roll();
			System.out.println("    Roll "+ i +" D6 GetFaceValue(): " + d6.toString()); 
								
		}
		
		//6 sided die
		System.out.println("\n\n Test roll() with a 2 sided die..." + "\n Die d7 = new Die();");
		Die d7 = new Die();
		System.out.println("\n Call d7.roll()"
							+ "\n   This should only equal 1-6 for this test.");
		numRoll= Integer.parseInt(JOptionPane.showInputDialog(null,"How many rolls to test?",null,JOptionPane.QUESTION_MESSAGE));
		for (int i=1; i<=numRoll; i++) {
			d7.roll();
			System.out.println("    Roll "+ i +" D7 GetFaceValue(): " + d7.toString());
		}
		
	}
	
	
	public static void main(String[] args) {

		/*
		 * Call QA Method for testing & comment out when testing is complete.
		 */
		//QA();
		
		/*
		 * Main Program
		 */
		
		userInstruct(); //calls method to display user instructions
		
		/*
		 * Declare/initialize variables
		 */
		int toss = 3; 			//default to 3 tosses
		int total = 0;			//will be used to get the total of all 3 tosses
		int sides = userSides();//to add variety, giving the user an option to use any number of sides they'd like
		
		
		/*
		 * For loop that tosses 2 dice using Die(int,int).
		 * Setting the faceValue to 1 initially, and then will use roll() to generate a random toss.
		 */
		
		for (int i=1; i<=toss;i++) {
			
			//First Dice in the Toss
			Die d1 = new Die(1,sides);
			d1.roll();
			int tossSum = d1.getFaceValue();
			
			//Second Dice in the Toss
			Die d2 = new Die(1,sides);
			d2.roll();
			tossSum +=d2.getFaceValue();
			
			//Display the Toss values & sum to the user in the console
			System.out.println("Toss " + i + ": generated a " + d1.toString() + " and a " + d2.toString() + " for a total of " + tossSum);
			//Add the tossSum to the total for the final output
			total += tossSum; 
			
		}
		/*
		 * Display the totals of all 3 tosses to the user in the console.
		 */
		System.out.println("Total of all 3 tosses is: " + total);

		
	
	}

}
