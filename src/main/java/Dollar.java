public class Dollar extends Money  {

    public Dollar(int amount,String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    protected String currency() {
        return currency;
    }

    public Money times(int multiply){
        return Money.dollar(amount*multiply);
    }
}
