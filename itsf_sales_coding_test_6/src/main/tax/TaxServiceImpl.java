package main.tax;

import main.product.Product;
import main.receipt.Receipt;

/**
 * Tax Service implementation
 * 
 * @author Benjamin Cinquin
 */
public class TaxServiceImpl implements TaxService {

	private BasicTax basicTax;
	private ImportedTax importedTax;
	
	public TaxServiceImpl() {
		// Setup Taxes
        this.basicTax = new BasicTax();
        this.importedTax = new ImportedTax();
    }
	
	@Override
	public Receipt applyBasicTax(Receipt receipt) {
		for(Product product : receipt.getProducts()) {
			if(!basicTax.getBasicTaxExclusion().contains(product.getProductType())) {
				Float taxAmount = calculTaxAmount(product, basicTax);
				product.setPrice(product.getPrice()+taxAmount); // Update product price
				receipt.setSalesTaxes(receipt.getSalesTaxes()+taxAmount); // Update Sales Taxes
				receipt.setTotal(receipt.getTotal()+taxAmount); // Update Total
			}
		}
		
		return receipt;
	}

	@Override
	public Receipt applyImportedTax(Receipt receipt) {
		return receipt;
	}
	
	/**
	 * Function used to calcul Tax Amount
	 * 
	 * @param product
	 * @param tax
	 * @return Float taxAmount
	 */
	private Float calculTaxAmount(Product product, Tax tax) {
		// Calcul tax amount
		Float taxAmount = tax.getRate()*product.getPrice()/100;
//		System.out.println("Tax amount for product befor round up " + product + " : "+taxAmount);
		
		// round up to the nearest 0.05
		taxAmount = (float) (Math.round(taxAmount * 20.0) / 20.0);
		
//		System.out.println("Tax amount for product " + product + " : "+taxAmount);
		
		return taxAmount;
	}

}
