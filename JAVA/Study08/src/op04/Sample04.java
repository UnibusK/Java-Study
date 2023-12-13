package op04;

public class Sample04 {
	public static void main (String[] args) {
		// 논리연산자 : true, false를 가지고 true 또는 false의 결과를 계산해 내는 연산자
		// && : and, 두 조건이 모두 true 이면 true
		// || : or, 두 조건 중 하나라도 true 이면 true
		// 계산의 결과가 true 또는 false로 변환된다.
		
		boolean t=3<5;
		boolean f=3>5;
		boolean result;
		result= t || f;
		System.out.println(result);
			
		// {} : 블락, 설계도(class) 내부에서 부분을 나누는 기능
		// 블락 내부에서 생성된 변수는 블락 외부에서 사용할 수 없다.
		// 모든변수는 본인이 만들어진 블락에서 벗어나면 소멸한다.
	
	}
}
