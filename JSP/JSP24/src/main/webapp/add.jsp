<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>EL의 계산 더하기 받는 파일</title>
	</head>
	<body>
		<%
			request.setCharacterEncoding("UTF-8");
			String first=request.getParameter("first");
			String second=request.getParameter("second");
			String result=first+second;
		%>
		<h1>request로 더한값 : <%=result %></h1>
		<h1>add값 : ${param.first+param.second }</h1>
		<h1>문자처럼 : ${param.first}${param.second }</h1>
		<!-- 
			실행순서 (데이터가 이전될 수 있는 순번)
			1. 자바
			2. EL
			3. HTML
			4. HTML 중에서 자바스크립트
		-->
	</body>
</html>