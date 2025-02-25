package main.receipt;

import java.util.List;

import main.product.Product;

public class SalesReceipt extends Receipt {

	public SalesReceipt(List<Product> products) {
		super(products);
	}
	
	@Override
	public String toString() {
		return "TODO - Products part"
				+ "Sales Taxes : "+ getSalesTaxes() +"\r\n"
				+ "Total : "+ getTotal();
	}
	
	

}
