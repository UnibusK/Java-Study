package inter;

public class Sample01 {
	public static void main(String[] agrs) {
		Test a= new Test();
		Exam b = new Exam() {
			public void method() {}
		};
		//Child c = new Child();
		//클래스를 제작하지 않고 인터페이스 또는 추상클래스를 구현해야 하는 경우
		//이름이 없는 클래스가 있다고 가정하여 객체를 조립힌다.
		//익멸클래스 : 
		//1. 인터페이스에 존재할리 없는 생성자를 적어준다.
		//2. 생성자 뒤쪽으로 class의 범위인 {}를 표기한다.
		//3. 인터페이스가 추상메서드를 가진 경우 해당 메서드의 몸통을 구현한다.
		a.run(new Exam() {
			public void method () {
				
			}
		}); // 프레임 워크에서 많이 사용하고 있음, 안드로이드 스튜디오 등
		a.run(() -> {}); 
		// lambda식 : 익명클래스를 축약해서 사용하는 것
		// 인터페이스의 추상메서드를 구현한 객체가 필요한경우
		//불필요한 인터페이스명과 메서드명을 소거하여 축약해서 표현하는 방식
		//인터페이스가 두개이상의 추상메서드를 가진경우는 사용불가
		//인터페이스 만들기 -> 인터페이스 구현 -> 인터페이서 매개변수로 받는 메서드 -> 익명클래스 -> 람다
		
		//new Test().run(new Exam());
	}
}

class Test {
	void run(Exam a) {
		System.out.println("실행확인!");
	}
}

//추상 클래스는 객체로 조립할 수 없다.
//추상클래스를 상속받은 일반클래스가 객체로 조립되어야 한다.
//상속에서 자식객체는 부모객체가 들어갈 수 있는 타입에 들어갈 수 없다.
interface Exam {
	public abstract void method(); //public 생략되어 있음
	
	
}

//추상클래스를 상속받은 일반클래스는 반드시 추상클래스가 가진 추상메서드의 몸통을 구현해야 한다.
//인터페이스의 추상메서드를 구현하는 경우에는 앞에 public을 붙여주어야 한다.
//class Child implements Exam {
//	public void method() {
//		
//	}
//}

/*
				객체		필드		메서드	추상메서드		생성자	목적(개발)
	클래스		o		o		o		x			o		객체생성(복잡데이터)
	추상클래스		x		o		o		o			o		상속을 통한 구체화(메서드강제)
	인터페이스		x		x(상수o)	x		o			x		용도구현(데이터 규격)
	
*/