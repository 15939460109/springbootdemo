package com.czg.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "food")
@Getter@Setter
public class FoodConfig {

    private String rice;
    private String meat;
    private String[] sauce;

}
