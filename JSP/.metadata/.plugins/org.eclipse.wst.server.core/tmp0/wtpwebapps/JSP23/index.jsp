<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>EL의 사용</title>
	</head>
	<body>
		<!-- EL : Expression Language, 표현언어 -->
		<!-- 줄임말을 통해 코드의 가독성을 확보하는 방법 -->
		
		<!-- Java 코드를 직접 출력하는 방법 -->
		<%
			out.print("TEST<br>");
		%>
		
		<!-- 스크립트릿 표현식을 사용하는 방법 -->
		<%="TEST<br>" %>
		
		<!-- EL을 사용하는 방법 -->
		${"TEST"}<br>		
		<hr>
		
		<!-- EL의 종류 -->
		<h4>EL의 종류</h4>
		정수형 : ${10 } <br>
		실수형 : ${2.5 } <br>
		문자열형 : ${"김우주 해낸다" }<br>
		논리형 : ${true }<br>
		NULL : ${null }<br> <!-- null은 값이 화면에 표시가 안됌 -->
		<hr>
		<!-- EL의 계산 -->
		<h4>EL의 계산</h4>
		\${2+3 } = ${2+3 } <br>
		\${4-6 } = ${4-6 } <br>
		\${4*2 } = ${4*2 } <br>
		\${7/8 } = ${7/8 } <br>
		\${10 div 2 } = ${10 div 2 } <br>
		\${9%10 } = ${9%10 }  <br>
		\${13 mod 15 } = ${13 mod 15 } <br>
		<hr>
		<!-- EL의 비교연산(관계연산) : 계산의 결과가 true 또는 false으로 나온다. -->
		<h4>EL의 비교연산(관계연산) : 계산의 결과가 true 또는 false으로 나온다.</h4>
		\${1==2 } : ${1==2 } <br>
		\${1 eq 2 } : ${1 eq 2 } <br> <!-- equal의 약자 -->
		\${3!=4 } : ${3!=4 } <br>
		\${3 ne 4 } : ${3 ne 4 } <br> <!-- negative equal 의 약자 -->
		\${5<6 } : ${5<6 } <br>
		\${5 lt 6 } : ${5 lt 6 } <br> <!-- little than의 약자 -->
		\${7>8 } : ${7>8 }  <br>
		\${7 gt 8 } : ${7 gt 8 }  <br> <!-- greater than의 약자 -->
		\${9<=10 } : ${9<=10 } <br>
		\${9 le 10 } : ${9 le 10 }  <br> <!-- little equal 의 약자 -->
		\${11>=12 } : ${11>=12 }  <br>
		\${11 ge 12 } : ${11 ge 12 }  <br> <!-- greater equal의 약자-->
		<hr>
		<!-- EL의 논리연산 -->
		<h4>EL의 논리연산</h4>
		\${true&&false } : ${true && false } <br>
		\${true || false } : ${treu || false } <br>
		\${!true } : ${!true } <br> 
		<hr>
		<!-- EL의 null 확인연산 -->
		<h4>EL의 null 확인연산</h4>
		\${empty null } : ${empty null } <br>
		
	</body>
</html>