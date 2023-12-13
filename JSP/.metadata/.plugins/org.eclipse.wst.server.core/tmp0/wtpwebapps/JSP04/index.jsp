<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>표현방법</title>
	</head>
	<body>
		<%
			//스크립트릿 : 내부에서는 java언어를 사용할 수 있다. html, 자바스크립언어 안됨
			//<h1>오류</h1>
			//prompt();
			//alert();
			String c="<h1 style='color:orange;'>외부표현</h1>";
			out.print(c);
			String b = "blue";
			//디자인 우선순위(높은것 부터)
			//1. 사용자 디자인(블루라이트 필터, 나이트모드, 화면밝기, 썬글라스 등)
			//2. 개발자 디자인(개발자가 직접 적어놓은 디자인)
			//	2-1. 인라인디자인(태그에 직접 style 스타일을 적은 경우)
			//	2-2. 내,외부 style sheet 혹은 style 태그 이용한 디자인(link rel='stylesheet')
			//		2-2-1. 아이디선택자 디자인(#id))
			//		2-2-2. 클래스선택자 디자인(.class)
			//		2-2-3. 태그선택자 디자인(h1)
			//		2-2-4. 전체선택자 디자인(*)
			//3. 기본 디자인 태그 스타일(적지 않아도 기본적으로 있는 디자인)
			//4.  
		%>
		<%=c %> <!-- 해당 변수를 출력 == out.print와 같은 뜻 -->
		<h1 style="color:<%=b %>; text-align:center;">외부표현</h1>
		<%
			String[] colorArr = new String[7];
			colorArr[0] = "red";
			colorArr[1] = "orange";
			colorArr[2] = "yellow";
			colorArr[3] = "green";
			colorArr[4] = "blue";
			colorArr[5] = "navy";
			colorArr[6] = "purple";
			//System.out.println(colorArr[4]);
			int cnt=0;
			int j = colorArr.length;
			for(int i = 0; i<100; i++) {
				out.print("<h1 style='color:"+colorArr[i % j]+";''> 다음색상을 표현 : " +colorArr[i % j]+" </h1>");
				cnt++;
			}
			System.out.println(cnt);
			
		%>
		<%
		// 동일한 방법
			for(int i = 0; i<10; i++) {
				
		%>
				<h1 style='color:<%=colorArr[i % j] %>;'>다음색상을 표현</h1>
		<%
				cnt++;
				}
				System.out.println(cnt);
		 		%>
	</body>
</html>