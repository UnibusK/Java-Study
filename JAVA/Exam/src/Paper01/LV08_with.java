package Paper01;

import java.util.*;

public class LV08_with {
	public static void main(String [] args) {
		// 키보드로 값을 입력받아 도형의 면적을 구하는 소스를 완성해 보세요.
		// 삼각형의 면적은 너비*높이/2 입니다.
		// 사각형의 면적은 너비*높이 입니다.
		Scanner sc=new Scanner(System.in);
		System.out.println("계산할 도형을 선택하세요. 1:삼각형, 2:사각형");
		int number=sc.nextInt();
		System.out.println("너비를 입력해주세요");
		int width=sc.nextInt();
		System.out.println("높이를 입력해주세요");
		int height=sc.nextInt();
		System.out.println("선택사항 : "+number+", 너비 : "+width+", 높이 : "+height+" 입니다.");
		if(number==1) {
			System.out.println("삼각형의 면적은 "+ width*height/2+" 입니다.");
		} else if (number==2) {
			System.out.println("삼각형의 면적은 "+ width*height+" 입니다.");
		} else {
			System.out.println("숫자를 1,2로 입력해주세요.");
		}
	}
}
