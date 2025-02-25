package main.tax;

/**
 * Imported Tax
 *  
 * @author Benjamin Cinquin
 */
public class ImportedTax extends Tax {

	private static final Float IMPORTED_TAX_RATE = 5f;
	
	public ImportedTax() {
		super(IMPORTED_TAX_RATE);
	}

	public static Float getImportedTaxRate() {
		return IMPORTED_TAX_RATE;
	}
	
}
