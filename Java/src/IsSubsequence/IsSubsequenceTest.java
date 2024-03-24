package IsSubsequence;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IsSubsequenceTest {

	@Test
	void example1() {
		assertTrue(IsSubsequence.isSubsequence("abc", "ahbgdc"));
	}

	@Test
	void example2() {
		assertFalse(IsSubsequence.isSubsequence("axc", "ahbgdc"));
	}
	
	@Test
	void example3() {
		assertTrue(IsSubsequence.isSubsequence("", "ahbgdc"));
	}
}
