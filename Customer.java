package bankinit;

public class Customer {

	private String firstname;
	private String lastname;
	private char gender;
	private String title;

	public Customer (String firstname, String lastname, char gender) {
		gender=this.gender;
		firstname=this.firstname;
		lastname=this.lastname;
		
		switch (gender) {
		case 'M':
			this.title = "Mr.";
		case 'F':
			this.title = "Ms.";
			
		}
		
		System.out.printf("%s %s %s",
				this.get_title(),this.get_firstname(),this.get_lastname());
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
