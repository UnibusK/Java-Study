<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>EL의 request 처리 실습</title>
		<style>
			#wrap{
				width:220px;
				border:4px dotted lightblue;
				padding:10px
			}
			input[type=submit]{
				width:100%;
				background-color:lightblue;
				border:0.5px solid blue;
			}
		</style>
	</head>
	<body>
	<!-- EL은 자바에서보다 가장 늦게 읽게 됨 -->
		<div id="wrap">
			<form method="post" action="test.jsp">
				아이디 : <input type="text" name="user"><br>
				비밀번호 : <input type="password" name="pw"><br>
				<hr>
				좋아하는 계절 <br>
				<input type="checkbox" name="season" value="spring">봄
				<input type="checkbox" name="season" value="summer">여름
				<input type="checkbox" name="season" value="fall">가을
				<input type="checkbox" name="season" value="winter">겨울<br>
				<br>
				<input type="submit" value="제출">
			</form>
			<hr>
			<form method="post" action="add.jsp">
				<input type="text" name="first">+<input type="text" name="second"><br>
				<input type="submit" value="더하기">
			</form>
		</div>
	</body>
</html>