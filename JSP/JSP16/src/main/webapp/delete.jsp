<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원정보 삭제 처리 페이지</title>
	</head>
	<body>
		<%
			Connection conn=null;
			Statement stmt=null;
			String url="jdbc:mysql://127.0.0.1:3306/sample";
			String db_id="root";
			String db_pw="iotiot";
			
			request.setCharacterEncoding("UTF-8");
			String number=request.getParameter("del");
			
			String sql="delete from register where num="+number+";";
			out.print(sql);
			
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn=DriverManager.getConnection(url, db_id, db_pw);
				stmt=conn.createStatement();
				int result= stmt.executeUpdate(sql);
				System.out.println("삭제된 회원 수 : " + result);
				response.sendRedirect("member.jsp");
			}catch(Exception e){
				System.out.println("회원정보 삭제 중 오류 발생 : " + e); //오류에 대한 부분은 자세히 남길 수록 좋다.
			}finally{
				try{
					if(conn!=null)conn.close();
					if(stmt!=null)stmt.close();
				}catch(Exception ex){
					System.out.println("회원정보 삭제 접속 해제중 오류 발생 : " + ex);
				}
			}
		%>
	</body>
</html>