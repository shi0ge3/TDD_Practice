package money;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoneyTest {

	@Test
	public void testMultiplication() {
		Money five = Money.dollar(5);
		assertEquals(Money.dollar(10), five.times(2));
		assertEquals(Money.dollar(15), five.times(3));
	}
	@Test
	public void testEquality() {
		assertTrue(Money.dollar(5).equals(new Dollar(5)));
		assertFalse(Money.dollar(5).equals(new Dollar(6)));

		assertTrue(new Franc(5).equals(new Franc(5)));
		assertFalse(new Franc(5).equals(new Franc(6)));

		assertFalse(new Franc(5).equals(Money.dollar(5)));
	}
	@Test
	public void testFrancMultiplication() {
		Money five = new Franc(5);
		assertEquals(Money.franc(10), five.times(2));
		assertEquals(Money.franc(15), five.times(3));
	}

}
