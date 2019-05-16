<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>From nguoi dung</p>
	<c:url value="/addUser" var="url" />
	<form:form modelAttribute="user" method="post" action="${url}">
		<p>Name:</p><form:input path="name"/>
		<p style="color: red"><form:errors path="name">Vui long nhap ten</form:errors></p>>
		<p>Password:</p><form:password path="password"/>
		<p style="color: red"><form:errors path="password">Loi</form:errors></p>>
		<form:hidden path="id"/>
		<p>Favourites:</p>
		<form:checkbox path="favourites" value="Movie"/>Movie
		<form:checkbox path="favourites" value="Sport"/>Sport
		<form:checkbox path="favourites" value="Book"/>Book
		<form:checkbox path="favourites" value="Coding"/>Coding
		<p>Sex</p>
		<form:select path="gender">
			<form:option value="Male">Male</form:option>
			<form:option value="Female">Female</form:option>
		</form:select>
		<p>Introduce yourself</p>
		<form:textarea path="about"/>
		<form:radiobutton path="acceptAgreement" value="true" label="Accept the Agreement"/>
		<button type='submit'>Submit</button>
	</form:form>
</body>
</html>