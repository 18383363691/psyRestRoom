package com.xu.bookstorecenter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName：BookStoreController
 * @Author: xuli
 * @Date: 2024/10/18 16:26
 * @Description: 必须描述类做什么事情, 实现什么功能
 */
@RestController
@RequestMapping("/bookStore")
public class BookStoreController {
    @GetMapping("/sayHi")
    public String sayHello(){
        return "welcome to bookStoreService";
    }
}
