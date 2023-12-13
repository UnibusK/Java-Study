package test;

import java.sql.*; //sql을 이용한 통신을 진행할 때 필요한 class 가 들어가 있음
import java.util.*;

public class Conn {
	public static void main (String[] args ) {
		Connection conn=null;		//데이터베이스와 연결할 통신회선
		Statement stmt=null;		//java에서 데이터베이스로 데이터를 보내는 객체
		ResultSet rs=null;			//데이터베이스에서 java로 데이터를 가져오는 객체
		
		String url="jdbc:mysql://127.0.0.1:3306/sample";	//접속경로 
		String user="root"; 								//데이터베이스 접속 아이디
		String pw ="iotiot";								//접속 비밀번호
		
		try {
			conn=DriverManager.getConnection(url, user, pw);		//회선연결, , 회선객체는 하나만, 여러개일 경우 우선순위가 없음
			stmt=conn.createStatement(); 							//쿼리문을 전달해줄 객체 생성
			//ResultSet : 쿼리문의 결과로 반환되어오는 객체(select에서만 사용한다)
			//String sql = "select * from student;";
			//rs=stmt.executeQuery(sql);								//전달 및 결과받아옴
			//System.out.println("접속 이상없음");
			
//			rs.next();		//한줄의 데이터를 읽은 뒤 이터레이터를 아랫줄로 이동
//			String num=rs.getString(1);			//데이터 가져올 때 인덱스가 1부터 시작한다.
//			String name=rs.getString(2);		//데이터 두번째
//			String math=rs.getString(3);
//			String kor = rs.getString(4);
//			String eng = rs.getString(5);
//			String avg=rs.getString(6);
//			String sum =rs.getString(7);
//			System.out.println(num+"\t"+name+"\t"+math+"\t"+kor+"\t"+eng+"\t"+avg+"\t"+sum);
//			
//			rs.next();
//			num=rs.getString(1);
//			name=rs.getString(2);
//			math=rs.getString(3);
//			kor=rs.getString(4);
//			eng=rs.getString(5);
//			avg=rs.getString(6);
//			sum=rs.getString(7);
//			System.out.println(num+"\t"+name+"\t"+math+"\t"+kor+"\t"+eng+"\t"+avg+"\t"+sum);
			
			//데이터가 몇개가 될지 모르므로 while 문으로 진행
			//while(rs.next()) {
				//rs.next는 다음줄에 데이터가 있으면 true 반환, 없으면 false 반환
				//for (int i = 1; i<=7; i++) {
					//System.out.print(rs.getString(i)+"\t");
				//}
				//System.out.println();			
		//	}
			
			//insert 문은 ResultSet이 없다.
			//통상적으로 isnert문은 사용자가 입력한 내용을 변수에 담아 전달하므로 쿼리문으로 가공하여 statement에게 전달한다.
			
			String name="윤똥깨";
			String math="100";
			String kor="100";
			String eng="100";
			String avg="100";
			String sum="300";
			
			Scanner sc=new Scanner(System.in);
			System.out.println("이름을 임력하세요.");
			name=sc.next();
			System.out.println("수학점수를 입력하세요.");
			math=sc.next();
			System.out.println("국어점수를 임력하세요.");
			kor=sc.next();
			System.out.println("영어점수를 임력하세요.");
			eng=sc.next();
//			avg=형변환 해서 평균으로 넣기;
//			sum=형변환 해서 합계로 넣기;
			String sql="insert into student(name, math, kor, eng, avg, sum) values (";
			sql+="'"+name+"',"+math+", "+kor +", "+eng +", "+ avg+", "+sum+");";
			System.out.println(sql);
			
			//rs=stmt.executeQuery(sql); //rs는 return type이 resultSet라서 사용하기 곤란함
			boolean result=stmt.execute(sql);
			System.out.println("실행결과 : " + result); //false로 나와야 값이 잘 들어간 것임
			
			//stmt.execute(String sql); return boolean, resultSet의 여부를 반환 (있으면 true, 없으면 false)
			//stmt.executeQuery(String sql); return reslultSet, select문에 사용
			//stmt.executeUpdate(String sql); return int, 영향을 받은 갯수를 반환(줄수), update, delete에 사용
		} catch(Exception e) {
		 	System.out.println("접속 중 오류 발생 : " +e);
		} finally {
			try {
				if (rs!=null) {
					rs.close();
				}
				if (stmt!=null) {
					stmt.close();
				}
				if (conn!=null) {
					conn.close();
				}
				
				// 같은 내용 다른 표현
				// if (rs!=null) rs.close();
				// if (stmt!=null) stmt.close();
				// if (conn!=null) conn.close();
				
			} catch (Exception ex) {
				System.out.println("접속 해제중 : " +ex);
			}
		} 
	}
}
