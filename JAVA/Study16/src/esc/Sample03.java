package esc;

public class Sample03 {
	public static void main(String [] args) {
		Car c=new Car();
		System.out.println(c.number);
		System.out.println(c.name);//null의 기본값 00000000
		System.out.println(c.error);
		//객체는 형상을 갖고있어야 하기 때문에
		//필드 내부에 아무 데이터를 넣지 않아도 가장 0에 가까운 기본값을 가진다.
		
		c.run();
		int[] a=c.test();
		//ㅣ리턴타입이 있는 메서드의 경우, return값과 return타입, 데이터를 담을 변수 타입
		//모두가 일치해야 한다.
		System.out.println(a[0]);
		System.out.println(a[1]);
		
		int[] ss() {
			System.out.println("test() 동작이 실행되었습니다.");
			IS ss=new IS();
			ss.a=100;
			ss.b="가나다";
			return ss;
		}//
	}//main 종 료
}//class종료



class Car { //이미 위에 테스트라는 이름의 설계도를 만들어 두어서 같은 
	//필드
	int number;
	String name;
	boolean error;
	
	//메서드 : 클래스 내부에 작성되어 객체가 수행하는 동작
	/*
	리턴타입 메서드이름() {
		동작수행시 실행할 내용;
	}
	*/
	//리턴타입 : 동작을 수행한 이후 결과물을 반환할 결과물의 규격
	//			void : 아무것도 반환하지 않는 경우(한국말로 "공허")
	//			void가 아닌 리턴타입 : 수행 이후 해당 타입의 데이터를 반환
	//							return 뒤에 돌려줄 데이터를 적어야 한다.
	
	void run() {
		System.out.println("차량이 주행합니다.");
	}//voi run() 종료
	
	
	int[] test() {
		System.out.println("test() 동작이 실행되었습니다.");
		int[] arr= {100,200};
		return arr;
//		System.out.println("test() 동작이 종료되었습니다.");
		//메서드에서 return이 등장하면 그 이후 로는 다른 명령을 내릴 수 없다.
	} //test() 메서드 종료
}// car class 종료



class IS {
	int a;
	String b;
}// IS class 종료
