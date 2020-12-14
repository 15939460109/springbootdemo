package com.czg.endpoint;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Endpoint(id = "custom")
// @Endpoint注解 声明这个类是一个端点配置类，通过id属性来命名
@Component
// @Component注解 声明这是一个springboot配置类
public class CustomPoint {

    /**
     * 端点访问时的处理方法，通过@ReadOperation注解进行查找
     * 声明需要返回json数据，使用@ResponseBody注解
     * @return
     */
    @ReadOperation
    @ResponseBody
    public Map<String, String> custom() {
        Map<String, String> result = new HashMap<>();
        result.put("name", "hello custom endpoint");
        result.put("test", "hello");
        return result;
    }
}
