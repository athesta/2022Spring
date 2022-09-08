import accountAPI.*; //imports every members of the pkg accountAPI

public class MyMainClass {

	public static void main(String[] args) {
		
		Account acct = new Account();
		
		//Account.[instance variable] will not show up.
		//Correct way:
//		System.out.println("DEFAULT RATE:" +acct.DEFAULT_INTEREST_RATE);
//		
//		acct.initializeAccount(500.00, 0);
//		System.out.println("BALANCE: " + acct.balance + " RATE: " + acct.rate);
//		
//		acct.initializeAccount(125.00);
//		System.out.println("BALANCE: " + acct.balance + " RATE: " + acct.rate);
//	
//		acct.initializeAccount();
//		System.out.println("BALANCE: " + acct.balance + " RATE: " + acct.rate);
		
		
		acct.initializeAccount(200.00);
		System.out.println("BALANCE: " + acct.balance);
		acct.deposit(75);
		System.out.println("Deposit 75\n"
							+ "   BALANCE: " + acct.balance);
		acct.withdrawal(150);
		System.out.println("Withdraw 150\n"
							+ "   BALANCE: " + acct.balance);
		acct.withdrawal(115);
		System.out.println("Withdraw 115\n" 
							+ "   REMAINING BALANCE: " + acct.balance);
		
		acct.setRate(.13);
		acct.setBalance(900);
		System.out.println(acct.getBalance() + " " + acct.getRate());
		
		acct.displayAccount();
		
	}

}
