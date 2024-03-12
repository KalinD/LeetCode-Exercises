package MoveZeroes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MoveZeroesTest {
	@Test
	void example1() {
		int[] nums = new int[] { 0, 1, 0, 3, 12 };
		MoveZeroes.moveZeroes(nums);
		assertArrayEquals(new int[] { 1, 3, 12, 0, 0 }, nums);
	}

	@Test
	void example2() {
		int[] nums = new int[] { 0};
		MoveZeroes.moveZeroes(nums);
		assertArrayEquals(new int[] { 0 }, nums);
	}
	
	@Test
	void example3() {
		int[] nums = new int[] { 0, 0, 1};
		MoveZeroes.moveZeroes(nums);
		assertArrayEquals(new int[] { 1, 0, 0}, nums);
	}
}
