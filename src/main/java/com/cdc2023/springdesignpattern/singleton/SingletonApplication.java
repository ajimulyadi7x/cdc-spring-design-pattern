package com.cdc2023.springdesignpattern.singleton;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SingletonApplication {

    @Bean
    public Counter counter() {
        return new Counter();
    }

}
