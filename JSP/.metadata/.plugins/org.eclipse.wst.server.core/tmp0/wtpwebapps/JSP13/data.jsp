<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>���� ������ �����޴� ������</title>
	</head>
	<body>
		<h1>data.jsp �Դϴ�.</h1>
		<%
			request.setCharacterEncoding("UTF-8");
			String sel=request.getParameter("data");
			session.setAttribute("key", sel);
			String inText=request.getParameter("userText");
			session.setAttribute("outText", inText);
		%>
		<h1>post�� ���� ������ : <%=sel %></h1>
		<h3>outText : <%=inText %></h3>
		<a href="view.jsp">���� ������ Ȯ��</a><br>
		<a href="view2.jsp">��2 ������ Ȯ��</a><br>
		<hr>
		<a href="index.jsp">�ε����� ���ư���</a>
		
	</body>
</html>