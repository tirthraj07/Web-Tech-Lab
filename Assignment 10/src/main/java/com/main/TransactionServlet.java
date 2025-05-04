package com.main;

import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/transaction")
public class TransactionServlet extends HttpServlet {

    @EJB
    AccountBeanRemote accountBean;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        double amount = Double.parseDouble(request.getParameter("amount"));

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
