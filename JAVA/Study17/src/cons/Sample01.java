package cons;

public class Sample01 {
	public static void main(String[] args) {
		Test a = new Test("이름", 14);
		//a.name="홍길동"
		//a.number="123"
		System.out.println(a.name);
		Test b=new Test("김우주", 16);
		System.out.println();
	}//main 종료
}//class 종료


class Test {
	// 클래스는 필드, 메서드, 생성자를 가질 수 있다.
	// 필드 : 변수로 제작되어 객체가 데이터로 저장해둘 수 있는 공간
	// 메서드 : 클래스 내부에 작성되어 객체가 수행하는 동작
	// 생성자(컨스트랙터) : 클래스를 객체로 조립하는 '동작'
	//		따로 제작하지 않아도 클래스 내부에 안보이게 자동으로 제작되어 있다.
	// 		다른 기능을 추가하거나 별도의 조립방법을 추가하기 위해서는 따로 명시헤야 한다.-매개변수로 작성
	//		객체를 조립하면서 필드의 데이터를 바로 입력하는 기능 등을 수행한다.(개발시) - 초기화, 초기값을 지정
	//		무조건 매개변수의 데이터가 들어가야 하는 것이라서 유령데이터의 객체발생을 막는다.
	// ***********매우중요
	//		[객체가 조립될 때 무조건 단 한번만 실행됨]
	//		[리턴타입이 없고 클래스와 이름이 똑같은 메서드의 형태로 제작된다]

	
	String name;
	int number;
	
	Test(String a, int b){
		//생성자
		name=a;
		number=b;
		System.out.println(name+" 객체가 생성되었습니다.");
		//생성자에 매개변수가 있다는 것은 해당 클래스를 객체로 사용할때 매개변수를 반드시 적어줘야한다.
	}//test end.
}//test class 종료