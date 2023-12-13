package sta;

public class Sample04 {
	public static void main(String[] args) {
		//static:설계도 자체로 사용하도록 변수 또는 메서드에 적어주는 명칭
		//설계도 내부에 static을 지정하면 객체와는 무관한 데이터를 저장할 수 있다.
		//객체를 통해서 static영역에 접근할 수 있지만 이는 어디까지나 개별 편의성 허용이고
		//static영역은 객체와 완전 무관한 설계도 내부에만 존재한다.
		//모든 필드와 메서드는 개체를 통해서 사용해야 한다.
		
//		Car c1=new Car();
//		c1.food=1234;
//		Car c2=new Car();
//		c2.food=5678;
//		System.out.println(c1.food);
//		System.out.println(c2.food);
//		c1.run();
//		Car.fly();
//		c1.fly();

		
		Car c1=new Car();
		Car c2=new Car();
		Car c3=new Car();
		System.out.println(Car.food);
	}//main end.
}//class end.

class Car {
	//static은 객체와 상관이 없고 클래스를 이용해서 사용하는 부분이다.
	int number;		//번호판
	static int food;
	
	Car () {
		food++;
	}//car end. 몇개 조립했는지 숫자 적는것이라고 생각해보자.
	
	void run() {
		System.out.println("자동차가 동작합니다.");
	}//run end.
	
	static void fly() {
		System.out.println("비행을 합니다.");
	}//fly end. ==펑션, 스테이틱 메서드
}//car class end.