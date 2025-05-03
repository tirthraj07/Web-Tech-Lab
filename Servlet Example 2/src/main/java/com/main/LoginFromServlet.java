package com.main;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class LoginFromServlet extends HttpServlet {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/servlet_example_2";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "tirthraj07";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        boolean isValidUser = checkCredentials(name, password);
        if (isValidUser) {
            out.println("<h3>Login Successful!</h3>");
        } else {
            out.println("<h3>Login Failed. Invalid username or password.</h3>");
        }
    }


    private boolean checkCredentials(String name, String password) {
        boolean isValid = false;
        Connection connection = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {

            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);

            String sql = "SELECT * FROM users WHERE name = ? AND password = ?";
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, name);
            stmt.setString(2, password);

            rs = stmt.executeQuery();

            // If a record is found, the credentials are correct
            if (rs.next()) {
                isValid = true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return isValid;
    }

}
