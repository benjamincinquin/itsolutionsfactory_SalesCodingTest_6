package main.receipt;

import java.math.BigDecimal;
import java.math.MathContext;
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
			receiptPrinting += new BigDecimal(product.getPriceWithTaxes()).round(MathContext.DECIMAL32).floatValue(); // Use BigDecimal to prevent high precision
			receiptPrinting += "\r\n";
		}
		return receiptPrinting
				+ "Sales Taxes : "+ new BigDecimal(getSalesTaxes()).round(MathContext.DECIMAL32).floatValue() +"\r\n" // Use BigDecimal to prevent high precision
				+ "Total : "+ new BigDecimal(getTotal()).round(MathContext.DECIMAL32).floatValue(); // Use BigDecimal to prevent high precision
	}
	
	

}
