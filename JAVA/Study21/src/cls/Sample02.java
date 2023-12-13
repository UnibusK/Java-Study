package cls;

public class Sample02 {
	public static void main(String[] args) {
		// 클래스 객체로 만들기
		// 1. 해당 클래스가 조립된 목적물이 들어갈 크기로 변수를 만든다.
		// 2. new 연산자와 생성자를 이용해서 객체를 조립한다.
		// 3. 해당 변수에 완성된 객체를 대입한다.
		Exam e = new Exam();
		e.run();
		System.out.println(e.rr());
//		System.out.println(e.add());
		int a=e.add();
		System.out.println(a);
	}//main end.
}//class end.

class Exam{
	//메서드 : 클래스 내부에 작성되어 후에 객체가 수행할 수 있는 동작
	//리턴타입 이름() {}
	//리턴타입 : 동작을 수애한 이후에 돌려주는 데이터의 형태
	//void : 동작을 수행한 후에 아무것도 돌려주지 않는 형태
	//나머지 리턴 : 동작을 수행한 이후 해당 데이터를 돌려주는 형태
	
	void run() {
		System.out.println("run()동작이 수행되었습니다.");
	}//void run end.
	//리턴타입이 void가 아닌 경우에는 반드시 return 뒤에 값을 적어서 특정해야 한다.
	//리턴타입과 return뒤에 특정된 값은 같은 타입을 가져야 한다.
	//메서드 내부에서는 return 아래로는 추가적인 명령을 시킬 수 없다.
	String rr() {
		return "rr()이 수행되었습니다.";
	}//rr end.
	
	int add() {
		System.out.println("add()가 수행되었습니다.");
		return 150;
	}// add end.
	
}//Exam class end.
