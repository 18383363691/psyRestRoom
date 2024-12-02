package com.xu.usercenter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName：UserController
 * @Author: xuli
 * @Date: 2024/10/18 16:01
 * @Description: 必须描述类做什么事情, 实现什么功能
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/sayHi")
    public String sayHello(){
        System.out.println("欢迎访问用户服务");
        return "this is userService";
    }

    /**
     * 这个方法用于测试
     * @return
     */
    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
