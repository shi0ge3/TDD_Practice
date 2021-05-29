import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {
    @Test
    public void testMultiplication() {
        Dollar five = Money.dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }
}

class Money {
    Money() {
    }

    static Dollar dollar(int i) {
        return new Dollar(i);
    }
}

class Dollar extends Money {
    int money = 0;

    Dollar(int money) {
        this.money = money;
    }

    int times(int rate) {
        return this.money * rate;
    }
}
