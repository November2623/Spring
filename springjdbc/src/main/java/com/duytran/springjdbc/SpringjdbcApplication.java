package com.duytran.springjdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.duytran")
public class SpringjdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringjdbcApplication.class, args);
    }

}
