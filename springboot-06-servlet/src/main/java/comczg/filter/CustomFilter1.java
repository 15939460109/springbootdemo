package comczg.filter;

import javax.servlet.*;
import java.io.IOException;

public class CustomFilter1 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("CustomFilter1 init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("CustomFilter1 doFilter 1");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("CustomFilter1 doFilter 2");
    }

    @Override
    public void destroy() {
        System.out.println("CustomFilter1 destroy");
    }

}
