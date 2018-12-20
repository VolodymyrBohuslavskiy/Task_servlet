<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cars</title>
</head>
<body>
<h3>Add car:</h3>
<form action="/cars" method="GET">
    <input type="text" name="brand" placeholder="Бренд">
    <input type="text" name="model" placeholder="Модель">
    <input type="submit">
    <h2>${brand} ${model} is recorded !</h2>
</form>

</body>
</html>
