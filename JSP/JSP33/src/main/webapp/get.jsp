<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>GET 방식 접근 페이지</title>
	</head>
	<body>
		<h1>GET 방식으로 호출된 경우 이 페이지가 실행됩니다.</h1>
		<h1>현재 파일은 get.jsp입니다.</h1>
		${requestScope.data }<br>
	</body>
</html>