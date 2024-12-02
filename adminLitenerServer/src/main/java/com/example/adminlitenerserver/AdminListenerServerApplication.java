package com.example.adminlitenerserver;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class AdminListenerServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminListenerServerApplication.class, args);
    }

}
