public class Franc extends Money {

    public Franc(int amount) {
        this.amount = amount;
    }
    public Money times(int multiply){
        return new Franc(amount*multiply);
    }
}
