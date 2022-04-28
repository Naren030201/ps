package cj.problems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class P011TruncateLastDigit {
	
	// Truncate the last digit of an integer number
	// Ex: 345 should return 34.
	// Hint: Check what happens when you divide an 
	//       integer number with 10.
	private static int truncateLastDigit(int number) {
		int numberWithoutLastDigit = 0;
		
		// write code here
		numberWithoutLastDigit=number/10;
		
		return numberWithoutLastDigit;
	}

	@Test
	void test1() {
		assertEquals(34, truncateLastDigit(347));
	}

}
