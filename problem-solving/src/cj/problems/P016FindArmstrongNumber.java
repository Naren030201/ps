package cj.problems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class P016FindArmstrongNumber {
	
	// Given an integer number, find if it is an Armstrong 
	// number or not. A number is an Armstrong number, if the 
	// sum of the cube of the digits is the same as the number.
	// Ex: 153 -> (1^3) + (5^3) + (3^3) = 1 + 125 + 27 = 153.
	private static boolean isArmstrongNumber(int number) {
		// write code here
		int sum=0;
		int check=number;
		while(check!=0) {
			int temp=check%10;
			int cube = temp*temp*temp;
			sum+=cube;
			check/=10;
		}
		if(sum==number) {
			return true;
		}
		return false;
	}

	@Test
	void test1() {
		assertTrue(isArmstrongNumber(153));
	}

	@Test
	void test2() {
		assertFalse(isArmstrongNumber(154));
	}

}
