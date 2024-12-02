package com.xu.gateway.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @ClassName：LogFilter
 * @Author: xuli
 * @Date: 2024/10/18 18:16
 * @Description: 必须描述类做什么事情, 实现什么功能
 */
@Component
public class LogFilter implements GlobalFilter {
    Logger logger= LoggerFactory.getLogger(LogFilter.class);
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        logger.info("请求路径:"+exchange.getRequest().getRemoteAddress().getHostName()+exchange.getRequest().getPath().value());
        return chain.filter(exchange);
    }
}
