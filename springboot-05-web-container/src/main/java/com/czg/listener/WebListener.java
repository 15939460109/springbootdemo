package com.czg.listener;

import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class WebListener {

    @EventListener(WebServerInitializedEvent.class)
    public void onWebServeReady(WebServerInitializedEvent event) {
        System.out.println("WebListener----当前的Web容器实现类是:" + event.getWebServer().getClass().getName());
    }
}
