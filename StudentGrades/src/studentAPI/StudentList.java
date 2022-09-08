package studentAPI;



public class StudentList {
	private static int numStudents;
	private Student [] student;
	private int last;
	public static void initialSize(int size) {
		numStudents=size;
		
	}

	private void doubleTheSize() {
		Student [] tempStudent = student;
		numStudents *=2;
		student = new Student[numStudents+1];
		int i = 0;
		while (tempStudent[i] != null) {
			student[i] = tempStudent[i];
			i++;
		}
		student[i] = null;
	}
	
	
	public void addStudent(String name, int age, char gender){
		
		if (last >= student.length-1)
			doubleTheSize();
		
			student[last] = new Student(name, age, gender);
			last++;
		}
	
	
	
	
}
