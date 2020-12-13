package com.czg.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "customFilter2", urlPatterns = {"/*"})
public class CustomFilter2 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("CustomFilter2 init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("CustomFilter2 doFilter 1");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("CustomFilter2 doFilter 2");
    }

    @Override
    public void destroy() {
        System.out.println("CustomFilter2 destroy");
    }

}