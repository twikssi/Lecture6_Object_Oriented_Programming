package by.andrey.twikss.exe5creditcard.service;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CreditCardTest {
    CreditCard creditCard;

    @Before
    public void setUp(){
        creditCard = new CreditCard(4444_9999_8888_3245l,1234);
    }

    @Test
    public void depositReturnFalse() {
        creditCard.deposit(1000,1553);

        boolean expected = false;
        boolean actual = creditCard.getPinCode() == 1553;

        assertEquals(expected,actual);
    }

    @Test
    public void depositReturnTrue() {
        creditCard.deposit(1000,1234);

        boolean expected = true;
        boolean actual = creditCard.getPinCode() == 1234;

        assertEquals(expected,actual);
    }


}