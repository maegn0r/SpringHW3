<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All Products</title>
</head>
<body>
<h1>Product List</h1>
<br>
<ul>
    <jsp:useBean id="products" scope="request" type="java.util.List"/>
    <c:forEach var="product" items="${products}">
        <c:url var="viewUrl" value="/product/${product.id}">
<%--        <c:url var="viewUrl" value="/product/all">--%>
        </c:url>
<%--        <li>--%>
            <a href="${viewUrl}">View</a>
            <br>
            Product title: ${product.title}
            <br>
            Product price: ${product.cost}
            <br>
        </li>
    </c:forEach>
</ul>
<%--<c:url var="createUrl" value="/product/create">--%>
<%--</c:url>--%>
<%--<a href="${createUrl}">Create</a>--%>
</body>
</html>