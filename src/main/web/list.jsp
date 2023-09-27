<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <table border="1">
    <tr>
      <td>编号</td>
      <td>登录名</td>
      <td>姓名</td>
      <td>性别</td>
      <td>身份证号</td>
      <td>邮箱</td>
    </tr>
    <c:forEach items="${requestScope.list}" varStatus="i" var="u">
      <tr>
        <td>${i.index+1}</td>
        <td>${u.loginName}</td>
        <td>${u.userName}</td>
        <td>
            <c:if test="${u.sex==1}">男</c:if>
           <c:if test="${u.sex==0}">女</c:if>
         </td>
        <td>${u.identityCode}</td>
        <td>${u.email}</td>
      </tr>
    </c:forEach>
  </table>
  </body>
</html>
