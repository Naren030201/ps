package cj.problems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class P001CylinderVolumeCalculator {

	// Find the formula to calculate volume of a cylinder
	// and implement the missing part in calculateVolume()
	// function. Run the JUnit test case of TestCylinderVolumeCalulator 
	// to test.
	
	public static double calculateVolume(double r, double h) {
		double volume = 0.0;
		final double PI = 3.14285714285714;
		
		// Here calculate volume using radius and height
		volume=PI*r*r*h;
		
		return volume;
	}

	@Test
	void testCase1() {
		assertEquals(3080.0, Math.round(calculateVolume(7, 20)));
	}

}
