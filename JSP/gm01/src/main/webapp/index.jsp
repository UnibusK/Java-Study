<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원가입</title>
		<style>
			#wrap {
				width:350px;
				border:2px solid black;
				border-radius:10px;
				margin:0 auto;
				padding:30px;
				background-color:darkgray;
				color:white;
			}
			input[name="id"] {
				width:120px;
				margin-left:10px;
			}
			input[name="pw"] {
				width:120px;
				margin-left:6px;
			}
			input[name="nm"]{
				width:120px;
				margin-left:10px;
			}
			input[name=ph]{
				width:120px;
				margin-left:10px;
			}
			fieldset{
				border:1px solid beige;
				border-radius:6px;
				width:130px;
				margin:0 auto;
			}
			#submit, #reset {
				background-color:black;
				color:white;
				display:block;
				margin:0 auto;
			}
		</style>
	</head>
	<body>
		<div id="wrap">
			<form method="get" action="login.jsp">
				<h1>회원가입</h1>
				<hr>
				아 이 디 : <input type="text" placeholder="4자이상 입력" name="id" id="id">
				<input type="checkbox" onclick="idCheck()">중복체크<br>
				비밀번호 : <input type="password" placeholder="4자이상 입력" name="pw"><br>
				닉 네 임 : <input type="text" placeholder="2자이상을 입력" name="nnm">
				<input type="checkbox" onclick="idCheck()">중복체크<br>
				이 메 일 : <input type="text" placeholder="이메일을 입력" name="email">
				<input type="checkbox" onclick="idCheck()">중복체크<br>
				<hr>
				<input type="submit" value="회원가입" id="submit">
				<input type="reset" value="가입취소" id="reset">
				<!-- 개인정보 수집동의 해야하는지 ? -->
				
			</form>
		</div>
		<script>
			function idCheck(){
				let userID = document.getElementById("id").value
				prompt("아이디 중복체크" , defalt=userID);
			}
		</script>
	</body>
</html>