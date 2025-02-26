package test.tax;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import main.packaging.Single;
import main.product.Book;
import main.product.Perfume;
import main.product.Product;
import main.receipt.Receipt;
import main.receipt.SalesReceipt;
import main.tax.BasicTax;
import main.tax.ImportedTax;
import main.tax.Tax;
import main.tax.TaxServiceImpl;


public class TaxServiceTest {

	/**
	 * Test that basic tax is not apply for exempted product
	 */
    @Test
    public void basicTaxForExemptedProduct() {
    	// Instantiate products
    	Product book = new Book(1, 100f, new Single(), Boolean.FALSE);
    	List<Product> products = Arrays.asList(book);
    	
    	// Create Receipt
    	Receipt receipt = new SalesReceipt(products);
    	
    	// Apply Basic tax
    	TaxServiceImpl taxService = new TaxServiceImpl();
		receipt = taxService.applyBasicTax(receipt);
		
		// Assert that Price is unchanged
		assertTrue(book.getPrice().equals(receipt.getProducts().getFirst().getPriceWithTaxes()));
    }
    
    /**
	 * Test that basic tax is well apply for taxed product
	 */
    @Test
    public void basicTaxForTaxedProduct() {
    	// Instantiate products
    	Product perfume = new Perfume(1, 100f, new Single(), Boolean.FALSE);
    	List<Product> products = Arrays.asList(perfume);
    	
    	// Create Receipt
    	Receipt receipt = new SalesReceipt(products);
    	
    	// Apply Basic tax
    	TaxServiceImpl taxService = new TaxServiceImpl();
		receipt = taxService.applyBasicTax(receipt);
		
		// Assert that initial Price is lower than price with basic tax
		assertTrue(perfume.getPrice()<receipt.getProducts().getFirst().getPriceWithTaxes());
    }
    
    /**
	 * Test that basic tax amount is correct
	 */
    @Test
    public void basicTaxAmount() {
    	// Instantiate products
    	Product perfume = new Perfume(1, 100f, new Single(), Boolean.FALSE);
    	List<Product> products = Arrays.asList(perfume);
    	
    	// Create Receipt
    	Receipt receipt = new SalesReceipt(products);
    	
    	// Apply Basic tax
    	TaxServiceImpl taxService = new TaxServiceImpl();
		receipt = taxService.applyBasicTax(receipt);
		
		// Assert that initial Price is lower than price with basic tax
		Tax basicTax = new BasicTax();
		Float basicTaxAmount = perfume.getPrice()*basicTax.getRate()/100; // Correct basic Tax
		assertTrue(receipt.getProducts().getFirst().getPriceWithTaxes().equals(perfume.getPrice()+basicTaxAmount));
    }
    
    /**
	 * Test that imported tax amount is correct
	 */
    @Test
    public void importedTaxAmount() {
    	// Instantiate products
    	Product book = new Book(1, 100f, new Single(), Boolean.TRUE);
    	List<Product> products = Arrays.asList(book);
    	
    	// Create Receipt
    	Receipt receipt = new SalesReceipt(products);
    	
    	// Apply Basic tax
    	TaxServiceImpl taxService = new TaxServiceImpl();
		receipt = taxService.applyImportedTax(receipt);
		
		// Assert that initial Price is lower than price with basic tax
		Tax importedTax = new ImportedTax();
		Float importedTaxAmount = book.getPrice()*importedTax.getRate()/100; // Correct imported Tax amount
		assertTrue(receipt.getProducts().getFirst().getPriceWithTaxes().equals(book.getPrice()+importedTaxAmount));
    }
	
}
