package cj.problems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class P017FindMaxOfFour {
	
	// Find the maximum of the given four integers.
	// ############################################
	// ### The solution code should not define  ###
	// ### any additional variable.             ###
	// ############################################
	
	private static int max(int a, int b, int c, int d) {
		int max = 0;
		
		// Write code here to find the maximum of three.
		if(a>b&&a>c&&a>d) {
			max=a;
		}
		else if(b>a&&b>c&&b>d) {
			max=b;
		}else if(c>a&&c>b&&c>d) {
			max=c;
		}else {
			max=d;
		}
		return max;
	}

	@Test
	void test() {
		assertEquals(98, max(25, 32, 98, 44));
	}

}
