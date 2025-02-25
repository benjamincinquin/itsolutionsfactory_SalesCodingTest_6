package main.product;

/**
 * Chocolate
 *  
 * @author Benjamin Cinquin
 */
public class Chocolate extends Product {

	private static final ProductType CHOCOLATE_PRODUCT_TYPE = ProductType.Food;
	
	public Chocolate(Integer price, Packaging packaging, Boolean isImported) {
		super(price, CHOCOLATE_PRODUCT_TYPE, packaging, isImported);
	}

}
