import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.net.Socket;
import java.nio.Buffer;

import com.sun.security.ntlm.NTLMException;
import org.junit.jupiter.api.Test;

import com.sun.security.ntlm.Server;

class TransactionTestTest {

//	@Test
//	void testCompleteTransaction(){
//		Server writer = new Server(defaultPort(), "abc");
//		Socket reader = new Socket("localhost", defaultPort());
//		Buffer reply = reader.contents();
//		assertTrue(reader.isClosed);
//		assertEquals("abc", reply.contents());
//	}

	private String defaultPort() {
		return "abc";
	}
}
