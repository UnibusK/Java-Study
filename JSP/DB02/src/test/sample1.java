package test;

import java.sql.*;		//데이터베이스와 자바를 연결하는 클래스들이 들어있는 경로

public class sample1 {
	public static void main(String[] args) {
		Connection conn=null;		//회선 //회선은 하나만 있어야 함, 동시다발접속했을 경우 순차적 진행을 할 수 없음
		Statement stmt=null;		//회선 내부에서 쿼리문을 데이터베이스로 전송하는 전송객체
		ResultSet rs=null;			//select문의 결과를 java로 전송하는 규격
		
		String url ="jdbc:mysql://127.0.0.1:3306/sample";
		String user = "root";
		String pw = "iotiot";
		
		try {
			conn=DriverManager.getConnection(url, user, pw);		//회선객체 연결
			stmt=conn.createStatement();							//회선 내부 데이터 이전객체 생성
			
			String sql="select * from student order by sum desc;";		//쿼리문 같이 생긴 String 데이터, 문자열
			rs=stmt.executeQuery(sql);
//			rs.next();		//이터레이터가 첫번째 줄 데이터로 이동
//			rs.next();		//이터레이터가 두번째 줄 데이터로 이동
//			rs.next();		//이터레이터가 세번째 줄 데이터로 이동
			// 개발자가 개발의 횟수를 지정할 수 없다 - while
			// 개발자가 개발의 횟수와 끝지점을 안다 - for문
			
			while (rs.next()) {
				Student s=new Student();
				s.setName(rs.getNString("name"));
				System.out.println(s.getName());
				
				
				//데이터베이스에서 바로 출력하는 방법
				//System.out.println("이름 : " + rs.getString("name")+"\t 총점 : " + rs.getString("sum")); // 데이터 몇번째인지가 아닌 필드명을 작성할 수 있음
			}
//			System.out.println(rs);		//rs는 객체이기 때문에 바로 읽을 수 없음
//			System.out.println(rs.getString(1));
//			System.out.println(rs.getString(2));
//			System.out.println(rs.getString(3));
			System.out.println("접속 중 이상없음");
		} catch(Exception e) {
			System.out.println("접속 중 오류 발생 : " +e);
		} finally {
			try {
				if(rs!=null) rs.close(); //if문 다음에 처음나오는 ;까지 본인 영역으로 본다.
				if(stmt!=null) stmt.close();
				if(conn!=null) conn.close();
			} catch(Exception EX) {
				System.out.println("접속 해제 중 오류 발생 : "+ EX);
			} 
		}
	}
}

class Student {
	private int num;
	private String name;
	private int math;
	private int kor;
	private int eng;
	private int avg;
	private int sum;
	// 자동완성 : 우클릭 > source > Generate getters and setters... > 사용할 사항 체크
	// DTO : data transport object 데이터를 이전할때 사용하는 객체 // private 필드와 get, set, method로 만들어진다.
	// vo : 변수들로 만들어진 오브젝트다.
	// DAO : data access object 위쪽에 connection
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getAvg() {
		return avg;
	}
	public void setAvg(int avg) {
		this.avg = avg;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	
}