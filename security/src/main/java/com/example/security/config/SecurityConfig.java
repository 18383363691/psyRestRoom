package com.example.security.config;

import org.springframework.security.config.annotation.SecurityBuilder;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;

/**
 * @ClassName：SecurityConfig
 * @Author: xuli
 * @Date: 2024/10/21 22:22
 * @Description: 必须描述类做什么事情, 实现什么功能
 */
public class SecurityConfig implements WebSecurityConfigurer {
    @Override
    public void init(SecurityBuilder builder) throws Exception {

    }

    @Override
    public void configure(SecurityBuilder builder) throws Exception {

    }
}
