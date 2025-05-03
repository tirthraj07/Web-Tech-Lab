<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<jsp:useBean id="studentBean" class="com.main.Student" scope="session" />

<h2>Student Info:</h2>
<p>Name: <jsp:getProperty name="studentBean" property="name" /></p>
<p>Age: <jsp:getProperty name="studentBean" property="age" /></p>
