<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加车系</title>
    <meta name="subtitle" content="新增车系">
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>

<form action="<c:url value="" />" method="post">
    <div class="form-group">
        <label for="id">车号</label>
        <input type="number" class="form-control" id="id" name="id" placeholder="id">
    </div>
    <div class="form-group">
        <label for="name">车名</label>
        <input type="text" class="form-control" id="name" name="name" placeholder="name">
    </div>
    <div class="form-group">
        <label for="price">车价</label>
        <input type="number" class="form-control" id="price" name="price" placeholder="price">
    </div>
    <div class="form-group">
        <label for="factory">制造商</label>
        <input type="text" class="form-control" id="factory" name="factory" placeholder="factory">
    </div>
    <div class="form-group">
        <label for="productiontime">出产时间</label>
        <input type="text" class="form-control" id="productiontime" name="productiontime" placeholder="productiontime">
    </div>
                <div><input type="submit" class="btn btn-primary"></div>
</form>

</body>
</html>
