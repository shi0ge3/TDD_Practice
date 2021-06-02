import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {
    @Test
    public void testMultiplication() {
        Dollar five = Money.dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }
    @Test
    public void testSumPrinting() {
        Sum sum = new Sum(Money.dollar(5), Money.franc(7));
        assertEquals("5 USD + 7 CHF", sum.toString());
    }
}

class Money {
    Money() {
    }

    static Dollar dollar(int i) {
        return new Dollar(i);
    }

    public static Money zero() {
        return new Money();
    }

    public static Object franc(int i) {
        return new Object();
    }

    public Money plus(Money balance) {
        return new Money();
    }
}

class Sum {
    private String augend, addend;

    Sum(Object dollar, Object franc){}

    public String toString() {
        return augend + " + " + addend;
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
