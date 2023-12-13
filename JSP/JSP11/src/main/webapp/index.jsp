<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>데이터 공유 기법</title>
	</head>
	<body>
	<!-- 자바부터 실행, 그다음 순차적으로 실행!! -->
	<!-- favicon : 홈페이지에서 나타내는 아이콘 -->
		<%
			//Cookie : 페이지가 종료 되더라도 웹브라우저에 남아 있는 기록
			//웹브라우저를 종료 할지라도 기록이 남아 있어서 재접속 시에도 사용 가능
			//**********매우 중요 Cookie의 저장 위치는 클라이언트다!~!!!!!
			
			//만드는 방법
			//Cookie("쿠키 이름", "저장할 정보");
		
			Cookie ck = new Cookie("data", "kuj123456");
			//쿠키의 존재시간을 초단위로 지정
			ck.setMaxAge(60*60);
			//쿠키를 클라이언트로 전송해줘야 한다.
			response.addCookie(ck);
		%>
		<h1>index 페이지 입니다.</h1>
		<a href="view1.jsp">view1 으로 이동</a> <br>
		<a href="view2.jsp">view2 으로 이동</a>
	</body>
</html>