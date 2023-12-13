package inhe;

public class Sample05 {
	public static void main(String[] args) {
		//Object class는 모든 class의 조상이므로 Object타입의 변수에는 모든 객체를 담을 수 있다.
		Child c=new Child();
		c.study();
		c.work();
	}//main end.
}//class end.

//상속: 자식클래스가 부모클래스의 형태를 상속 받는 방법
//자식클래스 extends 부모클래스
//자식클래스는 부모클래스의 내용을 가져다 사용할 수 있지만, 부모클래스는 자식클래스의 내용을 사용할 수 없다.
//자식클래스를 객체로 조립할때 부모를 먼저 조립한다.
class Parent {
	Parent(){
		System.out.println("부모의 생성자");
	}
	int money=10000000;
	void study() {
		System.out.println("공부를 열심히 합니다.");
	}//study method end.
	
	void work() {
		System.out.println("공무원");
	}//work end.
	
}//parent end.

class Child extends Parent{
	String computer="컴퓨터";
	//오버라이드 : 상속관계에서 부모한테 상속받은 메서드를 재정의 하는 방법
	//부모클래스==super, 자식클래스==this
	//다중상속은 절대 불가능하다. 부모는 단하나
	//자식은 많아도 되지만, 한자식이 여러부모를 갖을 수 없다 ==형삭이 어그러진다.
	Child () {
		System.out.println("자식의 생성자");
	}
	
	void study() {
		super.study();
		System.out.println("싫어, 게임할거야!");
	}//study method end.
	void work() {
		System.out.println("개발자");
	}
}//Child end.
