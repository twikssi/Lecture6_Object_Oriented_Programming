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
    public void depositReturnFalsePincode() {
        creditCard.deposit(1000,1553);

        boolean expected = false;
        boolean actual = creditCard.getPinCode() == 1553;

        assertEquals(expected,actual);
    }

    @Test
    public void depositReturnTruePincode() {
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
    public void depositReturnPositiveBalanceAndZeroDept() {
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
    public void depositReturnZeroBalanceAndPositiveDept() {
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

    @Test
    public void withdrawReturnPincode() {
        creditCard.withdraw(3000,1234);

        int expected = 1234;
        int actual = creditCard.getPinCode();

        assertEquals(expected,actual);
    }

    @Test
    public void withdrawReturnFalse() {
        creditCard.withdraw(3000,1454);

        boolean expected = false;
        boolean actual = creditCard.getPinCode() == 1454;

        assertEquals(expected,actual);
    }

    @Test
    public void withdrawReturnPositiveBalance() {
        creditCard.deposit(4000,1234);
        creditCard.withdraw(3000,1234);

        double expected = 1000;
        double actual = creditCard.getBalance();

        assertEquals(expected,actual, 0.009999999);

        expected = 0.0;
        actual = creditCard.getIndebtedness();

        assertEquals(expected,actual, 0.009999999);
    }

    @Test
    public void withdrawReturnZeroBalance() {
        creditCard.deposit(3000,1234);
        creditCard.withdraw(2000,1234);
        creditCard.withdraw(1000,1234);

        double expected = 0;
        double actual = creditCard.getBalance();

        assertEquals(expected,actual, 0.009999999);
    }

    @Test
    public void withdrawReturnPositiveDeptAndZeroBalance() {
        creditCard.setCreditLimit(2000);
        creditCard.deposit(1000,1234);
        creditCard.withdraw(3000,1234);

        double expected = 0;
        double actual = creditCard.getBalance();

        assertEquals(expected,actual, 0.009999999);

        expected = 2000;
        actual = creditCard.getIndebtedness();

        assertEquals(expected,actual, 0.009999999);
    }

    @Test
    public void withdrawReturnDoubleValueDebt() {
        creditCard.setCreditLimit(2000);
        creditCard.withdraw(1000,1234);
        creditCard.withdraw(500,1234);
        creditCard.withdraw(501,1234);

        double expected = 1500;
        double actual = creditCard.getIndebtedness();

        assertEquals(expected,actual, 0.009999999);
    }

    @Test
    public void withdrawReturnSetNumberMoreThaneCreditLimit() {
        creditCard.setCreditLimit(2000);
        creditCard.withdraw(4000,1234);

        double expected = 0;
        double actual = creditCard.getIndebtedness();

        assertEquals(expected,actual, 0.009999999);
    }

    @Test
    public void withdrawReturnPositiveDepto() {
        creditCard.setCreditLimit(2000);
        creditCard.setIndebtedness(1000);
        creditCard.deposit(1000,1234);
        creditCard.withdraw(3000,1234);

        double expected = 0;
        double actual = creditCard.getIndebtedness();

        assertEquals(expected,actual, 0.009999999);

        creditCard.withdraw(1999.99,1234);

        expected = 1999.99;
        actual = creditCard.getIndebtedness();

        assertEquals(expected,actual, 0.009999999);

        creditCard.withdraw(0.01, 1234);
        expected = 2000.0;
        actual = creditCard.getIndebtedness();

        assertEquals(expected,actual, 0.009999999);
    }


}