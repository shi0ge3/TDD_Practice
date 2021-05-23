import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExchangeTest {
    @Test
    public void testRate() {
        Object exchange;
        exchange.addRate("USD", "GBP", 2);
        int rate = exchange.findRate("USD", "GBP");
        assertEquals(2, rate);
    }
}
