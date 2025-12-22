package bankinit;

public class AccountOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var account=new Account("Xxxxxxx Xxxx",1100000.00);
		System.out.printf("%n%s has %.2f%n",account.getName(),account.getBalance());
	}

}
