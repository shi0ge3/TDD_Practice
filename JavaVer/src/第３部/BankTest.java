package 第３部;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankTest {

	@Test
	void bankRate() {
		Bank bank = new Bank();
		bank.addRate("USD", "GBP", STANDARD_RATE);
		bank.commission(STANDARD_COMMISSION);
		Money result = bank.convert(new Note(100, "USD"), "GBP");
		assertEquals(new Note(49.25, "GBP"), result);
	}

}
