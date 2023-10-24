<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2023/10/24
  Time: 14:26
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
        <h2>用户管理</h2>
        <div class="manage">
            <table class="list">
                <tr>
                    <th>ID</th>
                    <th>姓名</th>
                    <th>性别</th>
                    <th>Email</th>
                    <th>手机</th>
                    <th>操作</th>
                </tr>
                <c:forEach items="${requestScope.list}" var="u" varStatus="i">
                    <tr>
                        <td class="first w4 c">${i.index+1}</td>
                        <td class="w1 c">${u.userName}</td>
                        <c:if test="${u.sex==1}"><td class="w2 c">男</td></c:if>
                        <c:if test="${u.sex==0}"><td class="w2 c">女</td></c:if>
                        <td>${u.email}</td>
                        <td class="w4 c">${u.mobile}</td>
                        <td class="w1 c"><a href="user-modify.html">修改</a> <a href="javascript:Delete(1);">删除</a></td>
                    </tr>
                </c:forEach>
                <tr>
                    <td colspan="6">
                        <div class="pager">
                            <ul class="">
                                <li><a href="toAdminUser?page=1">首页</a></li>
                                <c:if test="${requestScope.page==1}">
                                    <li><a href="toAdminUser?page=${requestScope.page}">上一页</a></li>
                                </c:if>
                                <c:if test="${requestScope.page>1}">
                                    <li><a href="toAdminUser?page=${requestScope.page-1}">上一页</a></li>
                                </c:if>



                                <li><a href="toAdminUser?page=${requestScope.page+1}">下一页</a></li>
                                <li><a href="#">末页</a></li>



                            </ul>
                        </div>
                    </td>
                </tr>
            </table>
        </div>
    </div>
    <div class="clear"></div>
</div>
<div id="footer">

</div>
</body>
</html>
