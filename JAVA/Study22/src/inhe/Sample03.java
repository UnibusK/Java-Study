package inhe;

public class Sample03 {
	public static void main (String[] args) {
		Child c=new Child();
		
	}//main end.
}//class end.

// 상속이 이루어지면 부모형태의 객체를 먼저 만든 뒤 가공해서 자식을 제작한다.
// 자식의 생성자보다 먼저 부모의 생성자가 무조건 1회 먼저 실행된다.
// 별도의 지정이 없다면 가장 기본형의 부모 생성자가 실행된다.
class Parent {
	Parent() {
		System.out.println("일반 부모의 생성자");
	}//생성자 end.
	
	Parent(String s) {
		System.out.println("String 받는 부모의 생성자");
	}
}//parent end.

class Child extends Parent{
	Child() {
		//super는 부모 클래스를 의미한다.
		super("스트링"); // 부모생성자의 지정은 자식 생성자의 가장 위에서 이루어진다.
		System.out.println("자식의 생성자");
	}
}