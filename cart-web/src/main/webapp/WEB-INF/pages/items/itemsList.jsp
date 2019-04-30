<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>
<body>
<center>

    商品列表
    <%--${pageInfo}--%>
    <hr>
    <table cellspacing="0" cellpadding="0" border="5" width="1000">
        <thead>
        <tr>
            <th>商品编号</th>
            <th>商品名称</th>
            <th>商品单价</th>
            <th>商品配图</th>
            <th>商品库存</th>
        </tr>

        <c:forEach var="i" items="${pageInfo.list}">
            <tr>
                <th>${i.id}</th>
                <th>${i.itemsName}</th>
                <th>${i.price}</th>
                <th><img src="${itemsPath}${i.imgUrl}" width="100" height="50"></th>
                <th>${i.count}</th>
            </tr>
        </c:forEach>

        </thead>
    </table>
    <hr>
    <p>
        <c:if test="${pageInfo.hasPreviousPage}">
            <a href="${path}/items/itemsShow.do">
                首页
            </a>
            <a disabled href="${path}/items/itemsShow.do?pageNum=${pageInfo.pageNum-1}">
                上一页
            </a>
        </c:if>
        <c:if test="${pageInfo.hasNextPage}">
            <a href="${path}/items/itemsShow.do?pageNum=${pageInfo.pageNum+1}">
                下一页
            </a>
            <a href="${path}/items/itemsShow.do?pageNum=${pageInfo.pages}">
                末页
            </a>
        </c:if>

        <span> 第${pageInfo.pageNum}/${pageInfo.pages} 页</span>
        <span>共${pageInfo.total}条</span>
    </p>
</center>
</body>
<style>
    a {
        text-decoration: none;
    }
</style>
</html>
