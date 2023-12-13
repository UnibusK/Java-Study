<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>서블릿 이용</title>
	</head>
	<body>
		<!-- html 겉에 레이아웃을 입혀서 보이게 하는 형태 : 서블릿 -->
		
		<!-- a태그는 get 방식 -->
		<a href="AAA">get방식으로 서블릿 호출</a>
		
		<!-- post 방식으로 전달 -->
		<form method="post" action="AAA">
			<input type="submit" value="post 방식으로 전송">
		</form>
	</body>
</html>