package main.product;

/**
 * Perfume
 *  
 * @author Benjamin Cinquin
 */
public class Perfume extends Product {

	private static final ProductType PERFUME_PRODUCT_TYPE = ProductType.Other;
	
	public Perfume(Integer price, Packaging packaging, Boolean isImported) {
		super(price, PERFUME_PRODUCT_TYPE, packaging, isImported);
	}

}
