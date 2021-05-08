package 第３部;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TransactionTestTest {

	@Test
	void testCompleteTransaction(){
		assertTrue(reader.isClosed);
		assertEquals("abc", reply.contents());
	}
}
