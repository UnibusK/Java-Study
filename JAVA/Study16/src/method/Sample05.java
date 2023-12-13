package method;

import java.util.*;

public class Sample05 {
	public static void main (String[] args) {
		Student s1;
		s1=new Student();
		// Student s1=new Student; 같은 뜻
		s1.setScore("김우주", 70, 60, 100);
		System.out.println("이  름 : "+s1.name);
		System.out.println("수학점수 : "+s1.math);
		System.out.println("영어점수 : "+s1.eng);
		System.out.println("국어점수 : "+s1.kor);
		s1.getScore();
		Student s2=new Student();
		s2.setScore("하하", 100, 40, 60);
		s2.getScore();
		Student s3=new Student();
		s3.setScore("남궁선우", 80, 20,40);
		s3.getScore();
	
	}//main 종료
}//class 종료


class Student{
	String name;		//이름
	int math;			//수학성적
	int eng;			//영어성적
	int kor;			//국어성적
	
	//성적을 입력해주는 메서드
	//매개변수 : 메서드를 실행할 때 특정 데이터를 메서드 내부로 전달해주기위한 변수
	//매개변수는 ()내부에 작성한다.
	//매개변수가 있는 메서드는 실행시에 해당 변수타입에 맞는 데이터를 입력해야 한다.
	//들어온 데이터는 메서드 내부{}에서 해당 변수 이름으로 사용할 수 있다.
	
	void setScore(String n, int m, int e, int k) {
		//System.out.println("들어온 데이터 : "+score);
		name=n;
		math=m;
		eng=e;
		kor=k;
	}//setScore 종료
	
	/*
	void setScore(String name, int math, int eng, int kor) {
		//System.out.println("들어온 데이터 : "+score);
		this.name=name;
		this.math=math;
		this.eng=eng;
		this.kor=kor;
	}//setScore 종료
	*/
	
	//성정정보를 출력하는 메서드
	void getScore() {
		System.out.println("이름:"+name+"\t 수학:" +math+"\t 영어:"+eng+"\t 국어:"+kor);
	}//getScore 종료
	
}//Student class 종료