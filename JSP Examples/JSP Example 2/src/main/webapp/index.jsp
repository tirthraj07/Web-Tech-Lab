<!-- index.jsp -->

<%-- Directive Tags --%>

<%-- Importing Classes --%>
<%@ page import="java.util.*" %>
<%-- Setting Content Type --%>
<%@ page contentType="text/html; charset=UTF-8" %>

<html>
    <body>
        <%-- Including a Common Header File --%>
        <%@ include file="header.jsp" %>

            <%-- Declaration Tag --%>
            <%!
                int a = 10;
                int b = 20;
                public int add(){
                    return a + b;
                }
            %>

            <%-- Expression Tag --%>
            <h1> Welcome to My JSP Page </h1>
            <p> Todays date is <%= new Date() %> </p>
            <br>

            <%= a %>
            <br>
            <%= b %>
            <br> 
            <h3> SUM = <%= add() %> </h3>
            <br><br>
            <h2>Count from 1 to 50</h2>
            
            <%-- Scriptlet Tag --%>
            <%
                for(int i=1; i<=50; i++){
                    out.println(i);
                }
            %>

            <br><br>

        <%@ include file="footer.jsp" %>

    </body>
</html>