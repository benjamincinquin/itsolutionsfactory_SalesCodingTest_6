package main.packaging;

import main.product.Product;

/**
 * Packet
 * 
 * @author Benjamin Cinquin
 */
public class Packet extends Packaging {

	public Packet() {
		super(Boolean.TRUE, Boolean.TRUE);
	}

	public String getLabel(Product product) {
		return ((product.getQuantity() > 1) ? "packets" : "packet");
	}
	
}
