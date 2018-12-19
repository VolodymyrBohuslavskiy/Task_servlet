<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Owner</title>
</head>
<body>

<h3>Add owner:</h3>

<form action="/owners" method="GET">
    <input type="text" name="firstName" placeholder="Імя">
    <input type="text" name="secondName" placeholder="Фамілія">
    <input type="submit">
</form>

<h2>${firstName} ${secondName} is recorded !</h2>

</body>

</html>
