package GENE;

public class GENERIC {
	public static void main(String[] args) {
		//제네릭 : 클래스를 객체로 조립하는 괒겅에서 클래스 내부의 타입을 지정할 수 있는 문법
		//제네릭의 자료형은 변수 기본형으로 사용할 수 없고 클래스 타입으로 지정해야 한다.
		//기본자료형을 사용하고자 하는 경우 정식명칭을 사용해야 한다.
		//ex, int -> Integer, 다른 변수는 대부분 앞글자만 대문자로 바꾸면됨
		// ex, boolean -> Boolean
		//제네릭이 지정된 클래스를 객체로 조립할 때 제네릭타입을 특정하지 않으면 Object타입이 된다.
		//제네릭이 지정되어있는 Collection을 사용할 때 타입을 특정하지 않으면 오류의 원인이 될 수 있다.
		Test<Integer, String> t=new Test<Integer, String>(1234);
		int msg=t.run();
		System.out.println(msg);
		
		Test a=new Test(1234);	//노란밑줄 : 제네릭을 사용한 클래스에서 타입을 지정하지 않은 오류
		Object b=t.run(); 		//타입이 object로 만들어 진다.
		System.out.println(b);
		
		
		//자바 컬렉션
		//*********매우 중요
		//Set : 순서가 없음, 중복데이터 불가
		//List : 순서가 엄격히 존재하는 자료형, 중복데이터 가능
		//Map : 검색어:데이터 - 1:1로 매칭되어 있는 자료형, 검색어는 중복불가, 데이터 중복 가능
			//hash : 속도가 높고 순서를 임의로 만듦, HashMap, HashSet은 있지만 HashList 는 없음(순서가 엄격히 존재)
	}
}

//일반적인 클래스 생성, 필드 메서드 생성
class Normal{
	String a;
	Normal(String str){
		a=str;
	}
	String run() {
		return a;
	}
}

//제네릭이 구현된 클래스
//제네릭을 구현하기 위해서는 명칭을 지정해야한다.
class Test<Type, Data>{
	Type a;
	Test(Type str){
		a=str;
	}
	
	Type run() {
		return a;
	}
}