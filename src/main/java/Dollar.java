import java.util.Objects;

public class Dollar {
    int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public void times(int multiply){
        amount *= multiply;
    }

    @Override
    public boolean equals(Object object) {
        Dollar dollar = (Dollar) object;
        return dollar.amount == amount;
    }

}
