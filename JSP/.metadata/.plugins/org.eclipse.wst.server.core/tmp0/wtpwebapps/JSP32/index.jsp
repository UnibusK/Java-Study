<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--포멧 태그 불러오기 --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>JSTL 포멧태그 사용</title>
	</head>
	<body>
		<c:set var="num" value="50000000" scope="page"></c:set>
		<%-- 표시만 문자가 섞여서 나오는 것일 뿐, 실제 데이터는 숫자 --%>
		fmt:number : <fmt:formatNumber value="${num }" type="number"></fmt:formatNumber><br>
		fmt:number 구분기호 없음 : <fmt:formatNumber value="${num }" type="number" groupingUsed="false"></fmt:formatNumber><br>
		fmt:percent %표기 : <fmt:formatNumber value="0.5" type="percent"></fmt:formatNumber><br>
		fmt:currency 단위표기 : <fmt:formatNumber value="5000" type="currency"></fmt:formatNumber><br>
		<%--한국데이터이기 때문에 \로 표시되기 때문에 내용을 $등 으로 바꿀 때 사용 --%>
		fmt:currency 단위변경 : <fmt:formatNumber value="5000" type="currency" currencySymbol="$"></fmt:formatNumber><br>
		<%-- 소수점 표시 #까지 반올림해서 표시 --%>
		<%-- 해당 자리숫자보다 작을 경우, #자리는 포함하지 않고 소수점 첫번째까지만 표현함 --%>
		<%-- 0.00으로 사용할 경우 해당 자릿수까지 표현 --%>
		fmt:pattern 패턴(서식)표기 : <fmt:formatNumber value="1234.123" pattern="0.0#"></fmt:formatNumber><br>
		fmt:pattern 패턴(서식)표기 : <fmt:formatNumber value="1234123" pattern="0,00"></fmt:formatNumber><br>
		fmt:pattern 패턴(서식)표기 : <fmt:formatNumber value="1234.123" pattern="0,0.0#"></fmt:formatNumber><br>
		fmt:pattern 패턴(서식)표기 : <fmt:formatNumber value="1234.1234" pattern="000000,000.0#"></fmt:formatNumber><br> <!-- 게임 점수판 만들때 많이 사용함 -->
		<!-- 0.0# : .아래로 0이 붙은 자릿수까지 표현하며 #자리는 데이터가 있는 경우에만 표현한다. -->
		<!-- 0,00 : 정수부분 뒤에서 숫자 2자리마다 ,가 붙게되어 이것으로 구별한다는 의미-->
		<!-- 0,0.0# : 정수부분 한자리마다 ,를 붙이고, 소수부분 2째자리 수까지 표현, #자리에 데이터 없으면 생략 -->
		<!-- 0이 있는 만큼 숫자를 준비하고 그에 맞게 숫자를 표현함 -->
		<hr>
		<!-- 서버가 있는 나라에 따라서 시차가 발생할 수 있다. -->
		<!-- 로케이션을 통해서 시차를 통일 시켜줘야 한다. -->
		<c:set var="date" value="<%=new java.util.Date() %>" scope="page"></c:set>
		\${date } : ${date }<br>
		fmt:formatDate 기본형태 : <fmt:formatDate value="${date }"></fmt:formatDate><br>
		fmt:time : <fmt:formatDate value="${date }" type="time"></fmt:formatDate><br>
		fmt:both : <fmt:formatDate value="${date }" type="both"></fmt:formatDate><br>
		fmt:pattern : <fmt:formatDate value="${date }" pattern="yyyy년 MM월 dd일 hh시 mm분 ss초"></fmt:formatDate>
	</body>
</html>