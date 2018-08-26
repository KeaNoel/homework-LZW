<%@ page import="com.lzw.car.entity.Car" %>
<%@ page import="java.util.List" %>
<%@ page import="com.util.WebUtil" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>车系列表</title>
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>

<table class="table">
    <thead>
    <tr>
        <th scope="col">id</th>
        <th scope="col">车名</th>
        <th scope="col">车价</th>
        <th scope="col">制造商</th>
        <th scope="col">出产时间</th>
    </tr>
    </thead>

    <c:forEach var="cars" items="${cars}" varStatus="st">
        <tr>
            <td scope="row">${cars.id}</td>
            <td>${cars.name}</td>
            <td>${cars.price}</td>
            <td>${cars.factory}</td>
            <td>${cars.productiontime}</td>
            <td>
                <a href="/book/del?id=cars.getId() ">删除</a>
                <a data-toggle="modal" href="#myModal" data-id="cars.getId()">更新</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
