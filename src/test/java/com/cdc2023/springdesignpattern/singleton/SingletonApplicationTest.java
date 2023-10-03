package com.cdc2023.springdesignpattern.singleton;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = SingletonApplication.class)
class SingletonApplicationTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testCounter() {
        Counter counter1 = applicationContext.getBean(Counter.class);
        Counter counter2 = applicationContext.getBean(Counter.class);
        Counter counter3 = applicationContext.getBean(Counter.class);

        counter1.increment();
        counter2.increment();
        counter3.increment();

        System.out.println(counter1.getValue());
        System.out.println(counter2.getValue());
        System.out.println(counter3.getValue());

        assertSame(counter1, counter2);
        assertSame(counter1, counter3);
    }

    @Test
    void testParallelIncrementRaceCondition() throws InterruptedException {
        Counter counter1 = applicationContext.getBean(Counter.class);
        Counter counter2 = applicationContext.getBean(Counter.class);

        incrementCounterAsync(counter1, 1000);
        incrementCounterAsync(counter2, 1000);

        Thread.sleep(5000L);

        System.out.println(counter1.getValue());
        System.out.println(counter2.getValue());

    }

    private void incrementCounterAsync(Counter counter, int times) {
        new Thread(() -> {
            for (int i = 0; i < times; i++) {
                counter.increment();
            }
        }).start();
    }
}