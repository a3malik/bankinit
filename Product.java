package bankinit;

public class Product {
	//core identification and status
	String productCode=null;
	String productDescription=null;
	String productType=null;
	String status=null;
	String startDate=null;
	String endDate=null;
	//financial terms and conditions
	String currency=null;
	double maximumAmount=0.0;
	double minimumAmount=0.0;
	double interestRate=0.0;
	String interestRateType=null;
	double fees=0.0;
	double commission=0.0;
	//operational and system attributes
	
	public Product(String product_code,	String product_description,
			String product_type, String product_status,
			String start_date, String end_date, String product_currency,
			double maximum_amount, double minimum_amount, double interest_rate, 
			String interest_rate_type,	double product_fees,
			double product_commission) {
		this.productCode=product_code;
		this.productDescription=product_description;
		this.productType=product_type;
		this.status=product_status;
		this.startDate=start_date;
		this.endDate=end_date;
		this.currency=product_currency;
		this.maximumAmount=maximum_amount;
		this.minimumAmount=minimum_amount;
		this.interestRate=interest_rate;
		this.interestRateType=interest_rate_type;
		this.fees=product_fees;
		this.commission=product_commission;
	}
	
}
