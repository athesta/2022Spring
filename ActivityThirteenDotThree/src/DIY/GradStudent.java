package DIY;

public class GradStudent extends Student{
	protected int GREScore;
	protected boolean ResearchStarted;
	
	public GradStudent(String n, int a, double g, int s, boolean r) {
		super(n,a,g);
		this.GREScore		 =s;
		this.ResearchStarted =r;
		
	}
	
	public GradStudent(GradStudent g1) {
		super(g1);
		this.GREScore		 = g1.GREScore;
		this.ResearchStarted = g1.ResearchStarted;
				
	}
	
	public GradStudent(int s, boolean r) {
		this.GREScore	  	 = s;
		this.ResearchStarted = r;
	}
	
	public GradStudent() {
		this.GREScore		 = 0;
		this.ResearchStarted = false;
	}
	
	public void display() {
		super.display();
		System.out.println("GRE Score: " + this.GREScore + "\nResearch Started: " + this.ResearchStarted);
	}
		

	

}
