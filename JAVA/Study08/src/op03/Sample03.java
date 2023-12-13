package op03;

public class Sample03 {
	public static void main (String[] args) {
		// 비교연산자 : 앞과 뒤의 내용을 비교해서 True또는 false를 반환하는 연산자
		// < : 왼쪽이 오른쪽보다 작은지 확인
		// > : 왼쪽이 오른쪽보다 큰지 확인
		// <= : 왼쪽이 오른쪽보다 작거나 같은지 확인
		// >= : 왼쪽이 오른쪽보다 크거나 같은지 확인
		// == : 양쪽이 같은지 확인 **** 
		// != : 양쪽이 다른지 확인
		int first=3;
		int second=3;
		boolean result;
		result = first != second; // !는 반전을 뜻함
		System.out.println(result);
	}
}
