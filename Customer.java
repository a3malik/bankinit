package bankinit;

public class Customer {

	//primary identifiers and personal information
	private String customerId;
	private String firstname;
	private String lastname;
	private String dateOfBirth;
	private String nationalId;
	private char gender;
	private String title;
	
	//contact and address
	private String email;
	private String phoneNumber;
	
	
	//security and access
		//--private String userNAme;
		//--private passwordHash;
	
	//banking relationship and status

	public Customer ( String customer_id
					, String firstname
					, String lastname
					, String date_of_birth
					, String national_id
					, char gender
					, String email
					, String phone_number) {
		
		this.customerId=customer_id;
		this.firstname=firstname;
		this.lastname=lastname;
		this.dateOfBirth=date_of_birth;
		this.nationalId=national_id;
		this.gender=gender;
		
		this.email=email;
		this.phoneNumber=phone_number;
		
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
	public String get_lastname() {
		return lastname;
	}
	public String get_dateofbirth() {
		return dateOfBirth;
	}
	public String get_nationalid() {
		return nationalId;
	}
	
	public String get_email() {
		return email;
	}
	public String get_phonenumber() {
		return phoneNumber;
	}
	
}
