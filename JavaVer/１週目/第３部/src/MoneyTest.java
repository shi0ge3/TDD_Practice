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
        assertEquals("+\n\t5 US\n\t7 CHF", sum.toString());
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
        IndentingStream writer = new IndentingStream();
        toString(writer);
        return writer.contents;
    }

    void toString(IndentingStream writer) {
        writer.println("+");
        writer.indent();
        augend.toString(writer);
        writer.println();
        addend.toString(writer);
        writer.exdent();
    }
}

class IndentingStream {
    public String contents;

    public void println() {
    }

    public void indent() {
    }

    public void exdent() {
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
