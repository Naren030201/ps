package cj.problems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class P015CubeOfDigits {

	// Given an integer number, find the cube of each digit.
	// Ex -> 152 - (1 ^ 3), (5 ^ 3), (2 ^ 3) = 1, 125, 8.
	// Hint: 1. Count the number of digits and create an array based on
	// the number of digits.
	// 2. Split the digits, then cube the number and
	// store them in the array in the respective position.
	private static int[] cubeOfDigits(int number) {
		int count = 0;
		int check = number;
		while (check != 0) {
			int temp = check % 10;
			count++;
			check = check / 10;
		}
		int[] numbers = new int[count];
		while (number != 0 & count >= 0) {
			int temp = number % 10;
			int cube = temp * temp * temp;
			numbers[count - 1] = cube;
			count--;
			number /= 10;
		}
		return numbers;
	}

	@Test
	void test() {
		int[] numbers = { 1, 125, 8 };
		assertArrayEquals(numbers, cubeOfDigits(152));
	}

}
