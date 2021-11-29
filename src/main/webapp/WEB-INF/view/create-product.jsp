<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>New Product</title>
</head>
<body>
<%--@elvariable id="product" type="ru.gb.hello.entity.Product"--%>
<form:form action="create" modelAttribute="product">
    <form:hidden path="id" value="${product.id}"/>
    <br>
    Product title: <form:input path="title"/>
    <br>
    Price: <form:input path="cost"/>
    <br>
    <input type="submit" value="Submit">
</form:form>
</body>
</html>