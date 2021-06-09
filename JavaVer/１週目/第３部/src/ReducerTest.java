import org.junit.jupiter.api.Test;

import java.awt.*;
import java.net.Socket;

class Reducer {
	Reducer(Polygon polygon){
	}
}

class ReducerTest {
	Reducer reducer = new Reducer(new Polygon());
	@Test
	void test() {
		assertEquals(0, reducer, result().npoints);
	}
	Socket socket = new Socket();
	String message = "hello";
	socket.write(message);
	assertEquals(message, socket.read());
}
