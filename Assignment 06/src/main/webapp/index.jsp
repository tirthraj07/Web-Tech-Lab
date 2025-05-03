<%@ page import="java.sql.*" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html>
<body>
    <%@ include file="header.jsp" %>


    <%!
         public static final String JDBC_URL = "jdbc:mysql://localhost:3306/student_db";
         public static final String JDBC_USER = "root";
         public static final String JDBC_PASSWORD = "tirthraj07";
         public Connection conn = null;
         public Statement stmt = null;
         public ResultSet rs = null;
         public String sql = null;
    %>

    <%
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASSWORD);
            sql = "SELECT * FROM students_info";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
    %>

        <table>
               <tr>
                   <th>ID</th>
                   <th>Name</th>
                   <th>Class</th>
                   <th>Division</th>
                   <th>City</th>
               </tr>

    <%
            while(rs.next()) {
    %>
                <tr>
                    <td><%= rs.getInt("stud_id") %></td>
                    <td><%= rs.getString("stud_name") %></td>
                    <td><%= rs.getString("class") %></td>
                    <td><%= rs.getString("division") %></td>
                    <td><%= rs.getString("city") %></td>
                </tr>
    <%
            }
        } catch(Exception e) {
            out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
        } finally {
            if(rs != null) rs.close();
            if(stmt != null) stmt.close();
            if(conn != null) conn.close();
        }
    %>
        </table>

    <%@ include file="footer.jsp" %>
</body>
</html>