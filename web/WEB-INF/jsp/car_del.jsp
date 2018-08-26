<%@ page import="com.util.WebUtil" %>
<%@ page import="com.lzw.car.entity.Car" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>车系详情</title>
    <style>
        .msg {
            font-size: 2em;
            color: greenyellow;
        }
    </style>
</head>
<body>
<%
    Car car = (car) request.getAttribute("car");
%>

<%= WebUtil.popSessionMsg(request) %>

<h1><%=car.getName()%></h1>
<ul class="list-group">
    <li class="list-group-item"><%=car.getFactory()%></li>
    <li class="list-group-item"><%=car.getPrice()%></li>
    <li class="list-group-item"><%=car.getProductiontime()%></li>
</ul>
<a href="/book/index">返回主页面</a>
</body>
</html>
