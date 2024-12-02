package com.xu.bookstorecenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BookStoreCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookStoreCenterApplication.class, args);
    }

}
