public class Money {

    protected int amount;

    public void times(int multiply){
        amount *= multiply;
    }

    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return money.amount == amount;
    }

}
