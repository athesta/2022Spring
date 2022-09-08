package account;

public class CheckingAccount extends Account{
	
	//data members
	private double limit;
	private double charge;
	
	//Constructors
	public CheckingAccount(double bal, double limit, double charge) {
		super(bal);
		this.limit = limit;
		this.charge = charge;
	}
	
	public CheckingAccount(double bal) {
		this(bal, 1000.00, 2.00);
	}
	
	public CheckingAccount() {
		this(1000.00,1000.00,2.00);
	}
	
	public CheckingAccount(CheckingAccount acct) {
		this.limit=acct.limit;
		this.charge=acct.charge;
	}
	
	//Methods
	public double withd(double amt) {
		double withd=amt;
		if (amt<bal) {
			bal-=amt;
			if (bal<this.limit) {
				bal-=charge;
				withd=amt+charge;
			}
			else withd=amt;
		}
		return withd;
	}
	
	public String toString() {
		return super.toString() + String.format("\nMinimum balance before a charge: %.2f"
				+ "\nCharge per check if balance falls below the minimum balance: %.2f"
				, this.limit,this.charge);
	}
	
	public double getLimit() {
		return this.limit;
	}
	
	public double getCharge() {
		return this.charge;
	}
}
