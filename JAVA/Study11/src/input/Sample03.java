package input;

import java.util.*;

public class Sample03 {
	public static void main (String[] args) {
		
		//Integer.parseInt(String) : 숫자모양의 문자 데이터를 숫자로 변환
		
		Scanner sc=new Scanner(System.in);
	
		int num1;
		//int inum1;
		int num2;
		//int inum2;
		int sum;
		System.out.println("첫번째 수를 입력해주세요");
		num1=sc.nextInt(); //next는 글자를 가져오는 타입, nextInt
		//inum1=Integer.parseInt(num1);  ,.....숫자문자를 숫자로 바꾸는 방법
		System.out.println("두번째 수를 입력해주세요");
		num2=sc.nextInt();
		//inum2=Integer.parseInt(num2);
		sum=num1+num2;
		System.out.println("둘을 합치면 "+sum);
		
	}// main 종료부분
}// class 종료 부분
