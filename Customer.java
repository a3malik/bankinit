package bankinit;

public class Customer {

	private String firstname;
	private String lastname;
	private char gender;
	private String title;

	public Customer (String firstname, String lastname, char gender) {
		
		this.gender=gender;
		this.firstname=firstname;
		this.lastname=lastname;
		
		this.title = switch (this.gender) {
		case 'M' -> "Mr.";
		case 'F' -> "Ms.";
		default -> "Hey";
			
		};
		
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
	
	
}
