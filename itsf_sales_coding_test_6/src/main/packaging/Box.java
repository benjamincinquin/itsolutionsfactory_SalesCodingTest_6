package main.packaging;

import main.product.Product;

/**
 * Box
 * 
 * @author Benjamin Cinquin
 */
public class Box extends Packaging {

	public Box() {
		super(Boolean.TRUE, Boolean.TRUE);
	}

	public String getLabel(Product product) {
		return ((product.getQuantity() > 1) ? "boxes" : "box");
	}
	
}
