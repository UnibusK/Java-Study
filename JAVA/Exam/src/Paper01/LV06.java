package Paper01;

public class LV06 {	
	public static void main(String[] args) {
		//구구단을 가로로 작성되게 하시오
		int i;
		int j;
		for(i=2; i<=9; i++) {
			System.out.print("<<"+i+">>"+"단	");
		}//for문 종료
		System.out.println(" ");
		for(j=1; j<=9; j++) {
			for(i=2; i<=9; i++) {
				System.out.print(i+"*"+j+"="+i*j+"	");
			}
			System.out.println(" ");
		}
	}//main종료
}//class 종료
