package 第３部;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankTest {

	@Test
	void bankRate() {
		Bank bank = new Bank();
		bank.addRate("USD", "GBP", 2);
		bank.commission(0.015);
		Money result = bank.convert(new Note(100, "USD"), "GBP");
		assertEquals(new Note(100/2*(1-0.015), "GBP"), result);
	}

}
