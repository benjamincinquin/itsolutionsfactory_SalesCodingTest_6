package main.packaging;

import main.product.Product;

/**
 * Packaging - Abstract class use for managing of packaging
 * 
 * @author Benjamin Cinquin
 */
public abstract class Packaging {

	private Boolean printed;
	private Boolean productPlural;
	
	public Packaging(Boolean printed, Boolean productPlural) {
		super();
		this.printed = printed;
		this.productPlural = productPlural;
	}
	
	/**
	 * Printed
	 */
	public Boolean getPrinted() {
		return printed;
	}
	public void setPrinted(Boolean printed) {
		this.printed = printed;
	}
	
	/**
	 * Product Plural
	 */
	public Boolean getProductPlural() {
		return productPlural;
	}
	public void setProductPlural(Boolean productPlural) {
		this.productPlural = productPlural;
	}

	public String getLabel(Product product) {
		return ((product.getQuantity() > 1) ? "packagings" : "packaging");
	}

	@Override
	public String toString() {
		return "Packaging [productPlural=" + productPlural + "]";
	}
	
}
