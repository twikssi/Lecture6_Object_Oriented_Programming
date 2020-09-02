package by.andrey.twikss.exe1counter.service;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {
    Counter counter;

    @Before
    public void setUp(){
        counter = new Counter();
    }

    @Test
    public void setValueReturnNumberBetweenOneAndHunred() {
        counter.setValue(45);

        int expected = 45;
        int actual = counter.getValue();

        assertEquals(expected, actual);
    }

    @Test
    public void setValueReturnNothing() {
        counter.setValue(123523);

        int expected = 0;
        int actual = counter.getValue();

        assertEquals(expected, actual);
    }

    @Test
    public void setValueReturnMinimalCounter() {
        counter.setValue(89);
        counter.setValue(0);

        int expected = 0;
        int actual = counter.getValue();

        assertEquals(expected, actual);
    }

    @Test
    public void setValueReturnMaximalCounter() {
        counter.setValue(100);

        int expected = 100;
        int actual = counter.getValue();

        assertEquals(expected, actual);
    }

    @Test
    public void setStepReturnNumberBetweenOneAndTen() {
        counter.setStep(5);

        int expected = 5;
        int actual = counter.getStep();

        assertEquals(expected, actual);
    }

    @Test
    public void setStepReturnLoggerMessage() {
        counter.setStep(-435);

        int expected = 1;
        int actual = counter.getStep();

        assertEquals(expected, actual);
    }

    @Test
    public void setStepReturnEdgeNumberTen() {
        counter.setStep(10);

        int expected = 10;
        int actual = counter.getStep();

        assertEquals(expected, actual);
    }
}