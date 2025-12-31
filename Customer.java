package bankinit;

public class Customer {

	//core identification and contact
	private String customerId;
	private String firstname;
	private String lastname;
	private String email;
	private char gender;
	private String title;
	//security and access
		//--private String userNAme;
		//--private passwordHash;
	
	//banking relationship and status

	public Customer (String customer_id, String firstname, String lastname,
			String email, char gender	) {
		
		this.gender=gender;
		this.firstname=firstname;
		this.lastname=lastname;
		this.customerId=customer_id;
		this.email=email;
		
		this.title = switch (this.gender) {
		case 'M' -> "Mr.";
		case 'F' -> "Ms.";
		default -> "Hey";
			
		};
		
	}
	
	public String get_customer_id() {
		return customerId;
	}
	public String get_title() {
		return title;
	}
	public String get_firstname() {
		return firstname;
	}
	public String get_email() {
		return email;
	}
	public String get_lastname() {
		return lastname;
	}
	
	
}
