package op;

public class Sample02 {
	public static void main (String [] args) {
		//단항연산자 : 항이 하나만 있어도 연산이 가능한 연산자
		//증감연산자 : 데이터를 한단위 줄이거나 늘리는 용도로 사용
		// ++ : 데이터를 한단위 증가
		// -- : 데이터를 한단위 감소
		//부정연산자 : true와 false를 반전
		// !
		int num=3;
		num--;
		num--; // num=num+1 같은 뜻
		System.out.println(num);
		
		boolean t=!true;
		System.out.println(t);
		
		//삼항연산자 : 항이 세개 있어야 연산이 가능한 연산자
		//조건?식1:식2 ; 조건이 참이면 식1, 조건이 거짓이면 식2
		int i;
		String s;
		i=10;
		s=(i>=0)?"양수":"음수";
		System.out.println(s);
	}
}
