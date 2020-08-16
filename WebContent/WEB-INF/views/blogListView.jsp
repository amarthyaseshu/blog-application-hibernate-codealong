<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Code Wall</title>
<link rel="stylesheet" href="./css/blog.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css">
</head>
<body>
<nav>
<img alt="logo" src="./assets/logo.svg">
<ul>
<li><a href="${pageContent.request.contextPath}/myblogs"></a></li>
<li><a href="${pageContent.request.contextPath}/allblogs"></a></li>
<li><a href="${pageContent.request.contextPath}/login"></a></li>
<li><a href="${pageContent.request.contextPath}/signup"></a></li>
</ul>
</nav>
<form action="${pageContent.request.contextPath}/new" method="post">
<input id="title" name="title" placeholder="Title" type="text"/>
<textarea id="msg" name="message" placeholder="Description"></textarea>
<button id="post" type="submit">POST</button>
</form>
</body>
</html>