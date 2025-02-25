package main.product;

import main.packaging.Packaging;

/**
 * Perfume
 *  
 * @author Benjamin Cinquin
 */
public class Perfume extends Product {

	private static final ProductType PERFUME_PRODUCT_TYPE = ProductType.Other;
	
	public Perfume(Integer quantity, Float price, Packaging packaging, Boolean isImported) {
		super(quantity, price, PERFUME_PRODUCT_TYPE, packaging, isImported);
	}
	
	/**
	 * Label
	 */
	@Override
	public String getLabel() {
		return (printPlural() ? "perfumes" : "perfume");
	}

}
