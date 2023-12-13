package op02;

public class Sample02 {
	public static void main (String[] args) {
		// 비트(bit)연산자 : 2진수로 변환하여 자릿수별로 계산하는 방법
		// & 앤드 : and 두개의 숫자 자리수에서 1일경우 1로 반환, 
		// | 오어 : or 두개중 하나라도 1이면 1로 반환
		// ^ 익스클로시보 : xor 둘이 서로 다르면 1
		// 실개발에서 잘 사용하지 않는다. 다만 &&와 ||와 혼돈하면 안된다
		int first=3;
		int second=5;
		int result;
		
		result=first|second;
		System.out.println(result);
		
		// 시프트연산자 : 변위 (위치를 바꿔주는것), 이진수를 바꿔서 자릿수를 이동시키는 연산
		// << : A << B, A를 B만큼 자릿수를 늘리는 것. 계산식 : A*2^B 
		// >> : A >> B, A를 B만큼 자릿수를 줄이는 것.
		// 실개발에서 잘 사용하지 않는다. 다만 <와 >와 혼돈하면 안된다.
		
		first=3;
		second=1;
		result=first>>second;
		System.out.println(result);
	}
}
