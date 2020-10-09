package com.czg.config;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.web.context.WebServerApplicationContext;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig {

    @Bean
    public WebServerFactoryCustomizer<ConfigurableWebServerFactory> customizer() {
        return new WebServerFactoryCustomizer<ConfigurableWebServerFactory>() {

            @Override
            public void customize(ConfigurableWebServerFactory factory) {
                factory.setPort(8099);
            }
        };
    }

    @Bean
    public ApplicationRunner runner(WebServerApplicationContext context) {
        return args -> {
            System.out.println("WebConfig----当前的Web容器实现类是:" + context.getWebServer().getClass().getName());
        };
    }
}
