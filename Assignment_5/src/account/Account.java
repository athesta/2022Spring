package account;

public class Account {
	
	//Data Members
	private static int nextAvailableAcctNumber = 0;
	protected double bal;
	protected int number;
	protected static double DEFAULT_RATE = 0.05;
	protected static double DEFAULT_BAL  = 1000.00;
	
	//Constructors
	public Account(double bal) {
		this.bal=bal;
		this.number=nextAvailableAcctNumber;
		nextAvailableAcctNumber++;
	}
	
	public Account() {
		this(DEFAULT_BAL);
	}
	
	public Account(Account acct) {
		this.bal=acct.bal;
		this.number=acct.number;
	}
	
	//Methods
	public void deposit(double amt) {
		if (amt>0) {
			this.bal=amt+bal;
		}
	}
	
	public String toString(){
		return String.format("AcountNumber:%d\nBalance:%.2f", number, bal);
	}
	
	public boolean equals(Account thisAccount) {
		boolean equal = true;
		if (number==thisAccount.number)
		return equal;
		else 
			return !equal;
	}
	
	public double getBal() {
		return bal;
	}
	
	public int getAcctNumber() {
		return number;
	}

}
