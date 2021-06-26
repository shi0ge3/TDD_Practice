package money;

class Bank {
    Money reduce(Expression source, String to) {
        Sum sum = (Sum) source;
        return Money(amount, to);
    }
}
