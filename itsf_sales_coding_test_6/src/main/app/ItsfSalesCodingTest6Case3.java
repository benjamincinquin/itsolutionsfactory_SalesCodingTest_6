package main.app;

import java.util.Arrays;
import java.util.List;

import main.packaging.Bottle;
import main.packaging.Box;
import main.packaging.Packet;
import main.product.Chocolate;
import main.product.HeadachePills;
import main.product.Perfume;
import main.product.Product;
import main.receipt.Receipt;
import main.receipt.SalesReceipt;
import main.tax.TaxServiceImpl;

/**
 * ITSF Sales Coding Test 6 - Case 3
 * 
 * Application class for case 3
 * 
 * @author Benjamin Cinquin
 */
public class ItsfSalesCodingTest6Case3 {

	/**
	 * Main endpoint for Case 3
	 * 
	 * Print Receipt as requested by the use case
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("ISTF - SalesCodingTest6 - Case 3\r\n");
		
		TaxServiceImpl taxService = new TaxServiceImpl();
		
		// Instantiate products
		Product perfume = new Perfume(1, 27.99f, new Bottle(), Boolean.TRUE);
		Product perfumeBis = new Perfume(1, 18.99f, new Bottle(), Boolean.FALSE);
		Product pills = new HeadachePills(1, 9.75f, new Packet(), Boolean.FALSE);
		Product chocolate = new Chocolate(1, 11.25f, new Box(), Boolean.TRUE);
		List<Product> products = Arrays.asList(perfume, perfumeBis, pills, chocolate);
		
		// Create Receipt
		Receipt receipt = new SalesReceipt(products);
		System.out.println("Sales Receipt before taxes appliance : \r\n"+receipt+"\r\n");
		
		// Apply Basic tax
		receipt = taxService.applyBasicTax(receipt);
		System.out.println("Sales Receipt after basic tax appliance : \r\n"+receipt+"\r\n");
		
		// Apply Imported tax
		receipt = taxService.applyImportedTax(receipt);
//		System.out.println("Sales Receipt after taxes appliance : \r\n"+receipt+"\r\n");
		
		System.out.println(receipt);
	}

}
