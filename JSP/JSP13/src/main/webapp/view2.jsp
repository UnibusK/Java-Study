<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>세션 받는 두번째 페이지</title>
	</head>
	<body>
		<%
			String str=(String)session.getAttribute("key");
			String text=(String)session.getAttribute("outText");
		%>
		<h1>view2.jsp입니다.</h1>
		<h2>session 데이터 : <%=str %></h2>
		<h2>사용자 입력 session 데이터 : <%=text %></h2>
		
		
		<a href="index.jsp">인덱스로 돌아가기</a>
		
	</body>
</html>