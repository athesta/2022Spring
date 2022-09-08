import account.*;


public class AccountManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a = new Account(10);
		Account b = new Account();
		Account c = b;
		
		SavingAccount sa = new SavingAccount(500, .10);
		SavingAccount sb = new SavingAccount(2000);
		SavingAccount sc = new SavingAccount();
		
		CheckingAccount ca = new CheckingAccount(100,2,10);
		CheckingAccount cb = new CheckingAccount(2000);
		CheckingAccount cc = new CheckingAccount(500);
		CheckingAccount cd = ca;
		
		
		System.out.println("\nTest Account(bal) - Account a");
		System.out.println(a.toString());
		System.out.println("a.equals(a): "+ a.equals(a));
		System.out.println("a.equals(b): "+ a.equals(b));
		System.out.println("a.equals(c): "+ a.equals(c));
		System.out.println("a.GetBalance(): " + a.getBal());
		System.out.println("a.getAcctNumber(): " + a.getAcctNumber());
		
		
		System.out.println("\nTest Account() - Account b");
		System.out.println(b.toString());
		System.out.println("b.equals(a): "+ b.equals(a));
		System.out.println("b.equals(b): "+ b.equals(b));
		System.out.println("b.equals(c): "+ b.equals(c));
		System.out.println("b.GetBalance(): " + b.getBal());
		System.out.println("b.getAcctNumber(): " + b.getAcctNumber());
		
		System.out.println("\nTest Account(acct) - Account c");
		System.out.println(c.toString());
		System.out.println(c.equals(c));
		System.out.println("c.equals(a): "+ c.equals(a));
		System.out.println("c.equals(b): "+ c.equals(b));
		System.out.println("c.equals(c): "+ c.equals(c));
		System.out.println("c.GetBalance(): " + c.getBal());
		System.out.println("c.getAcctNumber(): " + c.getAcctNumber());
		
		
		
		System.out.println("\nTest SavingsAccount(a,b)");
		
		System.out.println("Get Balance first:" +sa.getBal());
		System.out.println("Get Rate: " +sa.getRate());
		System.out.println("sa.compound(): "+ sa.compound());
		System.out.println("Updated balance:" +sa.getBal());
		System.out.println("Withdraw 20: " + sa.withd(20));
		System.out.println("Updated balance: " +sa.getBal());
		System.out.println("ToString() Time!: \n" + sa.toString());
		
		System.out.println("\nTest SavingsAccount(a)");
		
		System.out.println("Get Balance first:" +sb.getBal());
		System.out.println("Get Rate: " +sb.getRate());
		System.out.println("sa.compound(): "+ sb.compound());
		System.out.println("Updated balance:" +sb.getBal());
		System.out.println("Withdraw 20: " + sb.withd(20));
		System.out.println("Updated balance: " +sb.getBal());
		System.out.println("ToString() Time!: \n" + sb.toString());

		System.out.println("\nTest SavingsAccount()");
		
		System.out.println("Get Balance first:" +sc.getBal());
		System.out.println("Get Rate: " +sc.getRate());
		System.out.println("sa.compound(): "+ sc.compound());
		System.out.println("Updated balance:" +sc.getBal());
		System.out.println("Withdraw 20: " + sc.withd(20));
		System.out.println("Updated balance: " +sc.getBal());
		System.out.println("ToString() Time!: \n" + sc.toString());
		
		System.out.println("\nTest CheckingAccount(bal,limit,charge)");
		System.out.println("Get Balance first:" +ca.getBal());
		System.out.println("Get Limit: " +ca.getLimit());
		System.out.println("Get Charge: " +ca.getCharge());
		System.out.println("Withdraw Above Limit: " + ca.withd(50));
		System.out.println("Update Balance: " +ca.getBal());
		System.out.println("Withdraw Below Limit: " + ca.withd(49));
		System.out.println("Update Balance: " +ca.getBal());
		System.out.println("ToString() Time!: \n" + ca.toString());
		
		System.out.println("\nTest CheckingAccount(bal)");
		System.out.println("Get Balance first:" +cb.getBal());
		System.out.println("Get Limit: " +cb.getLimit());
		System.out.println("Get Charge: " +cb.getCharge());
		System.out.println("Withdraw Above Limit: " + cb.withd(250));
		System.out.println("Update Balance: " +cb.getBal());
		System.out.println("Withdraw Below Limit: " + cb.withd(751));
		System.out.println("Update Balance: " +cb.getBal());
		System.out.println("ToString() Time!: \n" + cb.toString());
	
		System.out.println("\nTest CheckingAccount()");
		System.out.println("Get Balance first:" +cc.getBal());
		System.out.println("Get Limit: " +cc.getLimit());
		System.out.println("Get Charge: " +cc.getCharge());
		System.out.println("Withdraw Above Limit: " + cc.withd(250));
		System.out.println("Update Balance: " +cc.getBal());
		System.out.println("Withdraw Below Limit: " + cc.withd(751));
		System.out.println("Update Balance: " +cc.getBal());
		System.out.println("ToString() Time!: \n" + cc.toString());
		
		System.out.println("\nTest CheckingAccount()");
		System.out.println("Get Balance first:" +cd.getBal());
		System.out.println("Get Limit: " +cd.getLimit());
		System.out.println("Get Charge: " +cd.getCharge());
		System.out.println("Withdraw Above Limit: " + cc.withd(250));
		System.out.println("Update Balance: " +cd.getBal());
		System.out.println("Withdraw Below Limit: " + cd.withd(751));
		System.out.println("Update Balance: " +cd.getBal());
		System.out.println("ToString() Time!: \n" + cd.toString());
	}

}
