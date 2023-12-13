package op;

public class Sample03 {
	public static void main (String [] args) {
		//증감연산자의 전위, 후위 차이점
		//증감연산자가 단독으로 사용될 경우에는 우선순위의 문제가 없음
		//다만, 증감연산자가 =과 결합될 경우 전위와 후위의 우선 순위 문제가 발생

		//전위증감의 경우 증감연산자가 =보다 먼저 계산된다.
		//후위증감의 경우 증감연산자가 =보다 늦게 계산된다.
		int num=5;
		int result;
		result=num++; // 단독으로 사용할 경우, ++num와 num++ 같은 결과가 나옴 = 와 결합할경우 앞에서부터 순서대로 진행
		System.out.println(result);
		System.out.println(num);
		
		//증감대입 연산자
		// A+=B : A=A+B 
		// A-=B : A=A-B : 혼동되지 않도록 주의
		// A*=B : A=A*B
		// A/=B : A=A/B
		// A%=B : A=A%B
		
		int a=10;
		a-=5;
		System.out.println(a);
	}
}
