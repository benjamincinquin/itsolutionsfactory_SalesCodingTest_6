package main.receipt;

import java.util.List;

import main.product.Product;

public abstract class Receipt {

	private List<Product> products;
	private Float salesTaxes;
	private Float total;
	
	public Receipt(List<Product> products) {
		super();
		this.products = products;
	}
	/**
	 * Products
	 */
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	/**
	 * SalesTaxes
	 */
	public Float getSalesTaxes() {
		return salesTaxes;
	}
	public void setSalesTaxes(Float salesTaxes) {
		this.salesTaxes = salesTaxes;
	}
	
	/**
	 * Total
	 */
	public Float getTotal() {
		return total;
	}
	public void setTotal(Float total) {
		this.total = total;
	}
	
	@Override
	public String toString() {
		return "Receipt [products=" + products + ", salesTaxes=" + salesTaxes + ", total=" + total + "]";
	}
	
}
