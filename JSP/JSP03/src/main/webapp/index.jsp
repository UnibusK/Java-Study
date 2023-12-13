<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>스크립트릿 연습</title>
	</head>
	<body>
		<%
			for(int i=0; i<5; i++) {
				out.print("스크립트릿 안에서 이 내용을 반복 <br>");
			}
		%>
		
		<%
			for(int i=6; i>=1; i--) {
		%>
			<h<%=i %>>html 에서 같은 내용 반복하는 문장 두번째 </h<%=i %>>
			<%= i %>
		<%
			}
		%>
	</body>
</html>