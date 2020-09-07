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

    @Test
    public void depositReturnPositiveBalance() {
        creditCard.deposit(1000.0,1234);

       double expected = 1000.0;
       double actual = creditCard.getBalance();

        assertEquals(expected,actual,0.009999999);
    }

    @Test
    public void depositReturnNegativeDept() {
        creditCard.setIndebtedness(3000.0);
        creditCard.deposit(1000.0,1234);


        double expected = 2000.0;
        double actual = creditCard.getIndebtedness();

        assertEquals(expected,actual,0.009999999);
    }

    @Test
    public void depositReturnPositiveBalanceAndNegatvieDept() {
        creditCard.setIndebtedness(3000.0);
        creditCard.deposit(4000.0,1234);



        double expected = 1000.0;
        double actual = creditCard.getBalance();

        assertEquals(expected,actual,0.009999999);

        expected = 0.0;
        actual = creditCard.getIndebtedness();

        assertEquals(expected,actual,0.009999999);
    }

    @Test
    public void depositReturnNZeroBalanceAndPositiveDept() {
        creditCard.setIndebtedness(3000.0);
        creditCard.deposit(2000.0,1234);



        double expected = 0.0;
        double actual = creditCard.getBalance();

        assertEquals(expected,actual,0.009999999);

        expected = 1000.0;
        actual = creditCard.getIndebtedness();

        assertEquals(expected,actual,0.009999999);
    }

    @Test
    public void depositReturnBalanceAndDeptZero() {
        creditCard.setIndebtedness(2000.0);
        creditCard.deposit(2000.0,1234);



        double expected = 0.0;
        double actual = creditCard.getBalance();

        assertEquals(expected,actual,0.009999999);

        expected = 0.0;
        actual = creditCard.getIndebtedness();

        assertEquals(expected,actual,0.009999999);
    }

}