package money;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
* TODO
* $5 + 10 CHF = $10(レートが２：１の場合)
* $5 + $5 = $10
* Money の丸め処理をどうする？
* hashCode()
* null との等価性比較
* 他のオブジェクトとの等価性比較
* DollarとFrancの重複
* timesの一般化
* 通貨の概念
* testFrancMultiplicationを削除する？
*/

public class MoneyTest {
    @Test
    public void testMultiplication() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }
    @Test
    public void testEquality() {
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));

        assertFalse(Money.franc(5).equals(Money.dollar(5)));
    }
    @Test
    public void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }
    @Test
    public void testSimpleAddition() {
        Money sum = Money.dollar(5).plus(Money.dollar(5));
        assertEquals(Money.dollar(10), sum);

        Expresson sum = five.plus(five);
        Bank bank = new Bank();
        Money reduced = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(10), reduced);
    }
}
