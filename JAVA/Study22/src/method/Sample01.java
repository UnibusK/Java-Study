package method;

public class Sample01 {
	public static void main (String[] args) {
		Test t;
		t=new Test("가고싶은 곳");
		t.run();
		t.check();
	}//main end.
}//class end.

class Test{
	//매개변수 : 동작을 수행할 때 특정 데이터를 제공해야 동작하도록 하는 방법
	//매개변수가 있는 경우 해당 매개변수와 동일한 타입의 데이터를 제공해야 동작한다.
	//매개변수는 여러개를 둘 수 있지만 순소와 갯수를 지켜야 한다.
	//매개변수를 이용해 얻은 데이터는 메서드의 종료와 동시에 사라지므로 다른 부분에서 사용하기 위해서는
	//별도로 필드를 제작하여 저장하여야 한다.
	String data;
	void run(String a, int b) {
		System.out.println("run()이 실행되었습니다.");
		System.out.println("매개변수로 받은 데이터 : "+a);
		data=a;
	}//method end.
	void check() {
		System.out.println("check()에서 확인한 데이터 : " +data);
	}
	//메서드 오버로드 : 이름이 똑같은 메서드를 매개변수의 차이로 다르게 사용하는 방법
	void run() {
		System.out.println("매개변수 없는 run()입니다.");
	}
	
	//생성자 : 클래스를 개체로 조립해주는 기능
	//		리턴 타입이 없고 이름이 클래스와 똑같은 메서드의 형태를 띄고있다.
	// 		무조건 1회만 객채가 생성될 때 실행된다.
	// 		따로 만들지 않아도 클래스 내부에 미리 안 보이게 작성되어있다.
	//		다른 기능을 추가하려면 별도로 한번 적어줘야 한다.
	// 		생성자를 여러개 두는 방법은 오버로드가 유일하다. *****매우 중요******
	Test() {
		System.out.println("생성자가 객체를 조립합니다.");
	}
	Test(String s){
		System.out.println("다른 방식으로 객체를 조립합니다.");
		data=s;
	}
	
}//Test class end.
