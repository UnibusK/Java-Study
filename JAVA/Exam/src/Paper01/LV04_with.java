package Paper01;

public class LV04_with {
	public static void main(String[] args) {
		//1에서 10까지 출력하는 for문을 작성하시오.
		for(int i=10; i>=1; i--) {
			for(int j=10; j>=10-i; j-- ) {
				System.out.print(" ");
			}
			for(int k=0; k<10; k++);
			System.out.println("*");
		}

	}//main end.
}//class end.
