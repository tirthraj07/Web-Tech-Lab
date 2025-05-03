<%@ page contentType="text/html; charset=UTF-8" %>
<%
    String name = request.getParameter("name");
    if (name != null && !name.trim().equals("")) {
        session.setAttribute("user", name);
        response.sendRedirect("index.jsp");
    } else {
        response.sendRedirect("login.jsp");
    }
%>
