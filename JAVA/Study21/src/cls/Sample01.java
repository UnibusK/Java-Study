package cls;

public class Sample01 {
	public static void main(String[] args) {
		//new : 인스턴스(=개념으로 부터 추출된 하나의 실체) 연산자
		Test t = new Test();
		t.a=150;
		t.s="안녕하세요~";
		System.out.println(t.a);
		System.out.println(t.s);
		t.run();
	}//main end.
}//class end.
//클래스 : 설계도 
//클래스 자체로는 기능할 수 없고, 클래스를 조립한 객체를 통해서 수행해야 한다.
//클래스는 필드, 메서드, 생성자를 가질 수 있다.
class Test{
	//필드 : 클래스 내부에 만드는 변수, 후에 객체가 데이터를 저장하는 용도로 사용
	//필드는 원하는 수 만큼 제작할 수 있지만 클래스 밖에 만들면 사용할 수 없다.
	//필드에는 초기값을 넣을 수도 있고 넣지 않을 수도 있다.
	//필드에 초기값을 넣으면 생성된 객체는 해당 값을 가진 채로 제작된다.
	//필드에 초기값을 넣지 않았다면 가장 0에 가까운 값을 기본값으로 넣어준다.
	//int=0, boolean=false(=0), String=null 초기값으로 넣어진다.
	int a;
	String s;
	
	// 메서드: 클래스 내부에 작성되어 후에 객체가 수행하는 동작
	// 리턴타입 이름() {}
	void run() {
		System.out.println("메서드가 실행되었습니다.");
	}//run end.
}//test end.