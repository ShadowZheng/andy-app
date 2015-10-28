<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2015/10/26 0026
  Time: 下午 10:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login page</title>
</head>
<body>
    <h1>Login</h1>
    <div id="login-error">${error}</div>
    <form action="j_spring_security_check" method="post">
        <p>
            <label for="j_username">用户名：</label>
            <input id="j_username" name="j_username" type="text" size="20" maxlength="50" />
        </p>
        <p>
            <label for="j_password">密码：</label>
            <input id="j_password" name="j_password" type="password" />
        </p>
        <input id="_spring_security_remember_me" name="_spring_security_remember_me" type="checkbox" value="true">
        <label for="_spring_security_remember_me">Remember me</label>
        <input type="submit" value="Login" />
    </form>
</body>
</html>
