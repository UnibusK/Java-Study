<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>계산 결과</title>
		<style>
			table,td,tr,th {
			border-collapse: collapse;
			border: 1px solid black; 
			}
		</style>
	</head>
	<body>
		<%
			String c = request.getParameter("com");
			String p = request.getParameter("phone");
			int intC = Integer.parseInt(c);
			int intP = Integer.parseInt(p);
		%>
		<%
			if(intC == 0 && intP ==0) {
		%>
				<h1> 수량을 입력하세요 </h1>
		<%
			} else {
		%>
			<table>
			<tr>
				<th>상품명</th>
				<th>가격</th>
				<th>수량</th>
				<th>합계</th>
			</tr>
			<tr>
				<td>컴퓨터</td>
				<td id = "comPrice">1,000,000</td>
				<td>
					<%=c %>
				</td>
				<td> 
					<%=intC * 1000000 %>
				</td>
			</tr>
			<tr>
				<td>스마트폰</td>
				<td id ="phPrice">1,500,000</td>
				<td>
					<%=p %>
				</td>
				<td>
					<%=intP * 1500000 %>
				</td>
			</tr>
			<tr>
				<td colspan="4">
					<h1>결제총액</h1>
					<h1 id="result">결과계산 : <%= intC*1000000 + intP*1500000 %>원</h1>
				</td>
			</tr>
		</table>
		<%
			}
		%>
	</body>
</html>