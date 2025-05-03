<%@ page import="java.util.*" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html>
    <body>
        <%
            if(session.getAttribute("user") == null){
        %>
        <jsp:forward page="login.jsp" />
        <%
            } else {
        %>
        <h3> Welcome <%= session.getAttribute("user") %>! </h3>
        <p> Today's date is <%= new Date() %> </p>
        <a href="logout.jsp"> Logout </a>
        <%
            }
        %>
    </body>
</html>