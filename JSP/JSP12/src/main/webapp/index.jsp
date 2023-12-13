<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>세션</title>
	</head>
	<body>
		<%
			//session:서버 내부에 마련된 데이터를 저장할 수 있는 공간
			//세션을 이용하면 모든 페이지에서 데이터를 공유할 수 있다.
			//세션은 사용자마다 개별적으로 제적되어 사용자간의 데이터공유를 차단하는 효과가 있다.
			//세션에 저장된 데이터는 접속이 종료되어도 일정기간 보관되어 다양한 용도로 사용가능하다.
			//********************매우 중요
			//session데이터는 서버에 저장된다.
			//세션은 데이터 타입에 상관없이 데이터를 저장해 둘 수 있다.
			
			String str = "session123456";
			session.setAttribute("msg", str);
			
		
		%>
		<h1>session 인덱스 페이지입니다. index.jsp</h1>
		<a href="result.jsp">세션 정보 확인하러 가기</a><br><hr>
		<h2>원하는 데이터를 작성해주세요.</h2>
		<form method="get" action="result.jsp">
			<input type="text" name="userText">
			<input type="submit" value="전송">
		</form>
		
	</body>
</html>