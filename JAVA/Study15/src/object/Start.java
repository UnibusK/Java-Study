package object;

import java.util.Scanner;

public class Start {
	public static void main(String[] args) {
		//학생을 담을 수 있는 크기의 변수를 제작
		Student a;
		a=new Student();
		a.eng=100;
		a.name="김우주";
		a.address="창동";
		a.number=1;
		a.math=78;

		System.out.println(a.eng);
		System.out.println(a.name);
		System.out.println(a);
		//a를 한마디로 설명해봐? 못함, 그래서 설계도가 저장되어있는 위치를 알려줌
		
		Student b=new Student();
		b.number=2;
		b.name="박가나";
		b.address="월계";
		b.math=100;
		b.eng=80;
		
		//혼자해본 자료 입출력
//		Student c;
//		c=new Student();
//		Scanner sc=new Scanner(System.in);
//		System.out.println("성함을 입력해주세요");
//		c.name=sc.next();
//		System.out.println(c.name);
		
		//메서드 동작
		a.study();
		c.study();
		int result=b.test();
		System.out.println(result);
				
	}//main 종료
}// class종료

class Student{
	//필드(field): 객체가 가질 수 있는 속성정보로 다른 객체와 구별을 위해 사용
	int number;		//학번, 1번부터 시작합니다. -23.9.19 김우주
//	private int number; // private은 지정된 형태가 아니면 작성을 할 수 없음 대비되는것: public
	String name;	//학생이름, 동면이인 주의
	String address; //학생주소
	int math;		//수학성적
	int eng;		//영어성적
	
	//메서드(method): 객체가 수행할 수 있는 동작
	//설계도에 명시되어 객체가 수행하는 동작
	//리턴타입 이름() {실행시 수행할 문장;}
	// 동작 - 1. 동작을 시킨자에게 남는것 / 2. 동작을 시킨자에게 아무것도 안남는것
	
	void study() { //void 공허함, 리턴타입 없음
		System.out.println(name + "이(가) 공부를 합니다.");
	}//void 종료
	
	int test() {
		return 10;
	}// 리턴타입 있는 메서드 작성
	
}// 객체로 만들 class 종료
