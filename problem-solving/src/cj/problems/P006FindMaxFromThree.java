package cj.problems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class P006FindMaxFromThree {
	// Find the maximum of three numbers
	// Solution Hints: Write down any three numbers in 
	// a paper and manually find out the maximum number 
	// by comparing two numbers at a time. Use those
	// steps to implement the logic here.

	private static int max(int a, int b, int c) {
		int max = 0;
		
		// Write code here to find the maximum of three
		if(a>b&&a>c) {
			max=a;
		}else if(b>a&&b>c) {
			max=b;
		}else if(c>a&&c>b) {
			max=c;
		}
		
		return max;
	}

	@Test
	void test1() {
		assertEquals(7, max(7, 2, 3));
	}

	@Test
	void test2() {
		assertEquals(-11, max(-17, -11, -22));
	}

	@Test
	void test3() {
		assertEquals(9, max(-1, 5, 9));
	}

}
