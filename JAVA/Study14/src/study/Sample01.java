package study;

public class Sample01 {
	public static void main(String[] args) {
		int number=10;
		if(number>20) { //if문은 실행할지 말지 결정하는 조건문,
						// 둘다 실행되는 경우, 둘다 실행안되는경우 없다
						// if문은 범위가 작은것부터 조건을 쓰자!!
			System.out.println("조건 1이 참일경우 실행되는 부분");
		} else if(number>15) { //조건1 else if 종료
			System.out.println("조건1 거짓이고 조건2가 참일 경우 실행되는 부분");
		} else if(number>10) { //조건 2 두번째 else if 종료
			System.out.println("조건 1,2 거짓이고 조건 3이 참일 경우 실행");
		} else { // 조건3종료 마지막
			System.out.println("1,2,3 조건 모두 거짓일 경우 실행");
		}// if문 최종 종료
		System.out.println("조건과 상관없이 실행되는 부분");
		
		switch(number) {
			case 10 : break;
		}//switch 종료
		
		int i;
		for(i=0; i<5; i++) { // 기준점에 변수를 많이 둠
			System.out.println("반복중"+i);
			
		}//for 종료
		System.out.println("for문 종료 후에 실행되는 부분");
		String s="*";
		int a=0;
		for(a=1 ; a<5; a++) {
			System.out.println(s);
			s+="*";
		}
	}//main 종료
}//class 종료
