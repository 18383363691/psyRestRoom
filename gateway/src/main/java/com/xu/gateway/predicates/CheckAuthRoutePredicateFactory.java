package com.xu.gateway.predicates;

import jakarta.validation.constraints.NotEmpty;
import org.springframework.cloud.gateway.handler.predicate.AbstractRoutePredicateFactory;
import org.springframework.cloud.gateway.handler.predicate.GatewayPredicate;
import org.springframework.cloud.gateway.handler.predicate.QueryRoutePredicateFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.server.ServerWebExchange;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/**
 * @ClassName：CheckAuthRoutePredicateFactory
 * @Author: xuli
 * @Date: 2024/10/18 17:28
 * @Description: 必须描述类做什么事情, 实现什么功能
 */
@Component
public class CheckAuthRoutePredicateFactory extends AbstractRoutePredicateFactory<CheckAuthRoutePredicateFactory.Config> {


    public CheckAuthRoutePredicateFactory() {
        super(Config.class);
    }

    public List<String> shortcutFieldOrder() {
        return Arrays.asList("name");
    }

    public Predicate<ServerWebExchange> apply(final CheckAuthRoutePredicateFactory.Config config) {
        return new GatewayPredicate() {
            public boolean test(ServerWebExchange exchange) {
                      if(config.getName().equals("xu")){
                          return true;
                      }
                        return false;
            }

            public Object getConfig() {
                return config;
            }

        };
    }
   //用于接收配置文件的值
    @Validated
    public static class Config {
        private String name;
        public Config() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
