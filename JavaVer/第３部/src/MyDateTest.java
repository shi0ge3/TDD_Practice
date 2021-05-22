import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyDateTest {
	@Test
	void test() {
		assertEquals(new MyDate("28.2.02"), new MyDate("1.3.02").yesterday());
	}

}
