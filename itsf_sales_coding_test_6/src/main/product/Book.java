package main.product;

import main.packaging.Packaging;

/**
 * Book
 *  
 * @author Benjamin Cinquin
 */
public class Book extends Product {

	private static final ProductType BOOK_PRODUCT_TYPE = ProductType.Book;
	
	public Book(Integer quantity, Float price, Packaging packaging, Boolean isImported) {
		super(quantity, price, BOOK_PRODUCT_TYPE, packaging, isImported);
	}

	/**
	 * Label
	 */
	@Override
	public String getLabel() {
		return (printPlural() ? "books" : "book");
	}
}
