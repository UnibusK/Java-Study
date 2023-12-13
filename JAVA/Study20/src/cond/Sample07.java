package cond;

public class Sample07 {
	public static void main(String[] args) {
		for(int i=0 ; i<3; i++) {
			System.out.println(i);
		}//for end.
		
		
		//while은 기준점 , 조건, 변경식이 다 갖추어지지 않으면 무한반복의 우려가 있다.
		int a=0;
		while(a<3) {
			System.out.println(a);
			a++;
		}//while end.
	}//main end.
}//class end.
