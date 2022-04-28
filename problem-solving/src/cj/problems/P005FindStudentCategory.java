package cj.problems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class P005FindStudentCategory {
	
	// Find the category of a student based on the 
	// score and the following conditions
	// 1. If score ranges from 0 to 34 - Very Poor
	// 2. If score ranges from 35 to 45 - Poor
	// 3. If score ranges from 46 to 59 - Below Average
	// 4. If score ranges from 60 to 69 - Average
	// 5. If score ranges from 70 to 85 - Above Average
	// 6. If score is above 85 - Topper
	
	private static String findCategory(int score) {
		String category = "";
		
		// Write code here to find the category. Use
		// relational operators, logical operators and 
		// nested if, else .. if statements
		if(score<=34) {
			category="Very Poor";
		}else if(score >34 && score<=45) {
			category="Poor";
		}else if(score>45&&score<=59) {
			category="Below Average";
		}else if (score>59 && score<=69) {
			category="Average";
		}else if(score>69&&score<85) {
			category="Above Average";
		}else if(score>85) {
			category="Topper";
		}
		
		return category;
	}

	@Test
	void test1() {
		assertEquals("Very Poor", findCategory(5));
	}

	@Test
	void test2() {
		assertEquals("Poor", findCategory(35));
	}

	@Test
	void test3() {
		assertEquals("Below Average", findCategory(59));
	}

	@Test
	void test4() {
		assertEquals("Average", findCategory(65));
	}

	@Test
	void test5() {
		assertEquals("Above Average", findCategory(71));
	}

	@Test
	void test6() {
		assertEquals("Topper", findCategory(87));
	}

}
