<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
	<html>
	<head>
		<meta charset="utf-8">
		<title>다른 인풋의 전송처리</title>
	</head>
	<body>
		<!-- 버튼타입(type=button)은 모양은 남아있지만, input으로 기능이 없다. -->
		<!-- type=submit으로 데이터를 전송할 수 있다. -->
		<div id="wrap">
			<form method="get" action="data.jsp">
				<input type="button" value="버튼입니다." name="btn"><br>
				<input type="checkbox" value="체크박스1" name="cb">체크1<br>
				<input type="checkbox" value="체크박스2" name="cb">체크2<br>
				<input type="checkbox" value="체크박스3" name="cb">체크3<br>
				<input type="checkbox" value="체크박스4" name="cb">체크4<br>
				<input type="checkbox" value="체크박스5" name="cb">체크5<br>
				<input type="submit" value="전송입니다." name="sub"><br>
			</form>
		</div>
	</body>
</html>