import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ExchangeTest {
    @Test
    public void testRate() {
        Object exchange = null;
        exchange.addRate("USD", "GBP", 2);
        int rate = exchange.findRate("USD", "GBP");
        assertEquals(2, rate);
    }
}
@Test
public void testMissingRate() {
    try {
        Object exchange = null;
        exchange.findRate("USD", "GBP");
        fail();
    } catch (IllegalArgumentException expected) {

    }
}
