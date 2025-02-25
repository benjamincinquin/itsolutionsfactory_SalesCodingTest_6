package main.product;

/**
 * Headache Pills
 *  
 * @author Benjamin Cinquin
 */
public class HeadachePills extends Product {

	private static final ProductType HEADACHE_PILLS_PRODUCT_TYPE = ProductType.Medical;
	
	public HeadachePills(Float price, Packaging packaging, Boolean isImported) {
		super(price, HEADACHE_PILLS_PRODUCT_TYPE, packaging, isImported);
	}

}
