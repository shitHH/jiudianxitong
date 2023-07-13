package com.hotel.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author xu
 * 字符集过滤器
 */
@WebFilter("*")
public class CharsetFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String charset="utf-8";
        servletRequest.setCharacterEncoding(charset);
        servletResponse.setCharacterEncoding(charset);
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
