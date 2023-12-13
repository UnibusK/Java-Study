package op;

public class Sample04 {
	public static void main(String [] args) {
		//단항증감연산의 전위증감과 후위증감
		//전위증감 : 증감을 우선 완료한 후 다른 여산 수행
		//후위증감 : 다른 연산을 우선 수행한 후 증감 수행
		//조심해서 사용하고 가급적 방식을 하나만 사용하는 것으로! =과 연결되었을때 발생하는 문제
		int a=3;
		int b= a++;
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		//논리연산의 계산
		// && : 앞, 뒤 모두 true일때만 true, 그 외에는 false
		// || : 앞, 뒤 모두 false일때만 false, 그 위외에는 true
		boolean c=(3*5)>(3+5);
		boolean d=(5/2)>=(5-2);
		boolean e= c || d;
		System.out.println(e);
	}// main end.
}//class end.
