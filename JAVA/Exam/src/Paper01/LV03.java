package Paper01;

public class LV03 {
	public static void main(String[] args) {
		//해당 소스코드는 1~100까지의 수 중 홀수를 출력합니다.
		//다음 소스코드가 올바르게 동작하도록 수정해 주세요.
		
//		int first=1;
//		int last=100;
//		for (int i=first; i<=first; i++) {
//			if(i%==1) {
//				System.out.println("i"+는 +"홀수" 입니다+);
//			}//if 종료
//		}//for 종료
		
		
// 풀이
		int first=1;
		int last=100;
		for (int i=first; i<=last; i++) {
			if(i%2==1) {
				System.out.println(i+"는 홀수 입니다.");
			}//if 종료
		}//for 종료
	
	
		
		//산술연산자 +-*/% : 이항연산자
		//산술연산자는 이항연산이므로 5%3 이런식으로 앞뒤에 숫자가 있어야 계산이 가능하다.
		
		System.out.println(10+30);
		
	}//main 종료
}//class 종료
