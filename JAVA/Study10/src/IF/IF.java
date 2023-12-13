package IF;

public class IF {
	public static void main (String [] args) {
		//제어문 if : 조건에 따라 실행여부를 결정하는 문법
		//if(조건) {실행할 문장;}
		// **********매우 중요
		//if가 조건을 통하여 실행을 결정하는 부븐은 {}로 한정된다.
		//if문에 {}하지 않은 경우 처음으로 나오는 ;까지를 if의 범위로 본다.
		
		System.out.println("if보다 앞에서 실행");
		if(10>5) {
			System.out.println("조건이 참이므로 실행함"); //{}가 없는 경우 첫번째 줄까지만 실행됨
			System.out.println("명령어가 몇개든 실행됨");
		} // if 종료부분
		System.out.println("if보다 뒤에서 실행");
	} // main 종료 부분
} // 클래스 종료 부분
