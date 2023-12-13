<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>로그인 화면</title>
	</head>
	<body>
		<%
			String sID = request.getParameter("id");
			String sPW = request.getParameter("pw");
			String sNNm = request.getParameter("nnm");
			String sEmail = request.getParameter("email");
		%>
			<h2><%=sNNm %> 님 환영합니다. </h2>
	</body>
</html>