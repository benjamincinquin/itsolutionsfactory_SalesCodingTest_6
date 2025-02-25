package main.tax;

/**
 * Basic Tax
 *  
 * @author Benjamin Cinquin
 */
public class BasicTax extends Tax {

	private static final Float BASIC_TAX_RATE = 10f;
	
	public BasicTax() {
		super(BASIC_TAX_RATE);
	}

}
