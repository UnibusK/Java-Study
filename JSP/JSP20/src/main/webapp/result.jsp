<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="data.Student" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>최종확인</title>
	</head>
	<body>
		<h1>여기는 result.jsp 파일 입니다.</h1>
		<%
			request.setCharacterEncoding("UTF-8");

			/*
			String name=request.getParameter("nm");
			String kor=request.getParameter("kr");
			String eng=request.getParameter("en");
			String math=request.getParameter("mt");
			*/
	
			
			//세션으로 값을 저장해둔걸 가져옴 (기존방법)
			/*
			String name=(String)session.getAttribute("nm");
			String kor=(String)session.getAttribute("kr");
			String eng=(String)session.getAttribute("en");
			String math=(String)session.getAttribute("mt");
			
			int sum=Integer.parseInt(kor)+Integer.parseInt(eng)+Integer.parseInt(math);
			*/
			Student s1=(Student)session.getAttribute("obj");
			// jsp에서 계산 하는 방법
			// int sum=s1.kor+s1.eng+s1.math;
			// class에서 메서드로 받아서 작성하면 별도로 작성하지 않아도 됨
			
		%>
		<h2>전송결과</h2>
		<p>이름 : <%=s1.name %></p>
		<p>국어 : <%=s1.kor %></p>
		<p>영어 : <%=s1.eng %></p>
		<p>수학 : <%=s1.math %></p>
		<hr>
		<p>합계 : <%=s1.sum() %></p>
		<p>평균 : <%=s1.avg() %></p>
		<p>객체 : <%=s1 %><p>
	</body>
</html>