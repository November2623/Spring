<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="<c:url value="/resource/css/style.css" />" >
</head>
<body>
	<p>Hello ${person.name}</p>
	<img src='<c:url value="/resource/image/123.jpg" />'>
</body>
</html>