package DIY;

public class Student {
	protected String 	name;
	protected int 		age;
	protected double 	GPA;
	
	//initialized constructor
	public Student (String n, int a, double g) {
		this.name	= n;
		this.age	= a;
		this.GPA	= g;
	}
	
	//copy constructor
	public Student(Student s1) {
		this.name	= s1.name;
		this.age	= s1.age;
		this.GPA	= s1.GPA;
	}
	
	//default constructor
	public Student() {
		this.name	= "DefaultName";
		this.age	= 99;
		this.GPA	= 0.0;
	}
	
	public void display() {
		System.out.println("Name: " + this.name + "\nAge: " + this.age + "\nGPA: " + this.GPA);
	}

	
	
}
