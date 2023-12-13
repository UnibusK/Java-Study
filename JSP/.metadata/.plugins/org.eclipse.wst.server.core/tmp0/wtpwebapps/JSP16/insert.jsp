<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>회원가입 페이지</title>
		<style>
			#wrap{
				width:300px;
				margin:0 auto;
				border: 10px solid #999999;
				padding: 50px;
				backgraonnd-color:#eeeeee;
			}
			span{
				display:inline-block;
				width:80px;
				font-weight:bold;
			}
			input:last-child{
				width: 150px;
				heigth:100px;
				display: block;
				margin: 10px auto;
			}
			
		</style>
	</head>
	<body>
		<div id = "wrap">
			<form method="post" action="join.jsp">
				<span>아이디  </span><input type="text" name="id" value="아이디"><br>
				<span>비밀번호  </span><input type="password" name="pw" value="비밀번호"><br>
				<span>이름  </span><input type="text" name="nm" value="이름"><br>
				<span>e-mail  </span><input type="text" name="email" value="email"><br>
				<span>연락처  </span><input type="text" name="ph" value="연락처"><br>
				<span>주소  </span><input type="text" name="ad" value="주소"><br>
				<input type="submit" value="회원가입">
			</form>
		</div>
	</body>
</html>