package inter;

public class Sample01 {
	public static void main(String [] args) {
		ITF aa = new A();
		ITF bb = new B();
	}
}
//인터페이스 : 인터페이스가 구현된 객체들을 특정 규격으로 저장할 수 있는 방법
//interface 이름 {}
//인터페이스는 클래스에 구현해서 객체의 규격을 결정하는 역할을 한다.
//인터페이스는 객체의 용도이므로 다중구현 가능하다.
interface ITF{
	//필드,메서드,생성자를 가질 수 없다.
	//인터페이스는 변수가 아니라 상수를 가진다.
	//int a만 적어도 public static final을 앞에 붙인 채 만들어진다.
	int a=10;//변수가 아님, 헷갈리지 말자 // public static fianl
	//인터페이스는 메서드를 가질 수 없다. 추상메서드를 가질 수 있다.
	//void run()만 적어도 public abstract 이 앞에 붙어서 만들어진다.
	//void run();
	//인터페이스는 생성자를 가질 수 없다.
}


class A implements ITF{ //A클래스의 타입은 A이기도 하지만, ITF 이기도 함
	//필드,메서드,생성자를 가질 수 있다.
	public static final int a=10;
	void run() {
		
	}
}

class B implements ITF{
	
}