package techelevator;

import java.math.BigDecimal;

public class ChangeMaker {

	private int quarters;
	private int dimes;
	private int nickels;
	
	public void change(BigDecimal input) {
	//	Please don't laugh	//
		BigDecimal hundred = new BigDecimal("100.00");
		BigDecimal holder = (input.multiply(hundred));
		int n = holder.intValue();

		while (n >= 25) {
			quarters++;
			n -= 25;
		}
		while (n >= 10) {
			dimes++;
			n -= 10;
		}
		while (	Math.round(n) >= 5) {
			nickels++;
			n -= 5;
		}
	}	
	
	public int getQuarters() {
		return quarters;
	}

	public int getDimes() {
		return dimes;
	}

	public int getNickels() {
		return nickels;
	}
}
