package main.receipt;

import java.util.List;

import main.product.Product;

public class SalesReceipt extends Receipt {

	public SalesReceipt(List<Product> products) {
		super(products);
	}
	
	@Override
	public String toString() {
		String receiptPrinting = "";
		for(Product product : getProducts()) {
			receiptPrinting += product.getQuantity() + " ";
			if(product.getIsImported()) receiptPrinting += "imported ";
			if(product.getPackaging().getPrinted()) receiptPrinting += product.getPackaging().getLabel(product) + " of ";
			receiptPrinting += product.getLabel() + " : ";
			receiptPrinting += product.getPrice();
			receiptPrinting += "\r\n";
		}
		return receiptPrinting
				+ "Sales Taxes : "+ getSalesTaxes() +"\r\n"
				+ "Total : "+ getTotal();
	}
	
	

}
