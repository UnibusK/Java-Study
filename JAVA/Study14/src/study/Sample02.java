package study;

public class Sample02 {
	public static void main (String[] args) {
		//중첩 for문
		//for문 사용시 기준점과 조건이 서로 다르면 무한반복의 위험이 있다.
		for(int i=0; i<3; i++) {
			System.out.println("외부 for문이 반복할때만 실행");
			for(int j=0; j<2; j++) {
				System.out.println("i="+i+", j="+j);
			}// 안쪽 for문 종료
			System.out.println("내부 for문이 종료 시에 외부for문 실행동안 실행");
		}// 바깥for문 종료
	}//main 종료
}//class 종료
