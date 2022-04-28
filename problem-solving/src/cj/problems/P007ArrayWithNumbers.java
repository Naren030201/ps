package cj.problems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class P007ArrayWithNumbers {
	
	// Create an array having numbers from 1 to n
	private static int[] generateNumbers(int n) {
		int[] numbers = new int[n];
		
		// Using while loop define the values of the 
		// numbers starting from 1 to n.
		int i=0;
		int num=1;
		while(i<n&&num<=n) {
			numbers[i]=num;
			num++;
			i++;
		}
		
		return numbers;
	}

	@Test
	void test() {
		int[] numbers = {1, 2, 3, 4, 5};
		assertArrayEquals(numbers, generateNumbers(5));
		
	}

}
