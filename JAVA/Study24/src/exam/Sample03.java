package exam;

import java.util.*;

public class Sample03 {
	public static void main(String [] args) {
		//학생정보를 저장할 수 있는 객체를 만들려고 한다.
		//학생은 학번, 이름, 수학점수, 영어점수, 국어점수를 가질 수 있다.
		//위 객체를 만들기 위한 클래스는 작성하고 하나의 객체를 생성해서 
		//학번 : 100
		//이름 : 홍길동
		//수학 : 40
		//영어 : 50
		//국어 : 70
		// 위의 데이터를 입력하고 출력하여 확인하시오.
		Student s1 = new Student();
		s1.number=100;
		s1.name="홍길동";
		s1.math=50;
		s1.eng=60;
		s1.kor=70;
		System.out.println("학번 : "+s1.number);
		System.out.println("이름 : "+s1.name);
		System.out.println("수학 : "+s1.math);
		System.out.println("영어 : "+s1.eng);
		System.out.println("국어 : "+s1.kor);
		s1.setScore(200, "고길동");
		s1.setScore(70, 80, 90);
		Student s2 = new Student();
		s2.setScore(300, "엔젤");
		s2.setScore(100, 100, 100);
		s2.setScore(500, "무명", 100, 90, 78);
		sop("안녕하세요");
		System.out.println(s1);
		System.out.println(s2);
		Student s3= new Student(700, "생성자", 100,90,48);
		//스캐너로 받는 방법
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		String name=sc.next();
		int math=sc.nextInt();
		int eng=sc.nextInt();
		int kor=sc.nextInt();
		Student s4=new Student(number, name, math, eng, kor);
	}
	
	static void sop(String s) {
		System.out.println(s);
	}
}

class Student {
	int number;		//학번
	String name;	//이름
	int math;		//수학점수
	int eng;		//영어점수
	int kor;		//국어점수

	Student(){
		
	}
	Student(int n, String nm, int m, int e, int k) {
		number=n;
		name=nm;
		math=m;
		eng=e;
		kor=k;
		System.out.println("학번 : "+n+"\n이름 : " +nm+"\n수학 : "+m+"\n영어 : "+e+"\n국어 : "+k+"\n----------");
	}
	

	void setScore(int number, String name) {
		this.number=number; //this는 자기안에 있는 것을 지칭
		this.name=name;
		System.out.println("학번 : "+number);
		System.out.println("이름 : "+name);
		System.out.println("-----------");
	}
	void setScore(int math, int eng, int kor) {
		this.math=math;
		this.eng=eng;
		this.kor=kor;
		System.out.println("수학 : "+math);
		System.out.println("영어 : "+eng);
		System.out.println("국어 : "+kor);
		System.out.println("-----------");
	}
	void setScore(int a, String b, int c, int d, int e) {
		number=a;
		name=b;
		math=c;
		eng=d;
		kor=e;
		System.out.println("학번 : "+a);
		System.out.println("이름 : "+b);
		System.out.println("수학 : "+c);
		System.out.println("영어 : "+d);
		System.out.println("국어 : "+e);
		System.out.println("-----------");
	}
	public String toString() {
		return "학번 : "+number+"\n이름 : " +name+"\n수학 : "+math+"\n영어 : "+eng+"\n국어 : "+kor+"\n----------";
	}
}