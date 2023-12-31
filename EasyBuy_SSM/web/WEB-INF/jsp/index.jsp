<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2023/10/10
  Time: 15:36
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
    <div class="help"><a href="#" class="shopping">购物车</a><a href="toLogin">登录</a><a href="toRegister">注册</a><a href="guestbook.html">留言</a></div>
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
        </div>
    </div>
    <div class="main">
        <div class="price-off">
            <h2>今日特价</h2>
            <ul class="product clearfix">
                <c:forEach items="${requestScope.listProduct}" var="p">
                    <li>
                        <dl>
                            <dt><a href="getProductById?id=${p.id}" target="_blank"><img src="images/product/1.jpg" /></a></dt>
                            <dd class="title"><a href=getProductById?id=${p.id} target="_blank">${p.title}</a></dd>
                            <dd class="price">￥${p.price}</dd>
                        </dl>
                    </li>
                </c:forEach>

            </ul>
        </div>
        <div class="side">
            <div class="news-list">
                <h4>最新公告</h4>
                <ul>
                    <li><a href="news-view.html" target="_blank">抢钱啦</a></li>
                    <li><a href="news-view.html" target="_blank">抢钱啦</a></li>
                    <li><a href="news-view.html" target="_blank">抢钱啦</a></li>
                    <li><a href="news-view.html" target="_blank">抢钱啦</a></li>
                    <li><a href="news-view.html" target="_blank">抢钱啦</a></li>
                    <li><a href="news-view.html" target="_blank">抢钱啦</a></li>
                    <li><a href="news-view.html" target="_blank">抢钱啦</a></li>
                </ul>
            </div>
            <div class="spacer"></div>
            <div class="news-list">
                <h4>新闻动态</h4>
                <ul>
                    <c:forEach items="${requestScope.listNews}" var="n">
                        <li><a href="getNewsById?id=${n.id}" target="_blank">${n.title}</a></li>
                    </c:forEach>
                </ul>
            </div>
        </div>
        <div class="spacer clear"></div>
        <div class="hot">
            <h2>热卖推荐</h2>
            <ul class="product clearfix">
                <li>
                    <dl>
                        <dt><a href="product-view.html" target="_blank"><img src="images/product/1.jpg" /></a></dt>
                        <dd class="title"><a href="product-view.html" target="_blank">法国德菲丝松露精品巧克力500g/盒</a></dd>
                        <dd class="price">￥108.0</dd>
                    </dl>
                </li>
                <li>
                    <dl>
                        <dt><a href="product-view.html" target="_blank"><img src="images/product/2.jpg" /></a></dt>
                        <dd class="title"><a href="product-view.html" target="_blank">乐扣普通型保鲜盒圣诞7件套</a></dd>
                        <dd class="price">￥69.90</dd>
                    </dl>
                </li>
                <li>
                    <dl>
                        <dt><a href="product-view.html" target="_blank"><img src="images/product/3.jpg" /></a></dt>
                        <dd class="title"><a href="product-view.html" target="_blank">欧珀莱均衡保湿四件套</a></dd>
                        <dd class="price">￥279.0</dd>
                    </dl>
                </li>
                <li>
                    <dl>
                        <dt><a href="product-view.html" target="_blank"><img src="images/product/4.jpg" /></a></dt>
                        <dd class="title"><a href="product-view.html" target="_blank">联想笔记本电脑 高速独立显存</a></dd>
                        <dd class="price">￥4199</dd>
                    </dl>
                </li>
                <li>
                    <dl>
                        <dt><a href="product-view.html" target="_blank"><img src="images/product/5.jpg" /></a></dt>
                        <dd class="title"><a href="product-view.html" target="_blank">法姿韩版显瘦彩边时尚牛仔铅笔裤</a></dd>
                        <dd class="price">￥49.00</dd>
                    </dl>
                </li>
                <li>
                    <dl>
                        <dt><a href="product-view.html" target="_blank"><img src="images/product/6.jpg" /></a></dt>
                        <dd class="title"><a href="product-view.html" target="_blank">Genius925纯银施华洛世奇水晶吊坠</a></dd>
                        <dd class="price">￥69.90</dd>
                    </dl>
                </li>
                <li>
                    <dl>
                        <dt><a href="product-view.html" target="_blank"><img src="images/product/7.jpg" /></a></dt>
                        <dd class="title"><a href="product-view.html" target="_blank">利仁2018M福满堂电饼铛 好用实惠</a></dd>
                        <dd class="price">￥268.0</dd>
                    </dl>
                </li>
                <li>
                    <dl>
                        <dt><a href="product-view.html" target="_blank"><img src="images/product/8.jpg" /></a></dt>
                        <dd class="title"><a href="product-view.html" target="_blank">达派高档拉杆箱20寸 经典款式</a></dd>
                        <dd class="price">￥198.0</dd>
                    </dl>
                </li>
                <li>
                    <dl>
                        <dt><a href="product-view.html" target="_blank"><img src="images/product/9.jpg" /></a></dt>
                        <dd class="title"><a href="product-view.html" target="_blank">爱国者MP4 全屏触摸多格式播放 4G</a></dd>
                        <dd class="price">￥289.0</dd>
                    </dl>
                </li>
                <li>
                    <dl>
                        <dt><a href="product-view.html" target="_blank"><img src="images/product/10.jpg" /></a></dt>
                        <dd class="title"><a href="product-view.html" target="_blank">多美滋金装金盾3阶段幼儿配方奶粉</a></dd>
                        <dd class="price">￥186.0</dd>
                    </dl>
                </li>
                <li>
                    <dl>
                        <dt><a href="product-view.html" target="_blank"><img src="images/product/1.jpg" /></a></dt>
                        <dd class="title"><a href="product-view.html" target="_blank">法国德菲丝松露精品巧克力500g/盒</a></dd>
                        <dd class="price">￥108.0</dd>
                    </dl>
                </li>
                <li>
                    <dl>
                        <dt><a href="product-view.html" target="_blank"><img src="images/product/2.jpg" /></a></dt>
                        <dd class="title"><a href="product-view.html" target="_blank">乐扣普通型保鲜盒圣诞7件套</a></dd>
                        <dd class="price">￥69.90</dd>
                    </dl>
                </li>
            </ul>
        </div>
    </div>
    <div class="clear"></div>
</div>
<div id="footer">

</div>
</body>
</html>
