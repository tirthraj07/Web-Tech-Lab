package com.main;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.concurrent.atomic.AtomicInteger;

public class VisitorCountServlet extends HttpServlet {
    // Using java Concurrent API (New) -> Fast
    /*
    private final AtomicInteger count = new AtomicInteger(0);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        int visitor = count.getAndIncrement();
        res.getWriter().println("<html></body><h1> Visitor Count: "+ visitor +"</h1></body></html>");
    }
    */


    // Using Synchronized -> Slow
    int count = 0;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        synchronized (this){
            count += 1;
            res.getWriter().println("<html></body><h1> Visitor Count: "+ count +"</h1></body></html>");
        }
    }

}
