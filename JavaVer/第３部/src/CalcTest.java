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
}
