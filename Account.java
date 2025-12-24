package bankinit;

public class Account {
	
	public String name=null;
	public double balance=0.0;
	
	public Account(String name, double balance) {
		this.name=name;
		if (balance >0) {
		this.balance=balance;
		}
		else if(balance < 0) {
			System.out.println("Negative balance initialised in constructor");
		}
		else {
			System.out.println("What a " + this.balance);
		}
	}
	
	public String getName() {
		return name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double deposit_amt) {
		balance=balance+deposit_amt;
	}
	
	public void withdraw(double withdrawl_amt) {
		balance=balance-withdrawl_amt;
	}
	
}
