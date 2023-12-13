<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>세선정보 공유 페이지</title>
	</head>
	<body>
		<h1>세션 데이터를 확인합니다. result.jsp</h1>
		<a href="index.jsp">인덱스로 돌아가기</a>
		<%
			//서버에서 바로 가져오기 때문에 request나 response로부터 불러오지 않는다.
			//return타입이 저장된 정보는 Object타입으로 반환되므로 캐스팅(강제 형변환)을 해 주어야 한다.
			String str = (String)session.getAttribute("msg");

		%>
		<H2>session 데이터 : <%=str %></H2>
		

	</body>
</html>