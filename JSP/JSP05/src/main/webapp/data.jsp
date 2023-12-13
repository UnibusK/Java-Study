<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>데이터를 전송받는 페이지</title>
	</head>
	<body>
		<h1>여기서 데이터를 전송 받습니다.</h1>
		<%
			//?number=200
			//http:
				//data.jsp
				//?
				//A
				//=8984
				//&
				//b
				//=%EC%A0%84%EB%B2%88 (=전번)
			String data = request.getParameter("A");
			String data2 = request.getParameter("B");
			String data3 = request.getParameter("C");
			String setID = request.getParameter("id");
			String setPassword = request.getParameter("password");
			int data3Num = 0;
			data3Num=Integer.parseInt(data3); //String 타입을 int로 형번환
		%>
		<%=data %>
		<%=data2 %>
		<%=data3 %>
		<h<%=data3 %> style="color:<%=data2 %>;"> 안녕<%=data %> </h<%=data3 %>>
		<%
			for(int i=0; i<data3Num ; i++) {
				out.print("<h1 style='color:"+data2+";'>" + data+ "</h2>");
				out.print("<br>");
			}
		
			if(setID == "김우주") {
				out.print("반갑습니다. "+setID+  "님");
			}
		%>
	</body>
</html>