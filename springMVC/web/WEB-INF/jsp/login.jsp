<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2023/10/12
  Time: 20:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="doLogin2">
    <table>
        <tr>
            <h1>登录</h1>
        </tr>
        <tr>
            <td>用户名称</td>
            <td><input type="text" name="loginName"></td>
        </tr>
        <tr>
            <td>用户密码</td>
            <td><input type="text" name="password"></td>
        </tr>
        <tr>
            <td><input type="submit" value="提交"></td>
        </tr>
    </table>
</form>
<div style="color:red">${MSG}</div>
</body>
</html>
