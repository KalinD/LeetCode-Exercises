package MaxConsecutiveOnesIII;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaxConsecutiveOnesIIITest {

	@Test
	void example1() {
		int[] nums = new int[] { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
		int k = 2;
		int res = MaxConsecutiveOnesIII.longestOnes(nums, k);
		assertEquals(6, res);
	}

	@Test
	void example2() {
		int[] nums = new int[] { 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1 };
		int k = 3;
		int res = MaxConsecutiveOnesIII.longestOnes(nums, k);
		assertEquals(10, res);
	}

	@Test
	void example3() {
		int[] nums = new int[] { 0, 0, 0, 1 };
		int k = 4;
		int res = MaxConsecutiveOnesIII.longestOnes(nums, k);
		assertEquals(4, res);
	}

	@Test
	void example4() {
		int[] nums = new int[] { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1 };
		int k = 0;
		int res = MaxConsecutiveOnesIII.longestOnes(nums, k);
		assertEquals(4, res);
	}
}
