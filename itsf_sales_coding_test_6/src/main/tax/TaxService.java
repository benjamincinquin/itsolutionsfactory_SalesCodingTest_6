package main.tax;

import main.receipt.Receipt;

/**
 * TaxService - Interface listing all methods for tax appliance
 * 
 * @author Benjamin Cinquin
 */
public interface TaxService {
	
	Receipt applyBasicTax(Receipt receipt);
	
	Receipt applyImportedTax(Receipt receipt);
	
}
