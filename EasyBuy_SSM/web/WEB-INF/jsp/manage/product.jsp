<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2023/10/30
  Time: 9:18
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
    <script type="text/javascript">
        function doProductDelete(id) {
            if(confirm("确定要删除吗？")){
                location.href='doProductDelete?id='+id;
            }
        }
    </script>
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
        <h2>商品管理</h2>
        <div class="manage">
            <table class="list">
                <tr>
                    <th>ID</th>
                    <th>商品名称</th>
                    <th>操作</th>
                </tr>
                <c:forEach items="${requestScope.list}" var="p" varStatus="i">
                    <tr>
                        <td class="first w4 c">${i.index+1}</td>
                        <td class="thumb"><img src="${p.image}" width="40px" height="40px" /><a href="getProductById?id=${p.id}" target="_blank">${p.title}</a></td>
                        <td class="w1 c"><a href="toProductModify?id=${p.id}">修改</a> <a href="javascript:doProductDelete(${p.id});">删除</a></td>
                    </tr>
                </c:forEach>
                <tr>
                    <td colspan="6">
                        <div class="pager">
                            <ul class="">
                                <li><a href="toAdminProduct?page=1">首页</a></li>
                                <c:if test="${requestScope.page==1}">
                                    <li><a href="toAdminProduct?page=${requestScope.page}">上一页</a></li>
                                </c:if>
                                <c:if test="${requestScope.page>1}">
                                    <li><a href="toAdminProduct?page=${requestScope.page-1}">上一页</a></li>
                                </c:if>


                                <c:if test="${requestScope.page==requestScope.pages}">
                                    <li><a href="toAdminProduct?page=${requestScope.page}">下一页</a></li>
                                </c:if>

                                <c:if test="${requestScope.page<requestScope.pages}">
                                    <li><a href="toAdminProduct?page=${requestScope.page+1}">下一页</a></li>
                                </c:if>


                                <li><a href="toAdminProduct?page=${requestScope.pages}">末页</a></li>
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
