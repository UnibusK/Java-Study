package method;

import java.util.*;

public class Sample01 {
	public static void main(String[] args) {
		test t=new test();
		//Scanner sc=new Scanner(System.in);
		//System.out.println("아이디를 입력해주세요.");
		//String id=sc.next();
		//t.hello(id);
		//System.out.println(id);
		t.welcome();
		hi h=new hi();
		String msg=t.welcome();
		System.out.println(msg);
		
	}//main 종료
}//class 종료


class test {
	//메서드는 클래스 내부에 작성되어 객체가 수행한다.
	void run () {
		System.out.println("메서드가 실행되었습니다.");
	}//run 종료
	
	//"안녕하세요"라고 출력하는 메서드를 만들고 실행
	void hello(String name) {
		System.out.println(name+"님 접속을 환영합니다~");
	}//hello 종료
	
	String welcome() {
		return "자바 반갑습니다.";
	} //welcome 종료
	// 리턴타입 이름(매개변수) {
    // }
}//test class 종료


class hi {
	void welcome() {
		System.out.println("Hello!!");
	}
}

