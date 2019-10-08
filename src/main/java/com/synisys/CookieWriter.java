package com.synisys;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/cookie")
public class CookieWriter extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        PrintWriter out = resp.getWriter();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                out.println("Cookie name: " + cookie.getName() + "value: " + cookie.getValue());
            }
        } else {
            Cookie cookie = new Cookie("name", "J");
            cookie.setMaxAge(30);
            resp.addCookie(cookie);
//            resp.setHeader("Set-Cookie", "namee=BBB; HttpOnly; SameSite=strict");
            out.println("New Cookie name: " + cookie.getName() + "value: " + cookie.getValue());
        }
    }
}
