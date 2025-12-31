package bankinit;
import java.util.Scanner;

public class AccountOps {

	public static void main(String[] args) {

		var account=new Account("Xxxxxxx Xxxx",1100000.00);
		
		//Test for negative initial balance in an account
		var account2=new Account("YYYY YYYYY",-200.0);
		System.out.printf("%s%n", account2.getName());
		
		//Test for zero initial balance
		var account3=new Account("Axxxxxx YYYYY",0.0);
		System.out.printf("%s%n", account3.getName());
		
		account.deposit(12000.0);
		account.withdraw(233.5);
		
		var input=new Scanner(System.in);
		System.out.print("Enter amount to be deposited: ");
		var deposit_val=input.nextDouble();
		input.close();
		account.deposit(deposit_val);
		
		System.out.printf("%s has %.2f%n",account.getName(),account.getBalance());
		
		//var customer = new Customer("John","Doe",'M');
		//System.out.printf("%s %s %s",
		//		customer.get_title(),customer.get_firstname(),customer.get_lastname());
	}

}
