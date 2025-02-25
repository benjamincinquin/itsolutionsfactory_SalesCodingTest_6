package main.product;

import main.packaging.Packaging;

/**
 * Headache Pills
 *  
 * @author Benjamin Cinquin
 */
public class HeadachePills extends Product {

	private static final ProductType HEADACHE_PILLS_PRODUCT_TYPE = ProductType.Medical;
	
	public HeadachePills(Integer quantity, Float price, Packaging packaging, Boolean isImported) {
		super(quantity, price, HEADACHE_PILLS_PRODUCT_TYPE, packaging, isImported);
	}
	
	/**
	 * Label
	 */
	@Override
	public String getLabel() {
		return (printPlural() ? "headache pills" : "headache pill");
	}

}
