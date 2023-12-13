<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>스코프 처리 확인</title>
	</head>
	<body>
		<%
			pageContext.setAttribute("page", "page단위의 데이터");
			session.setAttribute("sess", "session단위의 데이터");
			application.setAttribute("app", "application단위의 데이터");
		%>
		
		<h1>index 페이지</h1>
		

		<h1>\${page } : ${page }</h1> <!-- 이 페이지에서 소멸 -->
		<h1>\${req } : ${req }</h1> <!-- request를 받아왔기 때문에 소멸 -->
		<h1>\${sess } : ${sess }</h1> <!-- 다른페이지에서 확인 가능 -->
		<h1>\${app } : ${app }</h1> <!-- 다른 페이지에서 확인 가능 -->
		
		<a href="index.jsp">page단위 scope확인</a><br>
		<a href="#" onclick="sub()">request단위 scope확인</a><br> <!-- post로 데이터를 전송하면 살아남 -->
		<a href="session.jsp">session단위 scope확인</a><br>
		<a href="application.jsp">application단위 scope확인</a><br>
		
		<form method="post" action="request.jsp">
			<input type="hidden" name="req" value="request단위의 데이터">
		</form>
		<script>
			let fm=document.getElementsByTagName("form")[0];
			function sub(){
				fm.submit();
			}
		</script>
	</body>
</html>