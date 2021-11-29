<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All Products</title>
</head>
<body>
<h1>Product List</h1>
<ul>
    <jsp:useBean id="products" scope="request" type="java.util.List"/>
    <c:forEach var="product" items="${products}">
       <c:url var="viewUrl" value="/product/ + ${product.id}">
        </c:url>
        <li>
        <a href="${viewUrl}">View</a>
        <br>
        Product title: ${product.title}
        <br>
        Product price: ${product.price}
        <br>
        </li>
    </c:forEach>
</ul>
<br>
<c:url var="createUrl" value="/product/create">
</c:url>
<a href="${createUrl}">Create</a>
</body>
</html>