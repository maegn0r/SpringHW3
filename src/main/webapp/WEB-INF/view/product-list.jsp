<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All Products</title>
</head>
<body>
<h1>Product List</h1>
<br>
    <jsp:useBean id="products" scope="request" type="java.util.List"/>
    <c:forEach var="product" items="${products}">
        <c:url var="viewUrl" value="/product/${product.id}">
        </c:url>
            <a href="${viewUrl}">View</a>
            <br>
            Product title: ${product.title}
            <br>
            Product price: ${product.cost}
            <br>
    </c:forEach>
<hr>
<a href="<c:url value="/product/create" />" >Create New</a>
</body>
</html>