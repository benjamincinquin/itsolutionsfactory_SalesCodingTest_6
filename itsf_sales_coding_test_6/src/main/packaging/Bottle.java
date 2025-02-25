package main.packaging;

import main.product.Product;

/**
 * Bottle
 * 
 * @author Benjamin Cinquin
 */
public class Bottle extends Packaging {

	public Bottle() {
		super(Boolean.TRUE, Boolean.FALSE);
	}

	public String getLabel(Product product) {
		return ((product.getQuantity() > 1) ? "bottles" : "bottle");
	}
	
}
