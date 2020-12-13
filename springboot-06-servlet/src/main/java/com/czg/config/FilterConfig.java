package com.czg.config;

import com.czg.filter.CustomFilter1;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<CustomFilter1> filterRegistrationBean() {
        FilterRegistrationBean<CustomFilter1> filter1FilterRegistrationBean = new FilterRegistrationBean<>();
        filter1FilterRegistrationBean.setFilter(new CustomFilter1());
        filter1FilterRegistrationBean.addUrlPatterns("/*");
        //决定注册的优先级
        //filter1FilterRegistrationBean.setOrder(0);
        return filter1FilterRegistrationBean;
    }

}
