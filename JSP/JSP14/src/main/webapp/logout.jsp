<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>로그아웃 처리 페이지</title>
	</head>
	<body>
		<%
			session.invalidate(); //세션안에 있는 정보를 말소하는 함수
			response.sendRedirect("index.jsp");
			System.out.print("로그아웃 성공");
		%>
	</body>
</html>