<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>세션 데이터 공유받는 페이지</title>
	</head>
	<body>
		<h1>data.jsp 입니다.</h1>
		<%
			request.setCharacterEncoding("UTF-8");
			String sel=request.getParameter("data");
			session.setAttribute("key", sel);
			String inText=request.getParameter("userText");
			session.setAttribute("outText", inText);
		%>
		<h1>post로 받은 데이터 : <%=sel %></h1>
		<h3>outText : <%=inText %></h3>
		<a href="view.jsp">세션 데이터 확인</a><br>
		<a href="view2.jsp">뷰2 데이터 확인</a><br>
		<hr>
		<a href="index.jsp">인덱스로 돌아가기</a>
		
	</body>
</html>