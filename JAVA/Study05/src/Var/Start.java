package Var;

public class Start {
	public static void main(String[] args) {
		//프로그램의 시작점 public static void main이다
		
		//변수 : 컴퓨터와 소통하기 위해 데이터를 담아두는 상자
		//타입 변수이름; <<<< 변수를 만들어 달라는 명령
		int A;
		int a;
		//int 우주; <x>
		//int a31 b3a <x>
		//int 1223a <x>
		
		//이름은 이미 사용중인 것을 쓸 수 없다
		//명령어(예약어)를 이름으로 쓸 수 없다
		//이름은 한글은 가급적 피해주는게 좋다
		//이름은 대소문자를 엄격하게 구별한다 int A >< int a
		//이름에 숫자를 사용할 수 있지만 첫 문자는 숫자가 오면 안된다 int a342 (0), int 14sa(x)
		//이름에는 띄어쓰기를 사용할 수 없다
		//특수문자는 _와 $만 사용 가능하다
		
		//변수에 데이터를 입력하는 방법
		A=10;
		System.out.println(A);
		
		// {} : 블락,블록 설계도 내부에 구역을 나누는 역할, 범위 지정의 용도
		// . : A.B - A내부에 있는 B
		// , : A,B - A와 B는 엄격히 구별되어 있다
		// ; : 한개의 명령이 끝나는 종료 표시
		// = : 왼쪽에 오른쪽 내용을 삽입할 것 **중요**
		// () : 동작(메서드) function - 개체없이 기능자체를 수행할 수 있는것 / 메서드-객체가 수행할 수 있게 하는 것
		
	}
}