package DIY;

public class MainProgram {

	public static void main(String[] args) {
		GradStudent gs1, gs2, gs3, gs4;
		
		gs1 = new GradStudent ("Jen", 40, 3.75, 158, true);
		gs2 = new GradStudent (gs1);
		gs3 = new GradStudent (162,true);
		gs4 = new GradStudent ();
		
		System.out.println("GS1: (\"Jen\", 40, 3.75, 158, true) \n");
		gs1.display();
		
		System.out.println("\n\nGS2: (gs1)");
		gs2.display();
		
		System.out.println("\n\nGS3: (162,true)");
		gs3.display();
		
		System.out.println("\n\nGS4: ()");
		gs4.display();
		

	}

}
