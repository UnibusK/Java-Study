package input;

import java.util.Scanner;

public class Sample02 {
	public static void main (String [] args) {
		Scanner sc=new Scanner(System.in);
//		String s=new String();  원래 스트링 타입일 경우에 써야하는 것이지만 자바에서 기본형으로 지원
		System.out.println("성함을 입력해주세요");
		String name;
		name=sc.next();
		sc.close();
		System.out.println("입력받은 내용 : " +name);
	}
}
