package study;

public class Game01 {
	public static void main(String[] args) {
		//3,6,9게임
		int i;
		int num369;
		for(i=1;i<=50;i++) {
			num369++;
			if( num369%10==3 | num369%10==6 | num369%10==9) {
				System.out.println("박수");
			} //if 종료
			System.out.println(i);
		}//for 종료
	}// main 종료
}// class 종료
