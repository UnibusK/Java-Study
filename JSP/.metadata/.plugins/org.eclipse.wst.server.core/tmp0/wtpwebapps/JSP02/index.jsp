<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>	
		<meta charset="UTF-8">
		<title>Insert title here</title>
		</head>
	<body>
		<h1>태그에 입려한 내용입니다.</h1>
		<%
			out.print("<h1>자바로 입력한 내용입니다.</h1>");
		%>
		<%
			//자바코드는 스트립트릿 기호 내부에 작성해야 한다.
			int a =10;
			int b= 20;
			int sum = a+b;
		%>
		<h1>변수 a와 b의 합은 <% out.print(sum); %>입니다.</h1>
		<h2>같은 방법 : 변수 a와 b의 합은 <%=sum %>입니다.</h2>
		
		<!-- html 주석은 다음과 같습니다. -->
		<% //일반 자바의 주석도 사용 가능합니다. 자바스크립트 REQUEST로 이동이 생긴다. %>
		<%-- 스크립트릿 전체를 주 석으로 변경합니다. --%>
		
		<a href="page01.jsp"> 1번 페이지 이동 </a>
		<br>
		<%
			String s="<a href='page02.jsp'> 2번 페이지 이동</a>";
			out.print(s);
		%>
		<br>
		<a href="page03.jsp"> for문 페이지 이동</a>
		
		<br>
		<br>
		<hr>
		<%
			for(int i=1; i<=4; i++) {
				String tag="<a href = 'page0"+i+".jsp'>" + i +"번 페이지로 이동 </a> <br>";
				out.print(tag);
						
			}
		%>
						
		
		<script>
			
		</script>
	</body>
</html>