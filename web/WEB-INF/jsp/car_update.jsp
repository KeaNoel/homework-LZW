<%@ page import="com.lzw.car.entity.Car" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>车系修改表单</title>
</head>
<body>

<% Car car=(Car)request.getAttribute("car");%>


<form action="/book/update" method="post">
    <div><input type="text" name="name" placeholder="name" value="<%= car.getName()%>"></div>
    <div><input type="number" step="0.01" name="price" placeholder="price" value="<%= car.getPrice()%>"></div>
    <div><input type="text" name="author" placeholder="author" value="<%= car.getFactory()%>"></div>
    <div><input type="text" name="press" placeholder="press" value="<%= car.getProductiontime()%>"></div>
    <div><input type="hidden" name="id" value="<%= car.getId()%>"></div>

    <div><input type="submit" value="提交更新"></div>
</form>
</body>
</html>
