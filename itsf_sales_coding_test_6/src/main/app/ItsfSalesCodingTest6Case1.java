package main.app;

import main.product.Book;
import main.product.Packaging;

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
		System.out.println("ISTF - SalesCodingTest6 - Case 1");
		
		Book book = new Book(12.49f, Packaging.SINGLE, Boolean.FALSE);
	}

}
