<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2023/10/24
  Time: 11:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <h2>新闻管理</h2>
        <div class="manage">
            <table class="list">
                    <tr>
                        <th>ID</th>
                        <th>新闻标题</th>
                        <th>操作</th>
                    </tr>

                <c:forEach items="${requestScope.list}" var="n" varStatus="i">
                    <tr>
                        <td  class="first w4 c">${i.index+1}</td>
                        <td>${n.title}</td>
                        <td class="w1 c"><a href="#">修改</a>&nbsp;<a href="#">删除</a></td>
                    </tr>
                </c:forEach>

            </table>
        </div>
    </div>
    <div class="clear"></div>
</div>
<div id="footer">

</div>
</body>
</html>

