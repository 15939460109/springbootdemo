package com.czg.controller;

import com.czg.event.CustomEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

    @Autowired
    //定义了一个事件发布类
    private ApplicationEventPublisher publisher;

    @GetMapping("/event")
    public String event() {
        //执行方法，发布事件
        publisher.publishEvent(new CustomEvent(this));
        return "Success";
    }
}
