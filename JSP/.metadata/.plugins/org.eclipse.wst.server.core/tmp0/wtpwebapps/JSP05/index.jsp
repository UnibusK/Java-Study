<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<%
			//페이지가 여러개로 제작되어 있는 경우에는
			//한개의 페이지에서 특정 값을 다른 페이지로 이전해야 하는 경우가 있다.
			//기본적으로는 데이터는 만들어진 곳에서만 사용이 가능하고 다른페이지로 넘길 수 없다.
			int number=500;
		
			//데이터의 공유 범위 : Scope
			//PageScope : 한페이지 내부에서 해당 데이터가 사용 가능 -> 다른페이지에서 공유 불가
			//RequestScope :1회의 request에 해당 데이터가 사용가능
			//SessionScope : 하나의 사용자가 해당 데이터를 사용가능 -> 다른 모든페이지가 해당데이터 공유, 다른사용자는 공유 불가
							//로그인정보 등
			//ApplicationScope : 모든 사용자가 모든 페이지에서 공유 
			
			//*******매우 중요
			//get방식 
			//도메인 뒤쪽에 ? 변수=값을 통해 데이터를 다른 페이지로 전달하는 방법
			//<a>, <form> 또는 자바스크립트를 이용하여 입력한다.
		%>
		<!-- 도메인 뒤쪽에 ? 후에 값을 넣어서 데이터 전송하는 방식 : get 방식 -->
		<a href="data.jsp?number=<%=number%>">눌러서 다른페이지로 이동</a>
		<a href="data.jsp?number=999&name=지구">다른 값을 다른페이지로 이동</a>
		
		<form method="get" action="data.jsp">
/*			<fieldset>
				<legend>수업시간</legend>
				나타낼 문장 : <input type="text" name="A"><br>
				글씨색 : <input type="color" name="B"><br>
				반복횟수 : <input type="number" name="C">
				<input type="submit" value="전송">
			</fieldset>
/*			
			<fieldset>
				<legend>연습시간</legend>
				id : <input type="text" name="id"><br>
				P/W : <input type="password" name="passowrd"><br>
				<input type="submit" value="전송">
			</fieldset>
		</form>

	</body>
</html>