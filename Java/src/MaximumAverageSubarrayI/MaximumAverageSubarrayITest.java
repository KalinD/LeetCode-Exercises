package MaximumAverageSubarrayI;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MaximumAverageSubarrayITest {

	@Test
	void example1() {
		int[] nums = new int[] { 1, 12, -5, -6, 50, 3 };
		assertEquals(12.75, MaximumAverageSubarrayI.findMaxAverage(nums, 4), 1e-5);
	}

	@Test
	void example2() {
		int[] nums = new int[] { 5 };
		assertEquals(5, MaximumAverageSubarrayI.findMaxAverage(nums, 1), 1e-5);
	}

	@Test
	void example3() {
		int[] nums = new int[] { 0, 1, 1, 3, 3 };
		assertEquals(2, MaximumAverageSubarrayI.findMaxAverage(nums, 4), 1e-5);
	}

	@Test
	void example4() {
		int[] nums = new int[] { 0, 4, 0, 3, 2 };
		assertEquals(4, MaximumAverageSubarrayI.findMaxAverage(nums, 1), 1e-5);
	}
}
