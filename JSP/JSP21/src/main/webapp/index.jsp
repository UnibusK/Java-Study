<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--임폴트를 안할 경우 클래스명 앞에 "beans.클래스명" 으로 작성해도 됨 --%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>자바빈의 사용</title>
	</head>
	<body>
	<%-- 기본 getter setter 사용하는 방법
		<%
			Student s=new Student();
			s.setName("김우주");
		%>
		<h1><%=s.getName() %></h1> --%>

	<%--scope는 데이터의 잔존하는 곳을 표시하는 것, session으로 지정할 수도 있음--%>
	<!-- class 부분에는 객체를 생성할 class명을 적는다. -->
	<!-- id 부분은 객체의 이름을 적는다. -->
	<!-- scope 부분에는 객체가 유지될 범위를 적는다. -->
	<!-- jsp:useBean이 실행되면 객체를 생성한 것과 같은 효과를 가진다. -->
	<jsp:useBean class="beans.Student" id="s" scope="page"></jsp:useBean>
	<%
		s.setName("김태양");
	%>
	<h1>이름 : <%=s.getName() %></h1>
	<!-- 프레임웍이기 때문에 형식을 그대로 갖추어야 동작을 하는 것임 -->
	<!-- name : 생성된 객체의 이름(id)를 적는다, 목적지, 객체의 이름 -->
	<!-- property: 참조할 필드의 이름을 적는다. setter, getter가 있어야 하는 필드명 -->
	<!-- value: 매개변수에 들어갈 값을 적는다. -->
	<!-- setProperty는 setField(value)실행 시키고 getProperty는 getField()실행 -->
	<jsp:setProperty name="s" property="age" value="1"></jsp:setProperty>
	<%
		//같은 뜻
		//s.setAge(29);
	%>
	<!-- S객체를 참조해서 age라는 필드를 가져옴, java에 getAge가 있어야 읽을 수 있음 -->
	<h1>나이 : <jsp:getProperty name="s" property="age"></jsp:getProperty></h1>
	<%
		//같은 뜻
		//s.getAge();
	%>
	<jsp:setProperty name="s" property="address" value="우주네 집"></jsp:setProperty>
	<h2>사는곳 : <jsp:getProperty name="s" property="address"></jsp:getProperty></h2>
	<hr>
	<jsp:useBean class="beans.Student" id="stu" scope="page"></jsp:useBean>
	<jsp:setProperty name="stu" property="age" value="1"></jsp:setProperty>
	<jsp:setProperty name="stu" property="name" value="김지구"></jsp:setProperty>
	<jsp:setProperty name="stu" property="address" value="우주네 house"></jsp:setProperty>
	
	<h1><jsp:getProperty name="stu" property="name"></jsp:getProperty></h1>
	<h1><jsp:getProperty name="stu" property="age"></jsp:getProperty></h1>
	<h2><jsp:getProperty name="stu" property="address"></jsp:getProperty></h2>
	
	<!-- action tag의 scope범위 : 데이터가 잔존해서 유지되는 범위를 뜻함, java 코드와 html코드로 지정할 수 있음 -->
	<!-- page : 단일 페이지 내에서만 유지 -->
	<!-- request : 1회의 request 범위에서 유지 -->
	<!-- session : session이 만료되기 전까지 단일 사용자에게 유지 -->
	<!-- application : 모든 페이지 모든 사용자에게 유지 -->
	
	</body>
</html>