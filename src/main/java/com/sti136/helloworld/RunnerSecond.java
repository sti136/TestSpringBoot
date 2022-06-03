package com.sti136.helloworld;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class RunnerSecond implements CommandLineRunner {
    @Override
    public void run(String... args) {
        System.out.println("Yes We can!!");
    }
}
