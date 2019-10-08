package com.synisys;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class WelcomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.getRequestDispatcher("a.html").forward(req, resp);
//        resp.sendRedirect("a.html");
//        String username = getServletContext().getInitParameter("username");
//        String password = getServletContext().getInitParameter("password");
//        String data = getServletConfig().getInitParameter("data");
        PrintWriter out = resp.getWriter();
//        out.println("<!DOCTYPE html>");
//        out.println("<html lang=\"en\">");
//        out.println("<head>");
//        out.println("<meta charset=\"UTF-8\">");
//        out.println("<title>Title</title>");
//        out.println("</head>");
//        out.println("<body>");
//        out.println("<h1>username: " + username + "</h1>");
//        out.println("<h1>password: " + password + "</h1>");
//        out.println("<h1>data: " + data + "</h1>");
//        out.println("</body>");
//        out.println("</html>");
        out.println("<h1>data:</h1>");

//        throw new ServletException();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
