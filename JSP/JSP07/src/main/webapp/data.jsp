<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
	<html>
		<head>
		<meta charset="EUTF-8">
	<title>데이터 받는 페이지</title>
	</head>
	<body>
		<%
			request.setCharacterEncoding("utf-8");
			String input = request.getParameter("tx");
			String hidden = request.getParameter("hi");
		%>
		
		<h1> 전송받은 값 : <%=input %></h1>
		<h2> 두번째 전송받은 값 : <%=hidden %></h2>
	</body>
</html>