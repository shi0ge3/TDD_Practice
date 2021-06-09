import static org.junit.jupiter.api.Assertions.*;

import java.net.Socket;
import java.nio.Buffer;

import org.junit.jupiter.api.Test;

import com.sun.security.ntlm.Server;

class TransactionTestTest {

	@Test
	void testCompleteTransaction(){
		Server writer = new Server(defaultPort(), "abc");
		Socket reader = new Socket("localhost", defaultPort());
		Buffer reply = reader.contents();
		assertTrue(reader.isClosed);
		assertEquals("abc", reply.contents());
	}
}
