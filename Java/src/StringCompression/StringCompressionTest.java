package StringCompression;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringCompressionTest {
	@Test
	void example1() {
		char[] chars = new char[] { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };
		assertEquals(6, StringCompression.compress(chars));
		assertArrayEquals(new char[] { 'a', '2', 'b', '2', 'c', '3', 'c' }, chars);
	}

	@Test
	void example2() {
		char[] chars = new char[] { 'a' };
		assertEquals(1, StringCompression.compress(chars));
		assertArrayEquals(new char[] { 'a' }, chars);
	}

	@Test
	void example3() {
		char[] chars = new char[] { 'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b' };
		assertEquals(4, StringCompression.compress(chars));
		assertArrayEquals(new char[] { 'a', 'b', '1', '2', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b' }, chars);
	}
}
