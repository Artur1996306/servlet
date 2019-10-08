package com.synisys;

import javax.servlet.*;
import java.io.IOException;

public class LoginFilter implements Filter {
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        if (request.getParameter("password") != null && !request.getParameter("password").equals("")) {
            chain.doFilter(request, response);
        } else {
            request.getRequestDispatcher("index.html").forward(request, response);
        }
    }
}
