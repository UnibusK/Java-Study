package study;

public class Exam {
	public static void main(String[] args) {
		//1~100까지 반복하는 for문을 만들어 보세요.
		//짝수만 출력해보세요.
		
		int i;
		for(i=1;i<=100;i++) {
			if(i%2==0) {
				System.out.println(i);
			}//if문 종료
		}//for문 종료
		
		for(i=2; i<=100 ; i+=2) {
			System.out.println(i);
		}//for문 종료
		
		for(i=1; i<=50; i++) {
			System.out.println(2*i);
		}//for문 종료
		
		for(i=1 ; i<=100; i++) {
			if(i%2==1) {
				System.out.println(i+1);
			}
		}//for문 종료
		
		for(i=1; i<=100; i++) {
			System.out.println(++i);
		}//for문 종료
		
	}//main 종료
}//class종료
