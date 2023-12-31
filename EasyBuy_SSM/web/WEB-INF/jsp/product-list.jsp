<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2023/10/18
  Time: 9:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>易买网 - 首页</title>
    <link type="text/css" rel="stylesheet" href="css/style.css" />
    <script type="text/javascript" src="scripts/function.js"></script>
</head>
<body>
<div id="header" class="wrap">
    <div id="logo"><img src="images/logo.gif" /></div>
    <div class="help"><a href="#" class="shopping">购物车</a><a href="login.html">登录</a><a href="register.html">注册</a><a href="guestbook.html">留言</a></div>
    <div class="navbar">
        <ul class="clearfix">
            <li class="current"><a href="#">首页</a></li>
            <li><a href="#">图书</a></li>
            <li><a href="#">百货</a></li>
            <li><a href="#">品牌</a></li>
            <li><a href="#">促销</a></li>
        </ul>
    </div>
</div>
<div id="childNav">
    <div class="wrap">
        <ul class="clearfix">
            <li class="first"><a href="#">音乐</a></li>
            <li><a href="#">影视</a></li>
            <li><a href="#">少儿</a></li>
            <li><a href="#">动漫</a></li>
            <li><a href="#">小说</a></li>
            <li><a href="#">外语</a></li>
            <li><a href="#">数码相机</a></li>
            <li><a href="#">笔记本</a></li>
            <li><a href="#">羽绒服</a></li>
            <li><a href="#">秋冬靴</a></li>
            <li><a href="#">运动鞋</a></li>
            <li><a href="#">美容护肤</a></li>
            <li><a href="#">家纺用品</a></li>
            <li><a href="#">婴幼奶粉</a></li>
            <li><a href="#">饰品</a></li>
            <li class="last"><a href="#">Investor Relations</a></li>
        </ul>
    </div>
</div>
<div id="position" class="wrap">
    您现在的位置：<a href="index.html">易买网</a> &gt; <a href="product-list.html">图书音像</a> &gt; 图书
</div>
<div id="main" class="wrap">
    <div class="lefter">
        <div class="box">
            <h2>商品分类</h2>
            <dl>
                <c:forEach items="${sessionScope.map}" var="m">
                    <c:if test="${m.key=='图书、音像、电子书刊'||m.key=='手机'}">
                        <dt>${m.key}</dt>
                        <c:forEach items="${m.value}" var="v">
                            <dd><a href="getProductByCid?cid=${v.id}">${v.name}</a></dd>
                        </c:forEach>
                    </c:if>
                </c:forEach>
            </dl>
        </div>
        <div class="spacer"></div>
        <div class="last-view">
            <h2>最近浏览</h2>
            <dl class="clearfix">
                <dt><img src="images/product/0_tiny.gif" /></dt>
                <dd><a href="product-view.html">法国德菲丝松露精品巧克力500g/盒</a></dd>
                <dt><img src="images/product/0_tiny.gif" /></dt>
                <dd><a href="product-view.html">法国德菲丝松露精品巧克力500g/盒</a></dd>
            </dl>
            <script type="text/javascript">
                document.write("Cookie中记录的购物车商品ID："+ getCookie("product") + "，可以在动态页面中进行读取");
            </script>
        </div>
    </div>
    <div class="main">
        <div class="product-list">
            <h2>全部商品</h2>
            <div class="pager">
                <ul class="clearfix">
                    <li><a href="getProductByCid?cid=${param.cid}">首页</a></li>

                    <c:if test="${requestScope.page>1}">
                        <li><a href="getProductByCid?cid=${param.cid}&page=${requestScope.page-1}">上一页</a></li>
                    </c:if>
                    <c:if test="${requestScope.page==1}">
                        <li><a href="getProductByCid?cid=${param.cid}&page=1">上一页</a></li>
                    </c:if>
                    <c:if test="${requestScope.page<requestScope.pages}">
                        <li><a href="getProductByCid?cid=${param.cid}&page=${requestScope.page+1}">下一页</a></li>
                    </c:if>
                    <c:if test="${requestScope.page==requestScope.pages}">
                        <li><a href="getProductByCid?cid=${param.cid}&page=${requestScope.pages}">下一页</a></li>
                    </c:if>
                    <li><a href="getProductByCid?cid=${param.cid}&page=${requestScope.pages}">末页</a></li>
                </ul>
            </div>
            <div class="clear"></div>
            <ul class="product clearfix">
                <c:forEach items="${requestScope.list}" var="p">
                    <li>
                        <dl>
                            <dt><a href="getProductById?id=${p.id}" target="_blank"><img src="images/product/1.jpg" /></a></dt>
                            <dd class="title"><a href="getProductById?id=${p.id}" target="_blank">${p.title}</a></dd>
                            <dd class="price">￥${p.price}</dd>
                        </dl>
                    </li>
                </c:forEach>
            </ul>
            <div class="clear"></div>
            <div class="pager">
                <ul class="clearfix">
                    <li><a href="getProductByCid?cid=${param.cid}">首页</a></li>

                    <c:if test="${requestScope.page>1}">
                        <li><a href="getProductByCid?cid=${param.cid}&page=${requestScope.page-1}">上一页</a></li>
                    </c:if>
                    <c:if test="${requestScope.page==1}">
                        <li><a href="getProductByCid?cid=${param.cid}&page=1">上一页</a></li>
                    </c:if>
                    <c:if test="${requestScope.page<requestScope.pages}">
                        <li><a href="getProductByCid?cid=${param.cid}&page=${requestScope.page+1}">下一页</a></li>
                    </c:if>
                    <c:if test="${requestScope.page==requestScope.pages}">
                        <li><a href="getProductByCid?cid=${param.cid}&page=${requestScope.pages}">下一页</a></li>
                    </c:if>
                    <li><a href="getProductByCid?cid=${param.cid}&page=${requestScope.pages}">末页</a></li>
                </ul>
            </div>
        </div>
    </div>
    <div class="clear"></div>
</div>
<div id="footer">

</div>
</body>
</html>
