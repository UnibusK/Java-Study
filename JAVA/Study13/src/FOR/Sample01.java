package FOR;

public class Sample01 {
	public static void main (String[] args) {
		//for문 : 특정 동작을 반복하여 수행하도록 하는 문법
		//**************** 매우중요!!!!!!!!!!!!!!!
		// iterator의 약자 i를 주로 사용함(데이터를 읽는 기준 처리기)
		
		/* 
		for(시작점; 조건; 증감식) {
		
		} 
		i++ = i+=1 = i=i+1
		*/
		
		
		int cnt=0; //cnt = count 약자
		for(int i=3; i<10; i++) {
			cnt++;
			System.out.println("반복중..." + i);
		}//for문 종료지점
		System.out.println("반복 횟수는 " + cnt + "번 입니다.");
		
		
		/*
		int i=0 // for문 밖에서 변수값을 먼저 선언해야 for문 밖에 변수값을 불러올수있다
		int cnt=0; //cnt = count 약자
		for(i=3; i<10; i++) {
			cnt++;
			System.out.println("반복중..." + i);
		}//for문 종료지점
		System.out.println("반복 횟수는 " + cnt + "번 입니다." +i 에서 끝난다);
		*/
		
	} //main 종료지점
} //class 종료지점
