package cj.problems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class P003VoteEligibilityCheck {
	
	// If 18 is the minimum age to vote, implement the 
	// below function that return true or false based on 
	// the age.
	
	private static boolean isEligibleToVote(int age) {
		boolean eligibleToVote = false;
		
		// write to code to find vote eligibility
		if(age>=18) {
			eligibleToVote=true;
		}
		else {
		eligibleToVote=false;
		}
		return eligibleToVote;
	}

	@Test
	void test1() {
		assertEquals(false, isEligibleToVote(10));
	}

	@Test
	void test2() {
		assertEquals(false, isEligibleToVote(5));
	}

	@Test
	void test3() {
		assertEquals(true, isEligibleToVote(18));
	}

	@Test
	void test4() {
		assertEquals(true, isEligibleToVote(25));
	}

}
