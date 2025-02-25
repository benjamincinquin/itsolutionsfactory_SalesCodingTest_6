package main.product;

import main.packaging.Packaging;

/**
 * Music CD
 *  
 * @author Benjamin Cinquin
 */
public class MusicCD extends Product {

	private static final ProductType MUSIC_CD_PRODUCT_TYPE = ProductType.Other;
	
	public MusicCD(Integer quantity, Float price, Packaging packaging, Boolean isImported) {
		super(quantity, price, MUSIC_CD_PRODUCT_TYPE, packaging, isImported);
	}
	
	/**
	 * Label
	 */
	@Override
	public String getLabel() {
		return (printPlural() ? "music cds" : "music cd");
	}

}
