package com.czg;

import com.czg.listener.CustomListener1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EventListenerApplication {

    public static void main(String[] args) {
        //获取启动后的容器
        ConfigurableApplicationContext context = SpringApplication.run(EventListenerApplication.class, args);
        //加载自定义监听器
        context.addApplicationListener(new CustomListener1());
    }

}
