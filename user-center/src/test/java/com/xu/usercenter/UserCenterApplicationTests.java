package com.xu.usercenter;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.ZonedDateTime;

@SpringBootTest
class UserCenterApplicationTests {

    @Test
    void contextLoads() {
        System.out.println(ZonedDateTime.now());
    }

}
