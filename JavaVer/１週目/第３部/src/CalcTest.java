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
		assertEquals(12, sum(new int[]{5, 7}));
	}
	private int sum(int[] values) {
		int sum = 0;
		for(int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}
