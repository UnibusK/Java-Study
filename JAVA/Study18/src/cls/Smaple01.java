package cls;

public class Smaple01 {
	public static void main(String[]args) {
		Dog d1;
		d1=new Dog(); //new 뒤에 생성자를 넣는다. 생성자를 실행해 달라 는 의미로 ()가 들어감
		Dog d2;
		d2=new Dog();
		
		d1.eat("지구");
	}//main end.
}//class end.

//클래스 == 설계도
//클래스는 필드, 메서드, 생성자를 가질 수 있다.
//1. 필드 : 객체가 데이터를 가질 수 있는 공간, 또는 속성, 타 객체와 구별하는 기준으로 사용
//2. 메서드 : 클래스에 작성되어 객체가 수행하는 동작 (객체가 아닌 것이 동작하는것 펑션==스테이틱)
//3. 생성자 : 객체를 조립하는 기능
// 			- 객체가 조립 될때 무조건 단 한번만 실행된다.
//			- 리턴타입이 없고, 클래스와 이름이 똑같은 메서드처럼 생겼다.

class Dog{
	String name;	//똘이
	int age;		//9살
	String race;	//종족
	int wieght;		//몸무게
	int size;		//크기
	String color;	//색상
	
	void eat(String name) {
		System.out.println(name + "이(가) 먹습니다.");
	}//method end.
	void sleep(String name) {
		System.out.println(name + "이(가) 자고 있습니다.");
	}//sleep end.
	Dog(){
		//생성자는 따로 작성하지 않아도 클래스 내부에 자동으로 작성되어있다.
		//다만 다른 기능을 추가하거나 다른 용도에도 사용하기 위해서는 한번 적어서 내부를 작성한다.
	}//Dog생성자 종료
}//Dog class end.