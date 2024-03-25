package MaxNumberOfKSumPairs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MaxNumberOfKSumPairsTest {

	@Test
	void example1() {
		assertEquals(2, MaxNumberOfKSumPairs.maxOperations(new int[] { 1, 2, 3, 4 }, 5));
	}

	@Test
	void example2() {
		assertEquals(1, MaxNumberOfKSumPairs.maxOperations(new int[] { 3, 1, 3, 4, 3 }, 6));
	}
	
	@Test
	void example3() {
		assertEquals(2, MaxNumberOfKSumPairs.maxOperations(new int [] {4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4}, 2));
	}
}
