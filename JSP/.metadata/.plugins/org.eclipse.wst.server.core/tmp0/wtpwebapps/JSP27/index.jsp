<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>JSTL</title>
	</head>
	<body>
		<%
			//JSTL : Java Sever Page Stiandard Tag Library - 표준라이브러리이다.
			//톰캣 홈페이지에서 다운받아서 web-inf>lib에 붙여넣기
			//jstl을 사용하기 위해서는 tag라이브러리를 불러와야 한다. (윗줄,)
			//url : uniform resource locator, 해당 자료의 위치를 표기하는 방법, 사이트의 도메인과 동일
			//urn : uniform resource name, 해당 자료의 이름
			//uri : uniform resource identifier, 해당 자료의 고유 식별자, 변수명 같은 고유한 이름(주소와 이름값을 모두 포함한 개념)
			
			//JSTL의 종류
			//기본기능 	: core 		: c 	: http://java.sun.com/jsp/jstl/core
			//형식변환 	: fomat 	: fmt 	: http://java.sun.com/jsp/jstl/fmt
			//DB조작 		: sql 		: sql 	: http://java.sun.com/jsp/jstl/sql
			//XML조작 	: xml 		: x 	: http://java.sun.com/jsp/jstl/xml
			//함수처리 	: function 	: fn 	: http://java.sun.com/jsp/jstl/fn
			
		%>
		
		<!-- c:out 값을 출력한다.-->
		<c:out value="jstl출력"></c:out><br>
		${"EL의 출력" } <br>
		<%="Scriptet 출력"%> <br>
		<% out.print("java출력 방식"); %> <br>
		
		<!-- c:set 값을 입력한다. -->
		<c:set var="test" value="jstl로 저장합니다." scope="page"></c:set>
		${test }
	</body>
</html>