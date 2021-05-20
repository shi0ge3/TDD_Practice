package 第３部;

import org.junit.jupiter.api.Test;

class DatabaseTest {

	@Test
	public void testOrderLookup() {
		Database db = new MockDatabase();
		db.expectQuery("SELECT order_no FROM Order WHERE cust_no = 123");
		db.returnResult(new String[] {"Order 2", "Order3"});
	}

}
