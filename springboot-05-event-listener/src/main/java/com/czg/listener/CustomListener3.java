package com.czg.listener;

import com.czg.event.CustomEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class CustomListener3 {

    @EventListener
    public void onApplicationEvent(CustomEvent customEvent) {
        customEvent.printMessage("CustomListener3监听到了");
    }
}
