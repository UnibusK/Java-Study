<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>두번째로 가져오기</title>
	</head>
	<body>
		<jsp:useBean class="data.Register" id="one" scope="session"></jsp:useBean>
		<!-- post로 받은 모든 데이터 자바에 세팅하기 -->
		<h1>next.jsp 입니다.</h1>
		<p><span>이름 : </span><jsp:getProperty name="one" property="name"></jsp:getProperty></p>
		<p><span>아이디 : </span><jsp:getProperty name="one" property="userId"></jsp:getProperty></p>
		<p><span>비밀번호 : </span><jsp:getProperty name="one" property="pass"></jsp:getProperty></p>
		<p><span>폰번호: </span>
		<jsp:getProperty name="one" property="first"></jsp:getProperty> -
		<jsp:getProperty name="one" property="second"></jsp:getProperty> -
		<jsp:getProperty name="one" property="third"></jsp:getProperty></p>
	</body>
</html>