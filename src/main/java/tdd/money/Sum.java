package tdd.money;

public class Sum implements Expression{
    Money augmend;
    Money addmend;

    public Sum(Money augmend, Money addmend) {
        this.augmend = augmend;
        this.addmend = addmend;
    }
    @Override
    public Money reduce(Bank bank,String to){
        int amount =augmend.reduce(bank, to).amount + addmend.reduce(bank, to).amount;
        return new Money(amount,to);
    }
}
