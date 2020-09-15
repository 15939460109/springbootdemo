package com.czg;

import com.czg.config.FoodConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({FoodConfig.class})
public class DemoApplication2 {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication2.class, args);
    }
}
