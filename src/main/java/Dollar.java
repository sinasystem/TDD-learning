public class Dollar extends Money  {

    public Dollar(int amount,String currency) {
        super(amount,currency);
    }
    public Money times(int multiply){
        return Money.dollar(amount*multiply);
    }
}
