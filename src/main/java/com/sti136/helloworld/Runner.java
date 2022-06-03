package com.sti136.helloworld;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class Runner implements CommandLineRunner {
    @Override
    public void run(String... args) {
        System.out.println("Please run for testing command line runner!!");
    }
}
