<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<!DOCTYPE html>
<html>
<head>
    <title>Error Page</title>
    <style>
        .error {
            color: red;
            padding: 10px;
            border: 1px solid red;
            margin: 10px 0;
            background-color: #ffeeee;
        }
        .retry-btn {
            margin-top: 20px;
            padding: 8px 15px;
            background: #4CAF50;
            color: white;
            border: none;
            cursor: pointer;
        }
    </style>
</head>
<body>
    <h1>Error Occurred</h1>

    <!-- Display global errors -->
    <div class="error">
        <html:errors/>
    </div>

    <!-- Display specific error message if available -->
    <bean:parameter id="errorMsg" name="error" value=""/>
    <bean:notEmpty name="errorMsg">
        <div class="error">
            <bean:write name="errorMsg"/>
        </div>
    </bean:notEmpty>

    <!-- Return to login -->
    <html:link page="/login.jsp" styleClass="retry-btn">
        Return to Login Page
    </html:link>

    <!-- Optional: Debug info (remove in production) -->
    <div style="margin-top: 30px; color: gray; font-size: 0.8em;">
        <p>Status Code: <%= response.getStatus() %></p>
        <p>Request URI: <bean:write name="request" property="requestURI"/></p>
    </div>
</body>
</html>