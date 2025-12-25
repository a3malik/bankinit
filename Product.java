package bankinit;

public class Product {
	String productCode=null;
	String productDescription=null;
	int hsn=0;
	double pricePerUnit=0.0;
	
	public Product(String product_code,	String product_description,
			int hsn_nomenclature, double unit_price) {
		this.productCode=product_code;
		this.productDescription=product_description;
		this.hsn=hsn_nomenclature;
		this.pricePerUnit=unit_price;
	}
	
}
