package main.tax;

import java.util.Arrays;
import java.util.List;

import main.product.ProductType;

/**
 * Basic Tax
 *  
 * @author Benjamin Cinquin
 */
public class BasicTax extends Tax {

	private static final Float BASIC_TAX_RATE = 10f;
	
	private final List<ProductType> BASIC_TAX_EXCLUSION = 
		Arrays.asList(
			ProductType.Book,
			ProductType.Food,
			ProductType.Medical
		);
	
	public BasicTax() {
		super(BASIC_TAX_RATE);
	}

	public static Float getBasicTaxRate() {
		return BASIC_TAX_RATE;
	}

	public List<ProductType> getBasicTaxExclusion() {
		return BASIC_TAX_EXCLUSION;
	}
	
}
