<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>JSTL if문</title>
	</head>
	<body>
		<div id="warp">
			<form method="get" action="select.jsp">
				색상을 선택하세요
					<select name="color">
					<option value="1">빨강</option>
					<option value="2">주황</option>
					<option value="3">노랑</option>
					<option value="4">초록</option>
					<option value="5">파랑</option>
					<option value="6">남색</option>
					<option value="7">보라</option>
				</select>
				<input type="submit" value="전송">
			</form>		
		</div>
	</body>
</html>