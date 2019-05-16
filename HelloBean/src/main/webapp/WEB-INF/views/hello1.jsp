<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>Thong tin nguoi dung</p>>
	<p>Ten: ${user.name}</p>
	<p>ID: ${user.id }</p>
	<p>Sex: ${user.gender }</p>
	<p>About: ${user.about }</p>
	<p>Accept: ${user.acceptAgreement }</p>
	<c:forEach items="${user.favourites }" var="item">
		<p>${item}</p>
	</c:forEach>
</body>
</html>