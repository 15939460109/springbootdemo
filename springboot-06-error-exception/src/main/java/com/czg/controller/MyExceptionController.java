package com.czg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyExceptionController {

    @RequestMapping("/testException")
    public String exception () throws Exception {
        throw new Exception("测试异常");
    }
}
