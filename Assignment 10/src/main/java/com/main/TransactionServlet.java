package com.main;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class TransactionServlet extends HttpServlet {

    @EJB
    AccountBeanRemote accountBean;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().println("<h2>Servlet is working!</h2>");
        response.getWriter().println("<p>Current balance: $" + accountBean.getBalance() + "</p>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        double amount = Double.parseDouble(request.getParameter("amount"));

        if (accountBean == null) {
            response.getWriter().println("<h2>Error: EJB not injected!</h2>");
            return;
        }

        try {
            if ("deposit".equals(action)) {
                accountBean.deposit(amount);
            } else if ("withdraw".equals(action)) {
                accountBean.withdraw(amount);
            }

            double newBalance = accountBean.getBalance();

            response.setContentType("text/html");
            response.getWriter().println("<h2>Transaction Successful</h2>");
            response.getWriter().println("<p>New Balance: $" + newBalance + "</p>");

        } catch (Exception e) {
            response.setContentType("text/html");
            response.getWriter().println("<h2>Error: " + e.getMessage() + "</h2>");
        }
    }
}
