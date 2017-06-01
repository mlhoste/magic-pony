package com.mlhoste.magicpony;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MagicPonyApplication {

    private static final Logger log = LoggerFactory.getLogger(MagicPonyApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(MagicPonyApplication.class, args);
    }
}
