<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>EL이용한 request처리 페이지</title>
	</head>
	<body>
		<%
			request.setCharacterEncoding("UTF-8");
			String user=request.getParameter("user"); //필요가 없어졌네.........
		%>
		<h1>데이터 전체 : ${param }</h1> <!-- parameter의 약자 -->
		<h3>아이디 : ${param.user }</h3>
		<h3>비밀번호 : ${param["pw"] }</h3> <!-- 전체 결과가 map과 같은 형태이기 때문에 배열의 키값을 넣어도 됨 -->
		<%--
		<%
			//기존의 방법
			String[] sArray=request.getParameterValues("season");
			for(int i=0; i < sArray.length; i++){
				out.print("<h1>"+sArray[i]+"</h1>");
			}
		%>
		--%>
		<!-- 다른방법 -->
		<h3>좋아하는 계절 : ${paramValues.season[2] }</h3>
		<hr>
		<h2>기존 방식 : <%=request.getParameter("user")=="admin" %></h2>
		<h2>EL 방식 : ${param.user=="admin" }</h2>
	</body>
</html>