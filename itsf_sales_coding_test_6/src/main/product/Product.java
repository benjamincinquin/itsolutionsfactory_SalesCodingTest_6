package main.product;

import main.packaging.Packaging;

/**
 * Product - Abstract class for all products
 *  
 * @author Benjamin Cinquin
 */
public abstract class Product {

	private Integer quantity;
	private Float price;
	private ProductType productType;
	private Packaging packaging;
	private Boolean isImported;
	
	public Product(Integer quantity, Float price, ProductType productType, Packaging packaging, Boolean isImported) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.productType = productType;
		this.packaging = packaging;
		this.isImported = isImported;
	}
	
	/**
	 * Quantity 
	 */
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	/**
	 * Price 
	 */
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	
	/**
	 * Product Type
	 */
	public ProductType getProductType() {
		return productType;
	}
	public void setProductType(ProductType productType) {
		this.productType = productType;
	}
	
	/**
	 * Packaging
	 */
	public Packaging getPackaging() {
		return packaging;
	}
	public void setPackaging(Packaging packaging) {
		this.packaging = packaging;
	}
	
	/**
	 * Importation
	 */
	public Boolean getIsImported() {
		return isImported;
	}
	public void setIsImported(Boolean isImported) {
		this.isImported = isImported;
	}
	
	/**
	 * Label
	 */
	public String getLabel() {
		return (printPlural() ? "products" : "product");
	}
	
	protected Boolean printPlural() {
		return ((getQuantity() > 1 && !getPackaging().getPrinted()) || getPackaging().getProductPlural());
	}
	
	@Override
	public String toString() {
		return "Product [price=" + price + ", productType=" + productType + ", packaging=" + packaging + ", isImported="
				+ isImported + "]";
	}
	
}
