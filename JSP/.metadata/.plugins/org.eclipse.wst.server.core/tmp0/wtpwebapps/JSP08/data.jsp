<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>데이터 받는 페이지</title>
	</head>
	<body>
		<%
			request.setCharacterEncoding("UTF-8");
			
			String b=request.getParameter("btn");
			String s=request.getParameter("sub");
			//동일한 name을 가진 여러 input을 데이터를 보낸 경우, 그중 최초의 하나만 인식된다.
			//데이터가 베열이 아니라서....
			//request.getParameter(String name) {return String value;}
			//String c=request.getParameter("cb");
			String[] c = request.getParameterValues("cb");
		%>
		
		<h1>버튼으로 부터 데이터 : <%=b %></h1>
		<h1>submit으로 부터 데이터 : <%=s %></h1>
		<!-- 배열객체를 출력하면 객체의 주소가 보임, 데이터가 보이지 않음 -->
		
		<%
		if(c!=null) {
			for(int i = 0; i<c.length; i++){
				%>
				<h1>체크박스로부터 데이터 : <%=c[i] %></h1>
				<%
			}
		}
		%>
		
		
		<h1>체크박스로부터 데이터 : <%=c %></h1>
	</body>
</html>