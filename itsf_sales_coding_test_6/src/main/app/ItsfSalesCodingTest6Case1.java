package main.app;

import java.util.Arrays;
import java.util.List;

import main.packaging.Bar;
import main.packaging.Single;
import main.product.Book;
import main.product.Chocolate;
import main.product.MusicCD;
import main.product.Product;
import main.receipt.Receipt;
import main.receipt.SalesReceipt;
import main.tax.TaxServiceImpl;

/**
 * ITSF Sales Coding Test 6 - Case 1
 * 
 * Application class for case 1
 * 
 * @author Benjamin Cinquin
 */
public class ItsfSalesCodingTest6Case1 {

	/**
	 * Main endpoint for Case 1
	 * 
	 * Print Receipt as requested by the use case
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("ISTF - SalesCodingTest6 - Case 1\r\n");
		
		TaxServiceImpl taxService = new TaxServiceImpl();
		
		// Instantiate products
		Product book = new Book(1, 12.49f, new Single(), Boolean.FALSE);
		Product musicCd = new MusicCD(1, 14.99f, new Single(), Boolean.FALSE);
		Product chocolate = new Chocolate(1, 0.85f, new Bar(), Boolean.FALSE);
		List<Product> products = Arrays.asList(book, musicCd, chocolate);
		
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
