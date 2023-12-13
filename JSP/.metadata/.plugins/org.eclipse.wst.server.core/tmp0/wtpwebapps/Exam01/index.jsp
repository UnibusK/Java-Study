<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>가격 계산하기</title>
		<style>
			table,td,tr,th {
			border-collapse: collapse;
			border: 1px solid black; 
			text-align : center;
			}
		</style>
	</head>
	<body>
		<table>
			<tr>
				<th>상품명</th>
				<th>가격</th>
				<th>수량</th>
			</tr>
			<tr>
				<td>컴퓨터</td>
				<td id = "comPrice">1000000</td>
				<td >
					<select id ="comE"  onchange="calu()">
						<option>0</option>
						<option>1</option>
						<option>2</option>
						<option>3</option>
						<option>4</option>
						<option>5</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>스마트폰</td>
				<td id ="phPrice">1500000</td>
				<td>
					<select id = "phE"  onchange="calu()">
						<option>0</option>
						<option>1</option>
						<option>2</option>
						<option>3</option>
						<option>4</option>
						<option>5</option>
					</select>
				</td>
			</tr>
			<tr>
				<td colspan="4">
					<form method="post" action="pay.jsp">
					<h1>결제총액</h1>
					<h1 id="result"> 0원</h1>
					<input type="submit" value="결제하기" >
					<input type="hidden" name="com" value="0">
					<input type="hidden" name="phone" value="0">
					</form>
				</td>
			</tr>
		</table>
				
		<script>
			function calu() {
				let comE = parseInt(document.getElementById("comE").value);
				let comP = parseInt(document.getElementById("comPrice").textContent);
				let phE = parseInt(document.getElementById("phE").value);
				let phP = parseInt(document.getElementById("phPrice").textContent);
				
				document.getElementById("result").innerHTML = (comE * comP + phE * phP).toLocaleString() + "원";
				
				document.getElementsByName("com")[0].value=document.getElementById("comE").value
				document.getElementsByName("phone")[0].value=document.getElementById("phE").value
			}

		</script>		
	</body>
</html>