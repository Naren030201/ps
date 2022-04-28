package cj.problems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class P021NumberFormatting {
	
	/* 
	 * Convert a decimal number into a string having 5 decimal places.
	 * Ex 1: 0.03 -> 0.03000
	 * Ex 2: 1.0  -> 1.00000
	 * Ex 3: 2345.234 -> 2345.23400
	 * 
	 * Hint: Check documentation for formatting decimal using %f.
	 */
	private static String formatDecimal(double number) {
		// include format in the first parameter 
		// of the format() function below
		
		return String.format("%.5f", number);
	}

	@Test
	void test1() {
		assertEquals("0.03000", formatDecimal(0.03));
	}

	@Test
	void test2() {
		assertEquals("1.00000", formatDecimal(1));
	}

	@Test
	void test3() {
		assertEquals("2345.23400", formatDecimal(2345.234));
	}

}
