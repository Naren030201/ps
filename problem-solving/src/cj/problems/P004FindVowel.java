package cj.problems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class P004FindVowel {

	// Find whether a given character is a vowel or note
	private static boolean isVowel(char c) {
		boolean vowel = false;
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
			vowel=true;
		}
		return vowel;
	}

	@Test
	void test1() {
		assertEquals(true, isVowel('a'));
	}

	@Test
	void test2() {
		assertEquals(true, isVowel('e'));
	}

	@Test
	void test3() {
		assertEquals(true, isVowel('i'));
	}

	@Test
	void test4() {
		assertEquals(true, isVowel('o'));
	}

	@Test
	void test5() {
		assertEquals(true, isVowel('u'));
	}

	@Test
	void test6() {
		assertEquals(false, isVowel('k'));
	}

	@Test
	void test7() {
		assertEquals(false, isVowel('s'));
	}

}
