package IF;

import java.util.*;

public class Sample01 {
	public static void main (String [] args) {

//		if(조건:계산의 결과가 참 또는 거짓으로 나오는 것/ 1+3은 안됨) {
// 			실행될 내용			
//		} //if문 종료
		
		//위에서부터 순서대로 조건을 보고 하나라도 참이 나오면 아래는 보지 않는다.
		//if-else-if 조건을 잘때는 범위에 주의한다.(좁은범위부터 하나씩 넓게 제작)
		Scanner sc=new Scanner(System.in);
		int score;
		System.out.print("학생 성적을 입력 : "); // 처음 안내문
		score=sc.nextInt(); // nextInt : 실행되고 있는 프로그램을 정지시키고, 외부에서 들어온 값을 숫자로 내보내 주는 함수
		System.out.print("입력된 점수는 " +score+ " 이고, ");
		String grade;
		if (score>=90) {
			grade="A";
		} else if(score>=80) { //else 시작, if 종료
			grade="B";
		} else if (score>=70) {
			grade="C";
		} else {
			grade="F";
		}//if-else-if 종료
		System.out.println("학점은 " +grade+ " 입니다.");
	} //main 종료 : 프로그램 종료 지점
} //class 종료 : 설계도 종료 지점
