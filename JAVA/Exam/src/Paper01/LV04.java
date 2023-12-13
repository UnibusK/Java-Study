package Paper01;

public class LV04 {
	public static void main(String[] args) {
		/*다음 모양이 되도록 작성하시오
		          * 
		         *
		        *
		       *
		      *
		     *
		    *
		   *
		  *
		 *
		*
	   *
	   */
		
		int i;
		int star;
		for(i=10; i>=1; i--) {
			for(star=1; star<=i-1; star++) {
				System.out.print(" ");
			}//안쪽 for문 종료
			System.out.println("*");
		}// 바깥 for종료
	}//main종료
}//class종료