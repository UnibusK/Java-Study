<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>EL과 Scope 처리</title>
	</head>
	<body>
		<%
			//스코프 : 데이터가 사라지지않고 존재할 수 있는 범위
			//********** 매우 중요
			//변수는 자기가 만들어진 함수가 끝나면 소멸한다
			//1. pageScope : 현재 페이지에서 데이터를 유지, 다른 jsp 파일에서 사용 불가 -> 개발자가 직접 적어넣은 것들 
			//2. requestScope : Request에서 데이터를 유지, Request의 대상이 된 jsp 파일에서만 사용 가능 -> 사용자가 input으로 입력한 것들
			//3. sessionScope : 단일 사용자의 모든 페이지에서 데이터를 유지, 다른 사용자는 사용 불가
			//4. applicationScope : app단위에 모든 페이지에 데이터를 유지, 모든 사용자가 동등한 데이터 획득 -> 만든 응용프로그램에서 공유
			
			//데이터의 스코프 범위를 지정하는 방법
			pageContext.setAttribute("nm", "page Scope");
			request.setAttribute("nm", "request Scope");
			session.setAttribute("nm", "session Scope");
			application.setAttribute("nm", "application Scope");
		%>
		<h1>기본형 : ${nm }</h1>
		<h1>\${pageScope.nm } : ${pageScope.nm }</h1>
		<h1>\${requestScope.nm } : ${requestScope.nm }</h1>
		<h1>\${sessionScope.nm } : ${sessionScope.nm }</h1>
		<h1>\${applicationScope.nm } : ${applicationScope.nm }</h1>
	</body>
</html>