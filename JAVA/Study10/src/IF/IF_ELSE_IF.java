package IF;

public class IF_ELSE_IF {
	public static void main (String[] args) {
	 	//if-else-if문 : 조건이 여러개인 if문
		// ******************* 중요
		// 동시에 실행될 수 없다.
		// 조건은 위에서부터 순서대로 보기 때문에 조건의 범위설정시 주의해야한다. (위쪽 조건이 넓으면 안된다,)
		// 조건의 포함범위가 작은 것부터 큰것으로 순서대로 나가는 것이 오류를 막을 수 있다.
		/* if (조건1) {
			조건1이 참일 경우 수행할 문장;
		} else if(조건2) {
			조건1이 거짓이고 조건2가 참일 경우 수행할 문장;
		} else if(조건3) {
			조건 1과 조건2가 거짓이고 조건3이 참일 경우 수행할 문장; 
		} else {
			위의 모든 조건이 거짓일 경우 수행할 문장;
		}
		*/
		
		int num=-11;
		if (num>7) {
			System.out.println(num+"은 7보다 큽니다.");
		} else if(num>5) {
			System.out.println(num+"은 5보다 큽니다.");
		} else if(num>0) {
			System.out.println(num + "은 0보다 큽니다.");
		} else {
			System.out.println("모든 조건이 거짓입니다.");
		}
	}
}

