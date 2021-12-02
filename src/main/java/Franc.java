public class Franc {
    int amount;

    public Franc(int amount) {
        this.amount = amount;
    }

    public void times(int multiply){
        amount *= multiply;
    }

    @Override
    public boolean equals(Object object) {
        Franc franc = (Franc) object;
        return franc.amount == amount;
    }

}
