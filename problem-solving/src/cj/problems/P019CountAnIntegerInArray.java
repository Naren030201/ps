package cj.problems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class P019CountAnIntegerInArray {
	// Given an array of integers, find how many times 
	// a specific number is repeating.
	// Ex: { 5, 9, 2, 5 } -> If we take 5, it is repeating 2 times.
	private static int countIntegerInArray(int numberToFind, int[] numbers) {
		int count = 0;
		
		// include code here
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]==numberToFind) {
				count++;
			}
		}
		
		return count;
	}

	@Test
	void test() {
		int[] numbers = { 5, 9, 2, 5 };
		assertEquals(2, countIntegerInArray(5, numbers));
	}

}
