package com.muravev.bigdataproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class BigDataProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BigDataProducerApplication.class, args);
    }

}
