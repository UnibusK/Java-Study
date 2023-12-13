<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//자바코드는 이 기호 내부에 작성합니다.
	//스크립트릿
	System.out.println("여기는 콘솔에 출력");
	out.print("<h1> 여기는 화면에 출력</h1>");
	out.print("<h2> 매번 이렇게 해야합니까????</h2>"); //가독성이 안좋다. //백엔드 개뱔자가 모든 태그를 알아야 한다.//문제점 많아

	//스크립을 벗어났을 경우에 html을 바로 읽을 수 있게 코드가 변경되어 확인 됨
%>

//html 코드 부분이라서 주석처리 안됨, html 주석으로 처리해줘야 함 <br>
<!-- html 주석으로 인식할 수 있게 처리 F12에서 볼 수 있음, 따라서 자바주석으로 달아줄 것!!-->
<%
// 이거는 웹페이지에서 보이지 않음
	out.print("<script>");
		out.print("let a = confirm('for문(0~5)을 돌리겠습니까?');");
			out.print("if (a == true) {document.write('for문 출력 확인함 <br>');");
				out.print("for (let i = 0; i<=5; i++){");
				out.print("(document.write(i));");
				out.print("(document.write('<br>'));}}");
			out.print("else {document.write('for 문 출력 취소함<br>');}");

	out.print("</script>");
%>

<h3> 이건 바로 읽힘 </h3>