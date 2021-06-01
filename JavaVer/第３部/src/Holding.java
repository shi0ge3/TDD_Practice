public interface Holding {
    public Money balance();
}

public class Transaction implements Holding {
    public Money balance() {
        Money value = new Money();
        return value;
    }
}

class Account implements Holding {
    Holding[] holdings;
    public Money balance() {
        Money sum = Money.zero();
        for (int i = 0; i < holdings.length; i++) {
            sum = sum.plus(holdings[i].balance());
        }

        return sum;
    }
}
