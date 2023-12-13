package abs;

public class Sample04 {
	public static void main (String [] args) {
		ABS a = new Child();
		a.method();
		
	}//main end.
}//class end.

// 추상 클래스 : 고도로 추상화되어 객체를 연상할 수 없게 된 클래스, 앞에 abstract를 붙여서 선언
// 추상클래스는 객체를 조립할 수 없다. 상속을 통해 구체화 되어야만 객체가 될 수 있다.
// 추상클래스는 필드, 메서드, 생성자, 추상메서드를 가질 수 있다.
// 
abstract class ABS {
	int number;
	void method() {
		System.out.println("추상클래스의 메서드");
	}
	ABS() {
		System.out.println("추상클래스의 생성자");
	}
	abstract void add(int a, int b);
}
//추상클래스는 상속을 통하여 일반클래스로 구체화하여 사용한다.
//추상클래스가 추상 메서드를 가진 경우, 이를 상속받은 일반클래스는 반드시 추상 메서드의 몸통을 구체화하여야 한다.
class Child extends ABS {
	void add(int x, int y) {
		System.out.println(x+y);
	}
}