package by.andrey.twikss.exe1counter.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {
    Counter counter;

    @Test
    public void setValueReturnNumberBetweenOneAndHunred() {
        counter = new Counter();
        counter.setValue(45);

        int expected = 45;
        int actual = counter.getValue();

        assertEquals(expected, actual);
    }

    @Test
    public void setValueReturnNothing() {
        counter = new Counter();
        counter.setValue(123523);

        int expected = 0;
        int actual = counter.getValue();

        assertEquals(expected, actual);
    }

    @Test
    public void setValueReturnMinimalCounter() {
        counter = new Counter();
        counter.setValue(89);
        counter.setValue(0);

        int expected = 0;
        int actual = counter.getValue();

        assertEquals(expected, actual);
    }

    @Test
    public void setValueReturnMaximalCounter() {
        counter = new Counter();
        counter.setValue(100);

        int expected = 100;
        int actual = counter.getValue();

        assertEquals(expected, actual);
    }
}