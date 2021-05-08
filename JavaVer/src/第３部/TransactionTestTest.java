package 第３部;

import static org.junit.jupiter.api.Assertions.*;

import java.net.Socket;
import java.nio.Buffer;

import org.junit.jupiter.api.Test;

class TransactionTestTest {

	@Test
	void testCompleteTransaction(){
		Socket reader = new Socket("localhost", defaultPort());
		Buffer reply = reader.contents();
		assertTrue(reader.isClosed);
		assertEquals("abc", reply.contents());
	}
}
