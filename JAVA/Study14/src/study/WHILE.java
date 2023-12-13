package study;

public class WHILE {
	public static void main(String[] args) {
		//반복문 while : for처럼 반복을 수행하는 문법
		//while문을 의도한대로 사용하기 위해서는 기준점과 증가식을 따로 넣어 주어야 한다.
		/*
		while(조건) {
			반복시 수행할 문장;
		}//while 종료
		*/
		
		int i=0;
		//System.out.println("반복중..."+i); do-while과 같은 실행이 된다.
		while(3>i) {
			System.out.println("반복중..."+i);
			i++;
		}
		System.out.println("반복종료 : "+i);
		
		
		//do-while while문과 조건의 거짓일지라도 상관없이 한번은 실행하는 문법
//		int i=0;
//		do {
//			System.out.println("반복중..."+i);
//			i++;
//		} while(3<i) ;
//		System.out.println("반복종료 : "+i);
//		
		
	}//main 종료
}//class 종료
