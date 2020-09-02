package by.andrey.twikss.exe1counter.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Counter {
    private Logger logger = LoggerFactory.getLogger(Counter.class);
    private int value;
    private int step;
    private final int MAX_COUNTER = 100;
    private final int MIN_COUNTER = 0;

    public Counter() {
        this.value = 0;
        this.step = 1;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (getValue() >= MIN_COUNTER && getValue() <= MAX_COUNTER){
            this.value = value;
        } else {
            logger.info("Value Counter can be between (0 - 100)");
        }

    }
}
