package studentAPI;

public class Student {
	String name;
	double score;
	char grade;
	double average;
	int count;
	
	
	public Student (String name, double score, char grade) {
		this.name 	= name;
		this.score 	= score;
		this.grade 	= grade;
	}
	
	public String toString() {
		return "Name: " + name + " Score: " + score + " Grade: " + grade;
	}
	
	public double getScore(){
		return this.score;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setGrade(char g) {
		this.grade = g;
	}

	
	public static double AverageScore(Student [] list) {
		double sum = 0;
		double averageScore;
		int count = 0;
		for (int i = 0; i<list.length;i++ ) {
			sum += list[i].getScore();
			count ++;
		}
		averageScore = sum/count;
		return averageScore;
	}
	
	public static void aboveAvg(Student [] list,double avg) {
		for (int i = 0; i<list.length; i++) {
			if (list[i].getScore() > avg) {
				System.out.println("Above Average Student: " + list[i].name);
			}
		}
	}
	public static void findStudent(Student [] list, String name) {
		int i = 0;
		while (list[i] != null && !list[i].getName().equals(name)) {
			i++;
		}
		if (list[i] == null) {
			System.out.println(name +" was not found in the array.");
		}
		else {
			System.out.println(name + " was found in position "+i);
		}
		
	}
		
	
		
	
	
}
