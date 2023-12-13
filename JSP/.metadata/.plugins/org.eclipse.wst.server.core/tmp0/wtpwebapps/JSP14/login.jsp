<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>로그인 처리 페이지</title>
	</head>
	<body>
		<%
			Connection conn=null;
			Statement stmt=null;
			ResultSet rs=null;
			
			String url="jdbc:mysql://127.0.0.1:3306/sample";
			String db_id="root";		//데이터 베이스 접속시 id 값
			String db_pw="iotiot";
			
			request.setCharacterEncoding("UTF-8"); 	//아이디 비번이 꼭 영어일 필요는 없다. 한글로 해도 괜찮지만 신경쓰기 싫어서 그런 거임
			String user=request.getParameter("id");	//리쿼스트로 들어온 id 값 name=id
			String pass=request.getParameter("pw");	//리퀘스트로 들어온 pw 값 name=pw
			
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn=DriverManager.getConnection(url, db_id, db_pw);		//데이터베이스 여러개인 것을 만들 경우도 있음
				String sql="select * from register where id='"+user+"';";
				stmt=conn.createStatement();
				rs=stmt.executeQuery(sql);
				while(rs.next()){
					String num=rs.getString("num");
					String name=rs.getString("name");
					String pw=rs.getString("pass");
					String email=rs.getString("email");
					String phone=rs.getString("phone");
					String address=rs.getString("address");
					if(pw.equals(pass)){
						System.out.println("로그인 성공");
						session.setAttribute("num", num);
						session.setAttribute("name", name);
						session.setAttribute("email", email);
						session.setAttribute("login", true); 	//앞에 들어가는 것이 키, 뒤에들어가는게 value (키, 값)
//						out.print("<p>"+num+"</p>");
//						out.print("<p>"+name+"</p>");
//						out.print("<p>"+pw+"</p>");
//						out.print("<p>"+email+"</p>");
//						out.print("<p>"+phone+"</p>");
//						out.print("<p>"+address+"</p>");
					} else {
						out.print("<p>로그인 실패!!</p>");
					}
				}
			}catch(Exception e){
				System.out.println("로그인 정보 확인 중 오류 발생 : "+ e);
			}finally{
				try{
					if(rs!=null)rs.close();
					if(stmt!=null)stmt.close();
					if(conn!=null)conn.close();
				}catch(Exception ex){
					System.out.println("로그인정보 확인 해제 중 오류발생 : " + ex);
				}
			}
			response.sendRedirect("index.jsp");
		%>
	</body>
</html>