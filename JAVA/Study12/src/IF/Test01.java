package IF;

import java.util.*;

public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 점수 입력 : ");
		int score;
		score = sc.nextInt();
		System.out.print("점수는 " +score+ " 이고, ");
		String grade;
		if (score>=95) {
			grade="A+";
		} else if (score>=90) {
			grade="A";
		} else if (score>=87) {
			grade="A-";
		} else if (score>=85) {
			grade="B+";
		} else if (score>=80) {
			grade="B";
		} else if (score>=77) {
			grade="B-";
		} else if (score>=75) {
			grade="C+";
		} else if (score>=70) {
			grade="C";
		} else if (score>=57) {
			grade="C-";
		} else if (score>=55) {
			grade="D+";
		} else if (score>=50) {
			grade="D";
		} else if (score>=47) {
			grade="D-";
		} else {
			grade="F";
		} // 학점 변환 if else 종료
		System.out.println("학점은 " +grade+ " 입니다.");
	}//main 종료
}//class 종료
