package cj.problems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class P014SumOfDigits {
	
	// Given an integer number. Find the sum of digits.
	// Ex: 34827 -> 3 + 4 + 8 + 2 + 7 = 24
	// Hints: Split the digits from a number and add them using loop.
	private static int sumOfDigits(int number) {
		int sum = 0;
		
		// write code here
		while(number!=0) {
			int temp=number%10;
			sum+=temp;
			number/=10;
		}
		
		return sum;
	}

	@Test
	void test() {
		assertEquals(24, sumOfDigits(34827));
	}

}
