<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
		<meta charset="UTF-8">
		<title>세션 공유받은 페이지</title>
	</head>
	<body>
		<h1>현재 view.jsp 입니다.</h1>
		<h2>세션 데이터를 확인합니다.</h2>
		<%
			String str=(String)session.getAttribute("key");
		
			//세션 생성시간 확인
			long time=session.getCreationTime();
			//세션에 최종으로 접근한 시간
			long last=session.getLastAccessedTime();
			//세션이 활동할수 있는 기간 지정
			session.setMaxInactiveInterval(60*60);
			//세션활동 가능시간 확인
			int interval=session.getMaxInactiveInterval();
			
			//세션종료 : 로그아운 기능 구현할 때 사용함
			session.invalidate();
		%>
		<h3>session에 저장된 데이터 : <%=str %></h3>
		<h3>세션 생성시간 : <%=time %></h3>
		<h3>세션 최종사용시간 : <%= last%> </h3>
		<h3>세션 유지기간(초) : <%=interval %></h3>
		<a href="view2.jsp">view2로 가기</a>
		<hr>
		<a href="index.jsp">인덱스로 돌아가기</a>
		
	</body>
</html>