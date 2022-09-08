package Payroll;

public class Payroll {

	private int salary [];
	
	public Payroll(int [] salary) {
		this.salary = new int[salary.length];
		for (int i = 0; i < salary.length; i++)
			this.salary[i] = salary[i];
	}
	
	public Payroll(Payroll p){
		this(p.salary);
	}
}
	

