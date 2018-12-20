<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add</title>
</head>
<body>
<form action="/add" method="post">

<h2>Car:</h2>
    <select name="cars">
        <c:forEach items="${carlist}" var="car">
            <option>
                    ${car.brand} ${car.model}
            </option>
        </c:forEach>
    </select>

    <h2>Owner:</h2>
    <select name="owners">
        <c:forEach items="${owners}" var="owner">
            <option>
                    ${owner.firstName} ${owner.secondName}
            </option>
        </c:forEach>
    </select>
    <input type="submit">

</form>
</body>
</html>
