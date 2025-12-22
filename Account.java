package bankinit;

public class Account {
	
	public String name=null;
	public double balance=0.0;
	
	public Account(String name, double balance) {
		this.name=name;
		this.balance=balance;
	}
	
	public String getName() {
		return name;
	}
	
	public double getBalance() {
		return balance;
	}
	
}
