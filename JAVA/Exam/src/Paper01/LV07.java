package Paper01;

public class LV07 {
	public static void main(String[] args) {
		//다음을 만족하는 number를 찾으시오
		int number=0;
		if(number>1000) {
			if(number%2==0) {
	
			} else if (number%3==0) {
	
			} else if(number%5!=0) {
				if(number%7!=0) {
					if(number%11!=0 && number%13!=0) {
						
					} else {
						System.out.println(number);
					}
				}
			}
		}
	}//main종료
}//class종료


// 2,3,5,7,11,13의 배수가 아니고 1000이상의 수