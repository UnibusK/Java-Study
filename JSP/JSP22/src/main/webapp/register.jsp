<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>입력 확인 페이지</title>
	</head>
	<body>
		<%
			//써블릿 : request라는 메서드 안에 있는 것
			request.setCharacterEncoding("utf-8");
			//beans.Reg r=new beans.Reg(); -> <jsp로 넣었으니까 삭제>
			// <%@ page import="beans.Reg"> 임폴드를 해줄 경우
			// Reg r=new Reg(); 로 객체를 조립해도 가능
			
			
			String name=request.getParameter("nm");
			String userId=request.getParameter("userId");
			String pass=request.getParameter("pw");
			String phone=request.getParameter("first")+"-"+
						 request.getParameter("second")+"-"+
						 request.getParameter("third");
		
		
		%>
		
		<h1>post로 전송받은 데이터</h1>
		<p>이름 : <%=name %></p>
		<p>아이디 : <%=userId %></p>
		<p>비밀번호 : <%=pass %></p>
		<p>연락처 : <%=phone %></p>

		<hr>
		
		<!-- 혼자해본 내용 -->
		<!-- bean으로 잡자 불러오기 -->
		<jsp:useBean class="data.Register" id="one" scope="session"></jsp:useBean>
		<!-- post로 받은 모든 데이터 자바에 세팅하기 -->
		<jsp:setProperty name="one" property="*"></jsp:setProperty>
		
		<h1>bean으로 확인한 내용</h1>
		<!-- get으로 자바에 저장된 데이터 가져오기 -->
		<p><span>이름 : </span><jsp:getProperty name="one" property="name"></jsp:getProperty></p>
		<p><span>아이디 : </span><jsp:getProperty name="one" property="userId"></jsp:getProperty></p>
		<p><span>비밀번호 : </span><jsp:getProperty name="one" property="pass"></jsp:getProperty></p>
		<p><span>폰번호: </span>
		<jsp:getProperty name="one" property="first"></jsp:getProperty> -
		<jsp:getProperty name="one" property="second"></jsp:getProperty> -
		<jsp:getProperty name="one" property="third"></jsp:getProperty></p>	
		<hr>
		<a href="next.jsp">다음페이지로 이동</a>
		
		
		<h1>//////수업에서 진행///////</h1>
		<jsp:useBean class="beans.Reg" id="r" scope="session"></jsp:useBean>
		<jsp:setProperty name="r" property="*"></jsp:setProperty>

		<h2>java class로 받은내용</h2>
		<p>이름 : <%=r.getName() %></p>
		<p>아이디 : <%=r.getUserId() %></p>
		<p>비밀번호 : <%=r.getPass() %></p>

		<hr>
		<h2>useBean로 받은 내용</h2>		
		이름 : <jsp:getProperty name="r" property="name"></jsp:getProperty><br>
		아이디 : <jsp:getProperty name="r" property="userId"></jsp:getProperty><br>
		비밀번호 : <jsp:getProperty name="r" property="pass"></jsp:getProperty><br>
		전화번호 : <jsp:getProperty name="r" property="phone"></jsp:getProperty><br>
		

		<hr>
	</body>
</html>