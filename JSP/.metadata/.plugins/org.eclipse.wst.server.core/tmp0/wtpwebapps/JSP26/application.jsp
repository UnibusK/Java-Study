<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>application 페이지</title>
	</head>
	<body>
		<%
			request.setCharacterEncoding("UTF-8");
		%>
		<h1 style="color:gray">application 들어온 데이터 확인</h1>

		<h1>\${page } : ${page }</h1> <!-- 이 페이지에서 소멸 -->
		<h1>\${param.req } : ${param.req }</h1>
		<h1>\${sess } : ${sess }</h1> <!-- 다른페이지에서 확인 가능 -->
		<h1>\${app } : ${app }</h1> <!-- 다른 페이지에서 확인 가능 -->
		
		<a href="index.jsp">page단위 scope확인</a><br>
		<a href="request.jsp">request단위 scope확인</a><br>
		<a href="session.jsp">session단위 scope확인</a><br>
		<a href="application.jsp">application단위 scope확인</a><br>
		
		<%
			application.removeAttribute("app");
		%>
		<h1>어플리케이션 삭제 후 데이터 : ${app }</h1>
	</body>
</html>