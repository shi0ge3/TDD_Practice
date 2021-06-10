package fibonacci;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {
    int fib(int n) {
        if(n == 0) return 0;
        return 1;
    }
    @Test
    public void testFibonacci() {
        assertEquals(1, fib(1));
    }
}
