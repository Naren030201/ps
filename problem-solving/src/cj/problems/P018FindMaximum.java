package cj.problems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class P018FindMaximum {
	// Given an array of integers, find the maximum.
	// Ex: { 5, 2, 8, 9, 3 } -> Maximum is 9
	// Hint: Closely look into the previous problem 
	//       code. Whatever lines that are repeating, 
	//       it needs to be included in a loop.
	private static int findMaximum(int[] numbers) {
		int max = numbers[0];
		
		// write code here
		int i;
		for(i=1;i<numbers.length;i++) {
			if(numbers[i]>max) {
				max=numbers[i];
			}
		}
		
		return max;
	}
	
	@Test
	void test1() {
		int[] numbers = { 5, 2, 8, 9, 3 };
		assertEquals(9, findMaximum(numbers));
	}

	@Test
	void test2() {
		int[] numbers = { 1, 3, 4, 5, 7, 8, 9 };
		assertEquals(9, findMaximum(numbers));
	}
}
