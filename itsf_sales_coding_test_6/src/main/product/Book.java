package main.product;

/**
 * Book
 *  
 * @author Benjamin Cinquin
 */
public class Book extends Product {

	private static final ProductType BOOK_PRODUCT_TYPE = ProductType.Book;
	
	public Book(Integer price, Packaging packaging, Boolean isImported) {
		super(price, BOOK_PRODUCT_TYPE, packaging, isImported);
	}

}
