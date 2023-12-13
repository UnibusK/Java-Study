package op;

public class Sample01 {
	public static void main(String[] args) {
		//연산자 : 계산기호
		//단항연산자 : 계산할 때 항이 1개 필요한 연산자, 증감연선자
		//이항연산자 : 계산할 때 항이 2개 필요한 연산자, 나머지 (+,-,*,/,= 등)
		//삼항연산자 : 계산할 때 항이 3개 필요한 연산자, 삼항연산자
		
		//대입연산자 : = 왼쪽에다가 오른쪽에 있는 내용을 대입한다.
		//연산우선순위가 상당히 늦다.(거의 마지막에 계산 됨)
		//int a=4;
		int a;
		a=4;
		System.out.println("결과는 "+a+"입니다");
		
		//산술연산자 : 계산의 결과가 값으로 표현되는 연산자
		// + : 더하기
		// - : 빼기
		// * : 곱하기
		// / : 나누기, int끼리의 나눗셈은 몫을 반환
		// % : 나머지, 나눗셈의 나누기가 이루어진 이후 나머지를 반환
		
		int first=10;
		int second=3;
		double result;
		
		result=first%second;
		System.out.println("계산 결과는 "+result+" 입니다.");
		
		
	}
}