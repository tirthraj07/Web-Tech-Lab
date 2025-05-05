<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<html>
<head><title>Welcome</title></head>
<body>
<h2>Congratulations!</h2>
<p>Welcome, <bean:write name="loginForm" property="name" scope="request"/>!</p>
</body>
</html>
