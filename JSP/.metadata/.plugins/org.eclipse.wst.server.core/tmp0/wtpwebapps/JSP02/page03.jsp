<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
	<html>
	<head>
		<meta charset="UTF-8">
		<title>for문 페이지</title>
	</head>
	<body>
		<h1>여기는 3페이지 입니다.</h1>

		<script>
			let i;
			let s = prompt("반복하고 싶은 문자를 적어주세요");
			let a = Number(prompt("반복 횟수 넣어주세요"));
			
			for(i=0; i<a; i++) {
				document.write(s+"<br>");
			}
		</script>
		<a href="index.jsp">메인으로 돌아가기 </a>
	</body>
</html>