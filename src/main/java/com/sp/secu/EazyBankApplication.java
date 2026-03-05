package com.sp.secu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.sp")
public class EazyBankApplication {

    public static void main(String[] args) {
        SpringApplication.run(EazyBankApplication.class, args);
    }

}
