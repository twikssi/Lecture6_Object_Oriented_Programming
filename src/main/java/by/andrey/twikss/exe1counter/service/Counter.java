package by.andrey.twikss.exe1counter.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Counter {
    private Logger logger = LoggerFactory.getLogger(Counter.class);
    private int value;
    private int step;

    public Counter() {
        this.value = 0;
        this.step = 1;
    }


}
