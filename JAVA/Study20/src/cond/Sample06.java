package cond;

public class Sample06 {
	public static void main(String[] args) {
		//제어문
		//조건문 *if*
		//분기문 switch
		//반복문 *for*, while
		
		//if:조건에 따라 {}내부를 실행할지 말지를 결정하는 문법
		//if else : 조건에따라 if를 실행할지 else를 실행할지 결정하는 문법
		int a=2;
		int b=5;
		
		if(a>=5) {
			System.out.println("a가 5보다 큽니다.");
		} else if(a>=3) {
			System.out.println("a가 3보다 큽니다.");
		} else {
			System.out.println("모든 조건이 거짓입니다.");
		}//if end.
		System.out.println("{}를 벗어난 부분은 if문과 상관없이 실행");
		
		switch(a) {
			case 2:System.out.println("2번 분기 사용");break;
			case 3:System.out.println("3번 분기 사용");break;
			case 4:System.out.println("4번 분기 사용");
			default: System.out.println("해당하는 분기 없음");
		}//switch end.
	}//main end.
}//class end.
