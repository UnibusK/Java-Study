<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.net.*" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>인클루드 확인</title>
	</head>
	<body>
		<div id="wrap">
		<!-- param은 parameter(매개변수)의 약자, input태그와 비슷하게 생각하면 됨 -->
		<!-- 단태그가 아니기 때문에 안에 내용이 들어갈 수 있음 -->
		<!-- 주석을 jsp 안에 넣으면 안됨 -->
			<jsp:include page="data.jsp"> 
				<jsp:param name="nm" value="김우주"></jsp:param> 
				<jsp:param name="edit" value='<%=URLEncoder.encode("김우주", "UTF-8") %>'></jsp:param>
			</jsp:include>
			<hr>
			<h3>이 내용은 index.jsp에 있던 내용입니다.</h3> 
		</div>
	</body>
</html>