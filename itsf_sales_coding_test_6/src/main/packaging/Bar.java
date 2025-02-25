package main.packaging;

import main.product.Product;

/**
 * Bar
 * 
 * @author Benjamin Cinquin
 */
public class Bar extends Packaging {

	public Bar() {
		super(Boolean.TRUE, Boolean.FALSE);
	}

	public String getLabel(Product product) {
		return ((product.getQuantity() > 1) ? "bars" : "bar");
	}
	
}
