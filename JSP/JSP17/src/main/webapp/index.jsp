<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" href="css/style.css">
		<title>인클루드 연습</title>
	</head>
	<body>
		<div id ="wrap">
			<jsp:include page="header.jsp"></jsp:include>
			<P>본문은 이곳에 작성합니다.</P>
			<h1>여기는 index.jsp 입니다.</h1>
			<p>내용을 적어주세요</p>
			<p>다른 페이지를 보려면 <a href="next.jsp">여기</a>를 눌러주세요</p>
		</div>
	</body>
</html>