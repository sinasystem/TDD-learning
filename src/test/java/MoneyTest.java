import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoneyTest {
    @Test
    void testAmountDollar(){
        Dollar five = new Dollar(5);
        assertEquals(5,five.amount);
    }
    @Test
    void testMultiplicationDollar(){
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10,five.amount);
    }
    @Test
    void testEqualDollar(){
        assertEquals(new Dollar(5),new Dollar(5));
        assertNotEquals(new Dollar(5),new Dollar(10));
    }
    @Test
    void testAmountFranc(){
        Franc five = new Franc(5);
        assertEquals(5,five.amount);
    }
    @Test
    void testMultiplicationFranc(){
        Franc five = new Franc(5);
        five.times(2);
        assertEquals(10,five.amount);
    }
    @Test
    void testEqualFranc(){
        assertEquals(new Franc(5),new Franc(5));
        assertNotEquals(new Franc(5),new Franc(10));
    }
}
