package esc;

public class Sample02 {
	public static void main(String[] args) {
		//new:인스턴스 연산자, 새로 뭔가 만들어내라는 뜻
		//클래스명():생성자, 설계도(class)를 객체(object)로 조립하는 기능
		Test a; //같은 코드는 Test a=new Test;
		a=new Test(); //새로 Test라는 설계도 조립해줘 //new는 인스턴스 연산자, 새로이 뭔가를 제작하라는 뜻
		a.number=10;
		a.name="김우주";
		a.exam=true;
		System.out.println(a);
		System.out.println(a.name);
		//객체 내부의 데이터를 확인/입력시 내부의 필드명 명시 필요
		a.data=new Data();
		//필드는 반드시 기본형을 사용할 필요는 없고, 다른 클래스의 타입으로도 지정가능
	}//main 종료
}//class종료

class Test{
	//class는 설계도다 -> 객체를 만드는 용도로 사용된다.
	//class는 필드(field), 메서드(method), 생성자(컨스트럭터)를 가질 "수" 있다 ********매우 중요
	//필드 : 객체가 가질 수 있는 속성을 저장할 공간, 다른 객체와의 구별용도 사용
	//		필드는 통상적으로 변수로 제작된다.
	//메서드 : 객체가 수행할 수 있는 동작을 정의하는 공간, 클래스에 적혀서 객체가 수행
	//생성자 : 객체를 제작하는 방법
	int number;
	String name;
	boolean exam;
	Data data;
}// test class 종료

class Data{
	double x;
	double y;
}//Dataclass 종료