package main.app;

import java.util.Arrays;
import java.util.List;

import main.packaging.Bottle;
import main.packaging.Box;
import main.product.Chocolate;
import main.product.Perfume;
import main.product.Product;
import main.receipt.Receipt;
import main.receipt.SalesReceipt;
import main.tax.TaxServiceImpl;

/**
 * ITSF Sales Coding Test 6 - Case 2
 * 
 * Application class for case 2
 * 
 * @author Benjamin Cinquin
 */
public class ItsfSalesCodingTest6Case2 {

	/**
	 * Main endpoint for Case 2
	 * 
	 * Print Receipt as requested by the use case
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("ISTF - SalesCodingTest6 - Case 2\r\n");
		
		TaxServiceImpl taxService = new TaxServiceImpl();
		
		// Instantiate products
		Product chocolate = new Chocolate(1, 10f, new Box(), Boolean.TRUE);
		Product perfume = new Perfume(1, 47.50f, new Bottle(), Boolean.TRUE);
		List<Product> products = Arrays.asList(chocolate, perfume);
		
		// Create Receipt
		Receipt receipt = new SalesReceipt(products);
//		System.out.println("Sales Receipt before taxes appliance : \r\n"+receipt+"\r\n");
		
		// Apply Basic tax
		receipt = taxService.applyBasicTax(receipt);
//		System.out.println("Sales Receipt after basic tax appliance : \r\n"+receipt+"\r\n");
		
		// Apply Imported tax
		receipt = taxService.applyImportedTax(receipt);
//		System.out.println("Sales Receipt after taxes appliance : \r\n"+receipt+"\r\n");
		
		System.out.println(receipt);
	}

}
