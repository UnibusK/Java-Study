package method;

public class Sample03 {
	public static void main (String[] args) {
		//메서드를 실행시키는 방법
		//0. 객체를 저장할 수 있는 규격의 변수를 만들어야 한다.
		//1. 메서드를 실행할 객체를 만들어야 한다.
		//2. 만들어진 객체를 해당 규격의 변수를 담고
		//3. 객체를 통해서 메서드를 실행한다.
		Test a;
		a=new Test();
		a.run();
		a.run(2);
		a.run("가");
		a.run(1,"가나");
		a.run("나는", 2);
		a.run(true);
		System.out.println(a.run(2.2f));
		
		
		Over b;
		b=new Over();
		System.out.println(b.num);
		Over c;
		c=new Over("실행");
	}//main end.
}//class end.


class Over{
	//생성자는 이름이 class와 똑같아야 하기 때문에 오버로드 하지 않으면 여러개를 만들 수 없다.
	//*************매우중요************
	String num;
	Over() {
		num="영";
		System.out.println("필드 값이 영인 객체를 생성했습니다.");
	}//Over생성자 end.
	
	Over(int a) {
		if(a>0) {
			num="양수";
			System.out.println("필드 값이 양수인 객체를 생성했습니다. ");
		} else if (a<0) {
			num="음수";
			System.out.println("필드 값이 음수인 객체를 생성했습니다. ");
		} else {
			num="영";
			System.out.println("필드 값이 영인 객체를 생성했습니다. ");
		}//for end.
	}// Over 생성자 for문 end.
	
	Over(String a) {
		num=a;
		System.out.println("필드 값이 "+num+"인 객체를 생성했습니다.");
	}//over end.
	
}//Over end.




class Test{
	//메서드 오버로드 : 같은 이름을 갖은 메서드를 매개변수의 차이를 이용해서 다르게 동작시킴
	//***********매우중요 : 생성자 오버로드, "******"메서드 오버라이드"***중요***"와 구별 (용어구분의 내용, 헷갈리지 말것)
	void run() {
		System.out.println("런이 실행되었습니다.");
	}//run method end.
	
	void run(int a) {
		System.out.println("int 데이터를 매개로 받는 런이 실행되었습니다.");
	}//sec, run end.
	
	void run(String s) {
		System.out.println("String데이터를 매개로 받는 런이 실행되었습니다.");
	}//run end.
	
	void run(int a, String s) {
		System.out.println("int, String 런이 실행!");
	}//run method end.
	//매개변수의 순서가 중요하다
	
	void run(String s, int a) {
		System.out.println("String, int 런이 실행!");
	}//run end.
	
	void run(boolean a) {
		System.out.println("boolean 실행");
	}//run end.
	
	String run(float f) {
		return "F를 받았습니다.";
	}


}//Test end.
