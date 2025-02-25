package main.product;

/**
 * Product - Abstract class for all products
 *  
 * @author Benjamin Cinquin
 */
public abstract class Product {

	private Float price;
	private ProductType productType;
	private Packaging packaging;
	private Boolean isImported;
	
	public Product(Float price, ProductType productType, Packaging packaging, Boolean isImported) {
		super();
		this.price = price;
		this.productType = productType;
		this.packaging = packaging;
		this.isImported = isImported;
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
	
	@Override
	public String toString() {
		return "Product [price=" + price + ", productType=" + productType + ", packaging=" + packaging + ", isImported="
				+ isImported + "]";
	}
	
}
