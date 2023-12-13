<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="test.Sample" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>자바 클래스의 이용</title>
	</head>
	<body>
		<%
			Sample s;
			s = new Sample("김우주", 5, 5);
		%>
		<h1>이름 : <%=s.name %></h1>
		<h1>나이 : <%=s.age %></h1>
		<h1>주소 : <%=s.address %></h1>
		<%=s.make(3,2) %>
		<hr>
		<%=s.tag %>
	</body>
</html>