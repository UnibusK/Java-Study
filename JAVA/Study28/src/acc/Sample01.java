package acc;

import exam.Product;
	//package가 다른 클래스를 사용하기 위해서는
	//import 패키지명.클래스명;을 해주어야 한다.

public class Sample01 { 	//public: 완전 공개 -> 하나는 있어야 동작을 함.
	public static void main(String[] args) {	
//		parameter | 127.0.0.1 = 동일 컴퓨터 내부(localhost)
//		netstat : TCP 내용 확인 || +'-h'(=parameter) : 사용설명서
		Test t=new Test();
		t.def=10;
		t.pub=20;
		t.pro=30;
//		t.pri=40;	오류발생
		t.setPri(40);
		int priv=t.getPri();
		System.out.println(priv);
		
		Student s=new Student();
		s.number=1;
		s.name="홍길동";
		s.math=100;
//		s.eng=90;	오류발생
		s.setEng(90);
		int engS=s.getEng();
		System.out.println(engS);
		
		Product p=new Product();
//		p.price=1000;	패키지가 다르면 디폴트 사용 불가 (default는 protected와 private의 사이)
		p.name="조립식 게이밍 PC";
//		p.qty=1;	protected는 상속, 패키지 내부에서 사용 불가
//		p.seller="판매자";
		p.setSeller("길동이");
		String sel=p.getSeller();
		System.out.println(sel);		
	}
}

// 접근제한자 : 특정 요소에 접근할 수 있는 범위를 지정하는 문법
// 접근제한자는 프로그램을 다른 용도로 사용할 수 없도록 제한하는 역할
// 필드 또는 메서드에 사용 범위를 지정하는 용도로 개발에 사용한다.
class Test{
	int def;			//default : 아무 접근 제한자도 적지 않은 상태
//						같은 package 내부에서 접근 가능	
	public int pub;		//public : 전체 공개	★
//						같은 project 내부에서 접근 가능
	protected int pro;	//protected : 보호
//						같은 package 또는 상속관계에서 접근 가능
	private int pri;	//private : 보안처리된	★×5,000,000
//						같은 class 내부에서만 접근 가능	
	int getPri() {
		return pri;
	}
	void setPri(int a) {
		pri=a;
	}
}