package IF;
	
public class IF_IF {
	public static void main (String [] args) {
		//중첩 if문
		if(true) {
			if(false) {
				System.out.println("두 조건이 모두 만족하여 실행됨");
			} else { //내부 if문 종료, else 실행
				System.out.println("내부조건이 거짓이므로 실행됨") ;
			} // 내부 else 종료
			System.out.println("외부조건이 참이므로 실행됨");
		} else { // 외부 if 종료 및 외부 else 실행
			System.out.println("외부조건이 거짓이므로 실행됨"); 
		} // 외부 else 종료 시점
		
		int a=0;
		String b;
		b=(a>0)?"양수":(a==0)?"0":"음수";
		System.out.println(b);
		
//		a=8
//		if(a>0) {
//			a="양수";
//		} else if {
//			a="음수";
//		} else {
//			a="0";
//		}
//		System.out.println(a);
		
	} //main 종료시점
} //class 종료 시점
