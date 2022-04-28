package cj.problems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class P002FindMaxOfTwo {
	
	// Find the maximum of two numbers and return the maximum value.
	
	private static int findMax(int a, int b) {
		int max = 0;
		if(a>b) {
			max=a;
		}else {
			max=b;
		}
		return max;
	}

	@Test
	void test1() {
		assertEquals(7, findMax(1, 7));
	}

	@Test
	void test2() {
		assertEquals(-10, findMax(-10, -20));
	}

}
