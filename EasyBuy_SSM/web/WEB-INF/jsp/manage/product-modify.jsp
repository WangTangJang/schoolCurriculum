<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2023/10/30
  Time: 9:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <h2>添加商品</h2>
        <div class="manage">
            <form action="doProductModify" method="post" enctype="multipart/form-data">
                <input type="hidden" name="id" value="${ep.id}" />
                <input type="hidden" name="oldpic" value="${ep.image}"/>
                <table class="form">
                    <tr>
                        <td class="field">商品名称：</td>
                        <td><input type="text" class="text" name="title" value="${ep.title}" /></td>
                    </tr>
                    <tr>
                        <td class="field">所属分类：</td>
                        <td>
                            <select name="cid">
                                <option value="1" >图书、音像、电子书刊</option>
                                <option value="7" <c:if test="${ep.cid==7}">selected="selected"</c:if> >├ 电子书刊</option>
                                <option value="11" <c:if test="${ep.cid==11}">selected="selected"</c:if>>└ 音像</option>

                                <option value="74">家用电器</option>
                                <option value="75" <c:if test="${ep.cid==75}">selected="selected"</c:if>>├ 大 家 电</option>
                                <option value="89" <c:if test="${ep.cid==89}">selected="selected"</c:if>>└ 生活电器</option>

                                <option value="378">食品饮料、保健食品</option>
                                <option value="379" <c:if test="${ep.cid==379}">selected="selected"</c:if>>├ 进口食品</option>
                                <option value="386" <c:if test="${ep.cid==386}">selected="selected"</c:if>>└ 地方特产</option>

                                <option value="558">手机</option>
                                <option value="559" <c:if test="${ep.cid==559}">selected="selected"</c:if>>├ 手机通讯</option>
                                <option value="562" <c:if test="${ep.cid==562}">selected="selected"</c:if>>└ 运营商</option>

                                <option value="749">服饰内衣</option>
                                <option value="750" <c:if test="${ep.cid==750}">selected="selected"</c:if>>├ 女装</option>
                                <option value="784" <c:if test="${ep.cid==784}">selected="selected"</c:if>>└ 男装</option>

                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td class="field">商品图片：</td>
                        <td><input type="file" class="text" name="pic" />
                            <a href="${ep.image}" target="_blank"><img src="${ep.image}" width="40" height="40"/></a>
                            <a href="${ep.image}" target="_blank">浏览</a>
                        </td>
                    </tr>
                    <tr>
                        <td class="field">商品价格：</td>
                        <td><input type="text" class="text tiny" name="price" value="${ep.price}" /> 元</td>
                    </tr>
                    <tr>
                        <td class="field">卖点：</td>
                        <td><input type="text" class="text" name="sell_point"  value="${ep.sell_point}"/></td>
                    </tr>
                    <tr>
                        <td class="field">库存：</td>
                        <td><input type="text" class="text tiny" name="num" value="${ep.num}" /></td>
                    </tr>
                    <tr>
                        <td class="field">条码号：</td>
                        <td><input type="text" class="text" name="barcode" value="${ep.barcode}" /></td>
                    </tr>
                    <tr>
                        <td>${requestScope.uploadFileError}</td>
                        <td><label class="ui-blue"><input type="submit" name="submit" value="修改" /></label></td>
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

