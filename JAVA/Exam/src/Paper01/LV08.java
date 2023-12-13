package Paper01;

import java.util.Scanner;

public class LV08 {
	public static void main (String[] args) {
		//키보드르 입력받아 도형의 면적을 구하는 소스를 완성
		Scanner sc=new Scanner(System.in);
		System.out.println("계산할 도형을 선택하세요. 1:삼각형, 2:사각형");
		int number=sc.nextInt();
		System.out.println("너비를 입력해주세요");
		int width=sc.nextInt();
		System.out.println("높이를 입력해주세요");
		int height=sc.nextInt();
		sc.close();
		if(number==1) {
			System.out.println("삼각형의 넓이는 "+width*height/2+" 입니다.");
		} else if (number==2){
			System.out.println("사각형의 넓이는 "+width*height+" 입니다.");
		}
	}//main 종료
}//class종료
