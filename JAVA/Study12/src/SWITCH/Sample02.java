package SWITCH;

public class Sample02 {
	public static void main (String [] args) {
		//분기문 switch
		//프로그램을 어디에서부터 실행시킬지 분기를 만드는 문법
		// switch - cast - break - default 한덩어리, 마지막에 break를 안달아 줘도 됨
		/* 
		  swich(변수) {
		  	case 값 : 수행할 문장;
		  	default : case 중 해당하는 값이 없는 경우 실행할 문장;
		  }
		 */
		int score=200;
		switch(score) {
			case 99 : 
			case 100 : System.out.println("100점부분이 실행");break;
			case 200 : System.out.println("200점부분이 실행");break;
			case 300 : System.out.println("300점부분이 실행");break;
			default : System.out.println("해당하는 값이 없습니다.");
		}
		
		if (score==100) {
			System.out.println("100점 부분");
		} else if (score==200) {
			System.out.println("200점 부분");
		} else {
			System.out.println("300점 부분");
		}
		
		//반복문 for
		// *************** 매우 중요
		/*
		 for(시점점; 조건; 증감:반복할때마다 변할 내용) {
		 	반복할 문장;
		 }
		 */
		// 반복문에서 사용하는 i는 iterator의 i
		for(int i=0; i<3; i++) { // 시계반대방향으로 반복하면 됨 (반복할 것 -> 조건 -> 증감)
			System.out.println("반복중...");
		}
	}//main 종료
}//class 종류
