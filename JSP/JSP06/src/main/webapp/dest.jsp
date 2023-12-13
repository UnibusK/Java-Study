<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>데이터 전송 목적지</title>
	</head>
	<body>
		<h1> 여기는 dest.jsp 입니다.</h1>
		<h2>전송받은 데이터는 다음과 같습니다.</h2>
		<hr>
		<%
			//post 통식은 request내부에 데이터 형태로 문자를 저장하기 때문에 한글이 인식되지 않는다.
			//request 문자 규칙을 UTF-8로 비꾼다.
			//request를 통해 데이터를 전송하는 과정에서 한글이 깨진다면 이 코드를 가장 위에 둔다.
			//***** 외워두기 중요!~~
			request.setCharacterEncoding("UTF-8");
			//get으로 전송된 데이터를 받는 방법
			//get 방식의 단점
			//1. 문자 형태가 아닌 데이터는 보낼 수 없음
			//2. 255자 이 상 들어갈 수가 없음
			//3. 비밀번호 노출되어 보안상 취약
			//method를 get 방식이 아닌 post로 받으면 주소창에 데이터가 나타나지 않는다.
			//

			String user=request.getParameter("id");
			String pass=request.getParameter("pw");
			String nam=request.getParameter("nm");
			String phone=request.getParameter("ph");
			String subject=request.getParameter("sub");
			String jsp=request.getParameter("jsp");
			String sql=request.getParameter("sql");
			
		%>
		user : <%=user %> <br>
		pass : <%=pass %> <br>
		nam : <%=nam %> <br>
		phone : <%=phone %> <br>
		subject : <%=subject %> <br>
		jsp : <%=jsp %> <br>
		sql : <%=sql %>
	</body>
</html>