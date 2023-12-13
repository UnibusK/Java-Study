<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>회원정보 입력 페이지</title>
	</head>
	<body>
		<%
			Connection conn=null;
			Statement stmt=null;
			String url ="jdbc:mysql://127.0.0.1:3306/sample";
			String db_id="root";
			String db_pw="iotiot";
			
			request.setCharacterEncoding("UTF-8");
			
			String id=request.getParameter("id"); // 앞쪽은 변수이름, 뒤에id는 input태그 네임
			String pw=request.getParameter("pw");
			String name=request.getParameter("nm");
			String email=request.getParameter("email");
			String phone=request.getParameter("ph");
			String address=request.getParameter("ad");
			
			String sql="insert into register(id, pass, name, email, phone, address)";
			sql+=" values ('"+id+"', '"+pw+"', '"+name+"', '"+email+"', '"+phone+"', '"+address+"');";
			System.out.println(sql);
			try{
				Class.forName("com.mysql.cj.jdbc.Driver"); //
				conn=DriverManager.getConnection(url, db_id, db_pw);
				stmt=conn.createStatement();
				out.print("<h1>이상없음 동작확인</h1>");
				stmt.execute(sql); 	//resultset이 없는 쿼리문(insert문)이므로 excuteQuery사용 불가
				response.sendRedirect("member.jsp");
			}catch(Exception e) {
				System.out.println("회원가입 접속 중 오류 발생"+ e);
			}finally{
				try{
					if(stmt!=null)stmt.close();
					if(conn!=null)conn.close();
					
				}catch(Exception ex){
					System.out.println("회원가입 접속 해제중 오류발생: " + ex);
				}
			}

			
		%>

	</body>
</html>