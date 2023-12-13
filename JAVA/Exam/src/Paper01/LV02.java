package Paper01;

public class LV02 {
	public static void main(String[] args) {
		//다음 소스코드에서 잘못된 부분을 확인하시오.
		
		int num=20;
		if(num==20) { 		//==으로 작성
			int num1=30; 	//int 삭제
			num=40;		 	//변수타입을 빼고 변수명과 값만 작성해야함
			num1=50;
			System.out.println(num1);
		}//if종료		
				//if문 밖에 변수, 변수타입 작성함
		int num2=60;
	}// main종료
}//class종료
