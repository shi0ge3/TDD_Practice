import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalcTest {

	@Test
	void test() {
		assertEquals(4, plus(3, 1));
		assertEquals(7, plus(3, 4));
	}

	private int plus(int agend, int addend) {
		return agend + addend;
	}

	@Test
	public void testSum() {
		assertEquals(5, sum(5, new int[]{5}));
	}
	private int sum(int value, int[] values) {
		return value;
	}
}
