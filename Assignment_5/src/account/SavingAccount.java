package account;

public class SavingAccount extends Account{
	
	//Data Members
	private double rate;
	
	
	//Constructors
	public SavingAccount(double bal, double rate) {
		super(bal);
		this.rate=rate;
		
	}
	
	public SavingAccount(double bal) {
		this(bal,DEFAULT_RATE);
	}
	
	public SavingAccount() {
		this(DEFAULT_BAL, DEFAULT_RATE);
	}
	
	public SavingAccount(SavingAccount acct) {
		this.bal = acct.bal;
		this.rate = acct.rate;
	}
	
	//Methods
	public double compound() {
		double compound = this.bal*this.rate;
		bal =  compound+bal;
		return compound;
	}
	
	public double withd(double amt) {
		if (amt<bal) {
			bal -= amt;
		}
		return amt;
	}
	
	public String toString() {
		return super.toString() + String.format("\nInterest Rate: %.2f", this.rate);
	}
	
	public double getRate() {
		return this.rate;
	}
	

}
