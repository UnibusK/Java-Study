package abs;

public class Sample06 {
	public static void main (String[] args) {
		Child c=new Child();
		c.work();
		ITF i = new Child();
	}//main end.
}//class end.

//추상클래스가 추상메서드를 가진 경우
//해당 추상클래스를 상속받은 일반클래스는 반드시 추상메서드의 몸통을 구현하여야 한다.
abstract class GrandParent {
	GrandParent() {
		System.out.println("조부모의 생성자");
	}//생성저 end.
	void work() {
		System.out.println("과실 영농업");
	}
	abstract void run();
}//class end.

abstract class Parent extends GrandParent{
	Parent() {
		System.out.println("부모의 생성자");
	}//생성자 end.
//	abstract void work() {
//		System.out.println("공무원");
//	}
	void run() {
		System.out.println("마라톤");
	}
}//class end

class Child extends Parent implements ITF, ITF2{
	Child() {
		System.out.println("자식의 생성자");
	}//생성자 end.
	void work() {
		System.out.println("개발자");
	}

}//class end.


interface ITF {
	public static final int number=10; //변수가 아닌 상수
}//interface end.

interface ITF2 {
	
}