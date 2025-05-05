<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<!DOCTYPE html>
<html>
<head>
    <title>Struts 1 Login</title>
    <style>
        .error { color: red; }
    </style>
</head>
<body>
    <h1>Login Page</h1>

    <!-- Display global errors -->
    <html:errors/>

    <!-- Form matching LoginForm properties -->
    <html:form action="/login.do" focus="name">
        <table>
            <tr>
                <td>Name:</td>
                <td>
                    <html:text property="name" size="30"/>
                    <html:errors property="name"/>
                </td>
            </tr>
            <tr>
                <td>Mobile:</td>
                <td>
                    <html:text property="mobile" size="30"/>
                    <html:errors property="mobile"/>
                </td>
            </tr>
            <tr>
                <td>Email:</td>
                <td>
                    <html:text property="email" size="30"/>
                    <html:errors property="email"/>
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <html:submit value="Login"/>
                </td>
            </tr>
        </table>
    </html:form>
</body>
</html>