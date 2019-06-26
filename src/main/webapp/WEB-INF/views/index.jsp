<%--
  Created by IntelliJ IDEA.
  User: tinh
  Date: 26/06/2019
  Time: 17:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<head>
    <title>Dictionary</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<h2>Vietnamese Dictionary</h2>
<form method="post" action="/result">
    <input type="text" name="word" placeholder="Enter your word: "/>
    <input type = "submit" id = "submit" value = "Search"/>
</form>
</body>
</html>