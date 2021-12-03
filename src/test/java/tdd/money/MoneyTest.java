package tdd.money;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoneyTest {
    @Test
    void testAmount(){
        Money fiveDollar = Money.dollar(5);
        assertEquals(5,fiveDollar.amount);

        Money fiveFranc = Money.franc(5);
        assertEquals(5,fiveFranc.amount);
    }
    @Test
    void testMultiplication(){
        Money fiveDollar = Money.dollar(5);
        assertEquals(Money.dollar(10),fiveDollar.times(2));
        assertEquals(Money.dollar(15),fiveDollar.times(3));

        Money fiveFranc = Money.franc(5);
        assertEquals(Money.franc(10),fiveFranc.times(2));
        assertEquals(Money.franc(15),fiveFranc.times(3));
    }
    @Test
    void testEquality(){
        assertEquals(Money.dollar(5),Money.dollar(5));
        assertNotEquals(Money.dollar(5),Money.dollar(10));

        assertEquals(Money.franc(5),Money.franc(5));
        assertNotEquals(Money.franc(5),Money.franc(10));

        assertNotEquals(Money.franc(5),Money.dollar(5));

    }
    @Test
    void testCurrency(){
        assertEquals("USD",Money.dollar(1).currency());
        assertEquals("CHF",Money.franc(1).currency());
    }
}
