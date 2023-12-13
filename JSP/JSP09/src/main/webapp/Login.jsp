<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>로그인</title>
	</head>
	<body>
		<%
			request.setCharacterEncoding("utf-8");
		
			//간이 로그인을 위한 관리자 아이디
			String user="admin";
			String pw="1111";
		
			String id=request.getParameter("id");
			String pass=request.getParameter("pass");
			System.out.println("아이디 : "+id);
			System.out.println("비밀번호 : "+pass);
			out.print("입력아이디 : " +id);
			out.print("입력 비번 : " +pass);
			
			//String 데이터는 ==로 비교하지 않고 equals() 함수로 비교한다.
			//주소가 아닌 값을 기준으로 비교하는 String.equals(String) 메서드를 이용해서 비교한다.
			if(user.equals(id)&&pw.equals(pass)) {
				session.setAttribute("login","로그인 성공!"); //별도의 저장공간, 페이지가 모두 공유하는 별도 저장공간에 데이터를 저장
				response.sendRedirect("main.jsp");
			} else {
		%>
				<h1>로그인 실패</h1>
				<a href='index.jsp'>로그인 페이지로 돌아기기</a>
		<%
			}
		%>
	</body>
	<script>
		console.log("입력아이디 : " + "<%=id%>");
	</script>
</html>