public class Dollar extends Money  {

    public Dollar(int amount) {
        this.amount = amount;
    }
    public Money times(int multiply){
        return new Dollar(amount*multiply);
    }
}
