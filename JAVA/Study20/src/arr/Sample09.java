package arr;

public class Sample09 {
	public static void main(String[] args) {
		//배열의 주소참조 특성때문에 배열을 복사할 경우, 하나만 변경되더라도 복사된 배열의 값이 따라서 다 바뀌는 현상이 생길 수 있다.
		//따라서 개발시 유사 오류가 발생한 경우 배열의 주소를 확인해야 한다.
		int[] A= new int[3];
		A[0]=50;
		A[1]=150;
		A[2]=200;
		int[] B;
		B=A;
		A[2]=4000;
		for(int i=0; i<A.length; i++) {
			System.out.print(A[i]+"\t");
		}//for A end.
		System.out.println();
		for (int i=0; i<B.length; i++) {
			System.out.print(B[i]+"\t");
		}//for B end.
		System.out.println();
		System.out.println(A);
		System.out.println(B);
		//이차원 배열
		//배열 내부의 한 요소가 배열의 형태로 만들어져 있는 경우
		int[]arr1= {1,2,3};
		int[][] arr2= {
						{1,2,3},
						{4,5,6},
						{7,8,9}
						}; //arr2 end.
		System.out.println(arr2[1][2]);
	}//main end.
}//class end.
