package cls;

public class Sample03 {
	public static void main(String [] args) {
		Dog a=new Dog();
		a.run();
		a.test();
		String s=a.test();
		System.out.println(s);
		a.sum(6, 4);
	}//main end.
}//class end.

class Dog{
	//이름이 run()이고 console에 "멍멍"을 출력하는 메서드를 제작하시오.
	//이름이 test이고 console에 "왈왈"을 출력한 뒤 "콜라"를 반환하는 메서드를 제작하시오.
	//두 메서드를 실행한뒤 test()의 결과값을 변수에 저장하고 console에 출력하시오.
	//이름이 add이고 숫자 999를 반환하는 메서드를 제작하시오.
	void run() {
		System.out.println("멍멍");
	}// run end.
	
	String test() {
		System.out.println("왈왈");
		return "콜라";
	}//test end.
	
	int add() {
		return 999;
	} //add end.

	//매개변수가 있는 메서드
	//메서드 선언시 ()내부에 변수를 두어 후에 줄 데이터가 메서드에 이용될 수 있도록 함
	//해당 변수는 메서드 내부에서 변수처럼 사용 가능하다.
	//매개변수가 있는 메서드 호출 시 해당 타입의 데이터를 주어주지 않으면 동작할 수 없다.
	void sum(int a, int b) {
		System.out.println((++a)+(b*2));
	}//sum end.
	
}// Class Dog end.
