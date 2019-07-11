package com.rehkalainin.servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class DateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException
    {
        PrintWriter writer = resp.getWriter();
        writer.println("<html><head><meta charset=\"utf-8\"></head></html>");

        writer.println("<body><h1> Time : " + new Date()+ "</h1></body>");
        writer.flush();
        writer.close();
    }
}
