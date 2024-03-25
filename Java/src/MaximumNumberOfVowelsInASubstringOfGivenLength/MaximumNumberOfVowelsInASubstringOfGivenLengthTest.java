package MaximumNumberOfVowelsInASubstringOfGivenLength;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MaximumNumberOfVowelsInASubstringOfGivenLengthTest {

	@Test
	void examle1() {
		String s = "abciiidef";
		int k = 3;
		int res = MaximumNumberOfVowelsInASubstringOfGivenLength.maxVowels(s, k);
		assertEquals(3, res);
	}

	
	@Test
	void examle2() {
		String s = "aeiou";
		int k = 2;
		int res = MaximumNumberOfVowelsInASubstringOfGivenLength.maxVowels(s, k);
		assertEquals(2, res);
	}
	
	@Test
	void examle3() {
		String s = "leetcode";
		int k = 3;
		int res = MaximumNumberOfVowelsInASubstringOfGivenLength.maxVowels(s, k);
		assertEquals(2, res);
	}
}
