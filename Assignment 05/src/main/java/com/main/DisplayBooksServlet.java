package com.main;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class DisplayBooksServlet extends HttpServlet {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/bookdb";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "tirthraj07";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        res.setContentType("text/html");
        try{
            PrintWriter out = res.getWriter();
            Connection conn = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS);
            Statement stmt = conn.createStatement();

            String sql = "SELECT * FROM ebookshop";
            ResultSet resultSet = stmt.executeQuery(sql);

            out.println("<html><body><h2>Book List</h2><table border='1'>");
            out.println("<tr><th>ID</th><th>Title</th><th>Author</th><th>Price</th><th>Quantity</th></tr>");

            while(resultSet.next()){
                out.println(
                    "<tr>"
                        + "<td>" + resultSet.getInt("book_id") + "</td>"
                        + "<td>" + resultSet.getString("book_title") + "</td>"
                        + "<td>" + resultSet.getString("book_author") + "</td>"
                        + "<td>" + resultSet.getDouble("book_price") + "</td>"
                        + "<td>" + resultSet.getInt("quantity") + "</td>"
                    + "</tr>"
                );
            }

            out.println("</table></body></html>");
            conn.close();
        }
        catch(SQLException sqlException){
            System.out.println("DB Error: " + sqlException.getMessage());
        }
        catch(Exception e){
            System.out.println("Exception occurred" + e.getMessage());
        }
    }
}
