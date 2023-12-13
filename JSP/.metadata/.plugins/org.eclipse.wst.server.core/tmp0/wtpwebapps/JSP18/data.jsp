<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.net.*" %>
<div id="data">
	<%
		request.setCharacterEncoding("UTF-8");
		
		String name=request.getParameter("nm");
		String edit=request.getParameter("edit");
		String result=URLDecoder.decode("김우주", "UTF-8");
	%>
	<h1><%=name %>님 접속을 환영합니다.</h1>
	<h1><%=edit %>님 접속을 환영합니다.</h1>
	<h1><%=result %>님 접속을 환영합니다.</h1>
</div>