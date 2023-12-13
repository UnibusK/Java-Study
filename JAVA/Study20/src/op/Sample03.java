package op;

public class Sample03 {
	public static void main(String [] args ) {
		//단한연산자
		//이항연산자
		//삼항연산자
		
		//산술연산
		//논리연산 : 계산의 결과가 true 또는 false로 나온느 것, 조건으로 사용
		
		//대입연산자
		int a=3;
		//부정연산자
		System.out.println(!true);
		//증감연산자
		a++;
		//산술연산자
		int b=a+5;
		//비교연산자 : <. >, <=. >=, ==, !=
		boolean result= a<b;
		//논리연산자; &&, ||
		result= true || false;
		//비트연산자 : & | ^ (논리연산자와 헷갈리지 말것)
		//시프트 연산자 : <<, >>
		//삼항연산자 : 조건?참:거짓;
		result = (a>3)?true:false;
		System.out.println(result);
	}//main end.
}//class end.
