package main.tax;

/**
 * Tax - Abstract class for all taxes
 *  
 * @author Benjamin Cinquin
 */
public abstract class Tax {
	
	private Float rate;
	
	public Tax(Float rate) {
		super();
		this.rate = rate;
	}

	/**
	 * Rate
	 */
	public Float getRate() {
		return rate;
	}

	public void setRate(Float rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "Tax [rate=" + rate + "]";
	}
	
}
