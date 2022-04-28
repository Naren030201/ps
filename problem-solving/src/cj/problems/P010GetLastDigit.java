package cj.problems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class P010GetLastDigit {
	
	// Given an integer number, get the last digit           
	// of the number.                                       ___
	// Hint 1: In a sheet of paper find remainder of    10 |25
	//         a number divided by 10                      |
	// Hint 2: Use modulus operator to find the remainder.
	private static int getLastDigit(int number) {
		int lastDigit = 0;
		
		// write code here;
		lastDigit=number%10;
		
		return lastDigit;
	}

	@Test
	void test() {
		assertEquals(5, getLastDigit(345));
	}

}
