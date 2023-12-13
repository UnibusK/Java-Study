<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--import 할때는 "패키지명.클래스명" --%>
<%@ page import="data.Student" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>넥스트 페이지</title>
	</head>
	<body>
		<h1>여기는 next.jsp 파일 입니다.</h1>
		<%
			request.setCharacterEncoding("UTF-8");

			/*
			String name=request.getParameter("nm");
			String kor=request.getParameter("kr");
			String eng=request.getParameter("en");
			String math=request.getParameter("mt");
			*/
			
			//객체에 데이터 입력
			// 1. 자바를 임포트를 먼저 한 후에,
			// 2. request.getparameter내용을 변수 자리에 직접 넣는다.
			Student s;
			s= new Student();
			s.name=request.getParameter("nm");;
			s.kor=Integer.parseInt(request.getParameter("kr"));
			s.eng=Integer.parseInt(request.getParameter("en"));
			s.math=Integer.parseInt(request.getParameter("mt"));
			
			//3. 자바로 데이터 저장한 후에세션에 데이터 추가
			//session에 데이터가 저장되는 규격은 Object이므로 모든 객체를 저장할 수 있다.
			session.setAttribute("obj", s);
			
			//세션에 데이터 추가 하는 방법
			/*
			session.setAttribute("nm", name);
			session.setAttribute("kr", kor);
			session.setAttribute("en", eng);
			session.setAttribute("mt", math);
			*/
		%>
		<h2>전송결과</h2>
		<p>이름 : <%=s.name %></p>
		<p>국어 : <%=s.kor %></p>
		<p>영어 : <%=s.eng %></p>
		<p>수학 : <%=s.math %></p>
		<%--<a href="#" onclick="sub()">최종 확인 페이지로 이동 클릭!</a> --%>
		<a href="result.jsp">최종 확인 페이지로 이동 클릭!</a>
		
		<%--
		<form id = "data" method="post" action="result.jsp">
			<input type="hidden" name="nm">
			<input type="hidden" name="kr">
			<input type="hidden" name="en">
			<input type="hidden" name="mt">
		</form>
		<script>
			var data=document.getElementById("data");
			data.nm.value="<%=name%>";
			data.kr.value="<%=kor%>";
			data.en.value="<%=eng%>";
			data.mt.value="<%=math%>";
			console.log(data);
			
			function sub() {
				data.submit();
			}
		</script>
		--%>
	</body>
</html>