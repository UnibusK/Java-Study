package arr;

public class Sample08 {
	public static void main(String [] args) {
		//배열 : 하나의 변수에 여러 값을 담는 기법
		//자료형 [] 이름 :
		//이름=new 자료형[칸수];
		//index는 0번 부터 시작하므로 마지막 번호는 칸수-1이다.
		int[] A;
		A=new int[3];
		A[0]=10;
		A[1]=20;
		A[2]=30;
		System.out.println(A[3]);
		int[] B={40,50,60,70,80};
		System.out.println(B[3]);
	}//main end.
}//class end.
