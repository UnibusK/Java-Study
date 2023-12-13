<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>메인페이지</title>
		<link rel="stylesheet" href="css/style.css">
	</head>
	<body>
	<%
		String num = null;
		String name = null;
		String email = null;
		boolean login = false;
		if(session.getAttribute("login")!=null){
			login=(boolean)session.getAttribute("login");
			num=(String)session.getAttribute("num");
			name=(String)session.getAttribute("name");
			email=(String)session.getAttribute("email");		//세션정보는 서버를 끄거나, 해야 저장되어 있던 세션정보가 날아감
		}
	%>
		<div id="wrap">
			<h1>테스트 사이트 입니다.</h1>
			<div class="menu">
				<ul>
					<li>메인페이지</li>
					<li>회원목록</li>
					<li>상품목록</li>
					<li>상품입력</li>
				</ul>
			</div>
			<div id="tab">
			<%	//if-else 문을 먼저 작성하고, 그다음에 내용을 작성할 것.
				if(!login){
			%>
				<form method="post" action="login.jsp">
					<span>아이디</span><input type="text" name="id"><br>
					<span>비밀번호</span><input type="password" name="pw"><br>
					<input type="submit" value="log-in">
				</form>
			<%
				} else {
			%>
				<p><%=num %></p>
				<p><%=name %></p>
				<p><%=email %></p>
				<input type="button" value="log-out" name="logout" onclick="logout()">	
			<%
				}
			%>
			</div>
			<script>
				//도메인 주소를 바꾸는 함수, logout.jsp로 이동
				function logout() {
					location.href="logout.jsp"; //도메인 적혀있는 부분을 location이라고 부름, 창전체는 windows, 하단에 내용 가져올때 document.
				}
			</script>
		</div>
	</body>
</html>

<!-- 인클루드 기법 
	반복되는 페이지를 jsp를 하나 만들어서 넣는 기법
 -->