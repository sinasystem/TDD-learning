public class Franc extends Money {

    public Franc(int amount,String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    protected String currency() {
        return currency;
    }

    public Money times(int multiply){
        return Money.franc(amount*multiply);
    }
}
