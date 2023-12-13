<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
		<meta charset="UTF-8">
		<title>쿠키값 공유확인 페이지</title>
	</head>
	<body>
		<h1>view2.jsp 입니다. 쿠키값을 공유합니다.</h1>
		<%
			Cookie[] cookies = request.getCookies();
			
			for(int i = 0; i<cookies.length; i++){
				out.print("<p> 쿠키 이름 : "+cookies[i].getName()+"</p>");
				out.print("<p> 쿠키의 값 : "+cookies[i].getValue()+"</p>");
			}
		%>
		<a href="index.jsp">index 으로 이동</a>
	</body>
</html>