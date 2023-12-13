<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- 스크립트릿 레노테이션 -->
<%@ page import="java.text.*" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>결제 페이지</title>
	</head>
	<body>
		<%
			request.setCharacterEncoding("UTF-8");
			String comp=request.getParameter("hid1"); //컴퓨터가 몇대인지 확인
			String phone=request.getParameter("hid2"); //스마트폰 몇대인지 확인
			System.out.println("컴퓨터 : "+comp);
			System.out.println("스마트폰 : "+phone);
		
			if(comp==null || phone==null) {
				out.print("<h1 style='color:red;'> 잘못된 경로로 접근 하셨습니다.<h1>");
			}else if(comp.equals("0") && phone.equals("0")){
				out.print("<h1 style='color:blue;'> 구매하신 상품이 없습니다<h1>");
			} else {
				int price1=Integer.parseInt(comp)*1000000;
				int price2=Integer.parseInt(phone)*1500000;
				int result=price1 + price2;
				//데시멀포멧 클래스로 이용해서 금액 쉼표 나타낼 수 있음
				//천단위 구분기회 적는 방법
				DecimalFormat df=new DecimalFormat("#,###"); //뒤에서부터 3자리 마다 쉼표를 찍어라
				String change = df.format(result);
				System.out.println("컴퓨터 구매 수 : " +comp);
				System.out.println("컴퓨터 구매 급액 : " + price1);
				System.out.println("스마트폰 구매 수 : " + phone);
				System.out.println("스마트폰 구매 금액 : " + price2);
				System.out.println("구매 총액 : "+ change);

			}
		%>
	</body>
</html>