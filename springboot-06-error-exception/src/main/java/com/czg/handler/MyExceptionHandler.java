package com.czg.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ModelAndView handler (Exception e) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/exception");
        modelAndView.addObject("message", e.getMessage());
        return modelAndView;
    }
}
