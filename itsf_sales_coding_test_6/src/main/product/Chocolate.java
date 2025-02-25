package main.product;

import main.packaging.Packaging;

/**
 * Chocolate
 *  
 * @author Benjamin Cinquin
 */
public class Chocolate extends Product {

	private static final ProductType CHOCOLATE_PRODUCT_TYPE = ProductType.Food;
	
	public Chocolate(Integer quantity, Float price, Packaging packaging, Boolean isImported) {
		super(quantity, price, CHOCOLATE_PRODUCT_TYPE, packaging, isImported);
	}

	/**
	 * Label
	 */
	@Override
	public String getLabel() {
		return (printPlural() ? "chocolates" : "chocolate");
	}
}
