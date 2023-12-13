package fin;

public class Fin {
	public static void main (String[] args) {
		//변수 : 내부의 데이터를 변경할 수 있는 상자
		//상수 : 내부의 데이터를 변경할 수 없는 상자
		//상수는 final 타입 이름; 을 통하여 제작할 수 있다.
		
		int a;
		a=3;
		a=5;

		final int b;
		b=3;
		//b=5;
		
		//덧샘 : 
		System.out.println(10+20);
		System.out.println("가"+10+20);
		System.out.println("가"+(20+30));
	}
}
