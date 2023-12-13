package bool;

public class Bool {
	public static void main (String[] args) {
		//boolean : 불리언, 참(true), 거짓(false)을 저장할 수 있는 규격
		boolean b;
		b=true;
		b=false;
		System.out.println(b);
		b=true;
		System.out.println(b);
		
	//	B=true // 상자를 만들기 전에 값을 넣을 때 오류 , 절차진행형, 위에서 아래로 읽어내려가는 형식
		boolean B=true;
	//	boolean B=false; //=> 오류가 남, B상자를 또 생성
		System.out.println(B);
	}
}
