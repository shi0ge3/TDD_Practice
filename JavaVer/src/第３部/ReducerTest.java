package 第３部;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

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
