package Paper01;

public class LV05 {
	public static void main(String[] args) {
		/*다음의 모양이 되도록 작성해보세요
		 *
		**
	   ***
	  ****
	 *****
	******
   *******
  ********
 *********
		 */
		

		int i;
		int j;
		int k;
		for(i=10; i>=1 ; i--) {
			for(j=1; j<=i-1; j++) {
				System.out.print(" ");
			}//첫번째 for문 종료
			for(k=10; k>i-1; k--) {
				System.out.print("*");
			}//두번째 for문 종료
			System.out.println(" ");
		}//바깥 for문 종료
	}//main 종료
}//class 종료
