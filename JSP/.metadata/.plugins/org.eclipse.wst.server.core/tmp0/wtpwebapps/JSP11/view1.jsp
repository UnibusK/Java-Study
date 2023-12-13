<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
		<meta charset="UTF-8">
		<title>다른 페이지-1</title>
	</head>
	<body>
		<h1>여기는 view1.jsp 파일입니다.</h1>
		<%
			//쿠키 정보를 가져오는 방법
			//쿠키는 여러개가 생성되어 있을 수 있으니 배열로 받아온다.
			Cookie[] cks=request.getCookies();
		
			//쿠키가 몇개나 있는지 확인
			
			int size=cks.length;
		%>
		
		<p>쿠키 정보</p>
		<p>쿠키 배열의 크기 : <%=size %></p>
		
		<%
			for(int i =0 ; i<cks.length; i++){
		%>
				<p>쿠키의 이름 확인 <%=cks[i].getName() %></p>
				<p>쿠키의 내용 확인 <%=cks[i].getValue() %></p>
		<%
			}
		%>
		
		<a href="index.jsp">index 으로 이동</a>
	</body>
</html>