<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>메인 페이지 입니다</title>
	</head>
	<body>
	<%
		//같은 방법 Object ok=session.getAttribute("login");
	    //return 타입이 Object의 형태를 갖고 있으므로, 리턴 된 데이터는 Object변수에 담ㄷ거나 캐스팅해서 사용하여아 한다.
	    		
	    String ok=(String)session.getAttribute("login");
	%>
		<h1>여기는 메인 페이지 입니다.</h1>
		<h1>결과 : <%=ok %></h1>
	</body>
</html>