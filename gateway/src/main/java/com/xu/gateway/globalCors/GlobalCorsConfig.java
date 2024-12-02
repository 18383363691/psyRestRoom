package com.xu.gateway.globalCors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

/**
 * @ClassName：GlobalCorsConfig
 * @Author: xuli
 * @Date: 2024/10/18 18:42
 * @Description: 跨域
 */
@Configuration
public class GlobalCorsConfig {
    @Bean
    public CorsWebFilter corsWebFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true); // 允许凭证请求
        config.addAllowedOrigin("*"); // 允许任何域进行跨域请求
        config.addAllowedHeader("*"); // 允许任何头进行跨域请求
        config.addAllowedMethod("*"); // 允许任何方法进行跨域请求
        source.registerCorsConfiguration("/**", config);
        // 是否允许携带cookie跨域
        config.setAllowCredentials(true);
        return new CorsWebFilter(source);
    }
}
