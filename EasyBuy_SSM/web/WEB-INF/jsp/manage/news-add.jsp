<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2023/10/25
  Time: 15:24
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
        <h2>添加新闻</h2>
        <div class="manage">
            <form action="saveNews" method="post">
                <table class="form">
                    <tr>
                        <td class="field">新闻标题：</td>
                        <td><input type="text" class="text" name="title" value="" /></td>
                    </tr>
                    <tr>
                        <td class="field">新闻内容：</td>
                        <td><textarea name="content"></textarea></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><label class="ui-blue"><input type="submit" name="submit" value="添加" /></label></td>
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
