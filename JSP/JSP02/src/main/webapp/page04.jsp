<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>4페이지</title>
		<style>
			table,td,tr,th {
				border: 1px solid gray;
			}
		</style>
	</head>
	<body>	
		<h1>여기는 4페이지 입니다.</h1>

		<table>
		<tr>
			<th>첫번째</th>
			<%
			for (int i = 1; i<=4; i++){
				String td = "<td> 1-"+i+"</td>";
				out.print(td);
			}
			%>
		</tr>
		<tr>
			<th> 두번째</th>
			<%
			for (int i = 1; i<=4; i++){
				String td = "<td> 2-"+i+"</td>";
				out.print(td);
			}
			%>
		</tr>
		</table>
		<br>
		<a href="index.jsp">메인으로 돌아가기 </a>
	</body>
</html>