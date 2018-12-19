<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %><%-- Скріплет, це код який вбудований шаблон    --%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>${name} ${surname} is save !</h2> <%--Змінні--%>

<%--<form action="/" method="GET"> &lt;%&ndash;Форма, формування УРЛ "/" (action="/"), тип запиту ГЕТ method="GET"&ndash;%&gt;--%>
<form action="/home" method="POST"> <%--Форма, формування УРЛ "/" (action="/"), тип запиту ГЕТ method="POST"--%>

    <input type="text" name="name"
           placeholder="name"> <%--Тип -текстова інформація, name-імя параметру, placeholder прозорий теккст в рамці--%>
    <input type="text" name="surname" placeholder="surname"><%--Тип -текстова інформація, name-імя параметру, placeholder прозорий теккст в рамці--%>

    <input type="submit"><%--Кнопка дії--%>

</form>


<ol>
    <c:forEach items="${userList}" var="u">
<li>${u.name} ${u.surname} </li>
    </c:forEach>

</ol>
</body>
</html>
