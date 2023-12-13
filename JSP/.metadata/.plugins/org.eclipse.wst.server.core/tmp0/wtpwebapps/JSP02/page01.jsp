<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>1페이지</title>
	</head>
	<body>
		<H1>1페이지 입니다.</H1>
		
		<!-- 양수와 음수를 구별하는 자바코드를 작성하시오 -->

		<%
			int number=-20;
			String s1="<h3>"+number+" : ";
			String s2="입니다. </h3>";
			if(number<0) {
				out.print(s1+"음수"+s2);
				s1+="음"; //위 코드와 같은 방법
			} else if (number>0) {
				out.print(s1+"양수"+s2);
				s1+="양";
			} else {
				out.print(s1+"0"+s2);
				s1+="0"; 
			}	
			s1+="수입니다. </h3>"; // 반복되는 것을 변수로 넣어서 프린트 하는 방법
			out.print(s1);
		%>
		
		<%
			for(int i=1; i<=6; i++) {
				out.print("<h"+i+"> 글자 크기 확인</h"+i+">");

			}
		%>
		<!-- 다른 방법 -->
	
	
		<%
			for(int i=6; i>=1; i--) {
		%>
				<h <%=i %> > 글자 크기 확인!!!</h <%=i %> >

		<%	
			}
		%>

		<br>
		<a href="index.jsp">메인(index) 페이지로 돌아가기</a>
		<script>
			alert("1페이지 입니다. 환영합니다.");
		</script>
	</body>
</html>