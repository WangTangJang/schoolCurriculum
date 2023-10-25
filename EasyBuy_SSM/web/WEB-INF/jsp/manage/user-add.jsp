<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2023/10/23
  Time: 14:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>后台管理 - 易买网</title>
    <link type="text/css" rel="stylesheet" href="css/style.css" />
    <script type="text/javascript" src="scripts/function-manage.js"></script>
</head>
<body>
<%@include file="header.jsp"%>
<div id="childNav">
    <div class="welcome wrap">
        管理员pillys您好，今天是2012-12-21，欢迎回到管理后台。
    </div>
</div>
<div id="position" class="wrap">
    您现在的位置：<a href="index.html">易买网</a> &gt; 管理后台
</div>
<div id="main" class="wrap">
    <div id="menu-mng" class="lefter">
         <%@include file="left.jsp"%>
    </div>
    <div class="main">
        <h2>新增用户</h2>
        <div class="manage">
            <form id="regForm" method="post" action="doAdminReg" onsubmit="return checkForm(this);">
                <table>
                    <tr>
                        <td class="field">用户名：</td>
                        <td><input class="text" type="text" name="loginName" onfocus="FocusItem(this)" onblur="CheckItem(this);" /><span></span></td>
                    </tr>
                    <tr>
                        <td class="field">登录密码：</td>
                        <td><input class="text" type="password" id="passWord" name="password" onfocus="FocusItem(this)" onblur="CheckItem(this);" /><span></span></td>
                    </tr>
                    <tr>
                        <td class="field">确认密码：</td>
                        <td><input class="text" type="password" name="rePassWord" onfocus="FocusItem(this)" onblur="CheckItem(this);" /><span></span></td>
                    </tr>
                    <tr>
                        <td class="field">姓名：</td>
                        <td><input class="text" type="text" name="userName" onfocus="FocusItem(this)" onblur="CheckItem(this);" /><span></span></td>
                    </tr>
                    <tr>
                        <td class="field">性别：</td>
                        <td><input class="text" type="radio" name="sex"  value="1" />男
                            <input class="text" type="radio" name="sex"  value="0" />女
                            <span></span></td>
                    </tr>
                    <tr>
                        <td class="field">身份证号：</td>
                        <td><input class="text" type="text" name="identityCode" onfocus="FocusItem(this)" onblur="CheckItem(this);" /><span></span></td>
                    </tr>
                    <tr>
                        <td class="field">邮箱：</td>
                        <td><input class="text" type="text" name="email" onfocus="FocusItem(this)" onblur="CheckItem(this);" /><span></span></td>
                    </tr>
                    <tr>
                        <td class="field">手机号：</td>
                        <td><input class="text" type="text" name="mobile" onfocus="FocusItem(this)" onblur="CheckItem(this);" /><span></span></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><label class="ui-green"><input type="submit" name="submit" value="提交注册" /></label></td>
                    </tr>
                </table>
            </form>
        </div>
    </div>
    <div class="clear"></div>
</div>
<div id="footer">

</div>
</body>
</html>
