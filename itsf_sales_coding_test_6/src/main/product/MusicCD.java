package main.product;

/**
 * Music CD
 *  
 * @author Benjamin Cinquin
 */
public class MusicCD extends Product {

	private static final ProductType MUSIC_CD_PRODUCT_TYPE = ProductType.Other;
	
	public MusicCD(Integer price, Packaging packaging, Boolean isImported) {
		super(price, MUSIC_CD_PRODUCT_TYPE, packaging, isImported);
	}

}
