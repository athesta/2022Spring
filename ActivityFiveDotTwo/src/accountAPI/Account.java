package accountAPI;

public class Account {
	
	//Instance Constants
	public final double DEFAULT_INTEREST_RATE 	= 0.05; //not accessible to class name;  
	public final double DEFAULT_BALANCE			= 0.00;  //not accessible to class name; 
													    //won't exist until instance created
	//Instance Variables
	public double accountNumber;
	public double balance;
	public double rate;

	//Instance Methods
	public void initializeAccount(double b, double r) {
		accountNumber = getAnAccountNumber();
		balance = b;
		rate = r;
	}
	
	public void initializeAccount (double b) {
		initializeAccount(b, DEFAULT_INTEREST_RATE);
	}
	
	public void initializeAccount() {
		initializeAccount(DEFAULT_BALANCE, DEFAULT_INTEREST_RATE);
	}
	
	public void deposit(double amt) {
		balance += amt;
	}
	
	public double withdrawal(double amt) {
		if(balance >= amt)
			balance -=amt;
		else 
			balance = 0;
		return balance;
		
	}
	
	public void setBalance(double b) {
		balance = b;
	}
	
	public void setRate(double r) {
		rate = r;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getRate() {
		return rate;
	}
	
	public void displayAccount() {
		System.out.println(String.format
				("Account Number: %30.2f"
						+ "\nBalance: %30.2f"
						+ "\nRate: %30.2f", 
						accountNumber,balance,rate ));
	}
	
	//Class Variables (static=Class member)
		public static int nextAvailableAccountNumber = 0;
		
	//Class Methods	
		public static int getAnAccountNumber() {
			int accountNumber = nextAvailableAccountNumber;
			nextAvailableAccountNumber++;
			return accountNumber;
		}

	
}
