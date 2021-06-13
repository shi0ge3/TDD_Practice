package money;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
* TODO
* $5 + 10 CHF = $10(レートが２：１の場合)
* amount を private にする。
* Money の丸め処理をどうする？
* hashCode()
* null との等価性比較
* 他のオブジェクトとの等価性比較
*/

public class MoneyTest {
    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        assertEquals(10, five.times(2));
        assertEquals(15, five.times(3));
    }
    @Test
    public void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }
}
