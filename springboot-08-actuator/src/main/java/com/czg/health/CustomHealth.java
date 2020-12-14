package com.czg.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealth implements HealthIndicator {

    @Override
    public Health health() {
        int errorCode = 1;
        if (errorCode != 0) {
            return Health.down().withDetail("errorCOde", errorCode).build();
        }
        return Health.up().build();
    }
}
