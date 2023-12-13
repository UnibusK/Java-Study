package study;

public class ARRAY01 {
	public static void main(String[] args) {
		//배열 : 한개의 변수에 여러개의 값을 넣는 방법
		//타입[] 이름 : 해당 타입의 데이터가 여러개 들어갈 수 있는 배열 형태의 변수를 제작
		//이름=new 타입[칸수] : 지정된 칸수로 분할된 배열을 만들어달라는 명령
		
		int[] arr;
		arr=new int[3];
		//인덱스 index : 배열생성시 자동으로 ㄹ부여된 0번부터 시작하는 명칭
		//************ 매우중요 : 0번부터 시작하무로 지정한 칸수-1 수만큼의 인덱스(index)를 갖는다.
		//데이터를 배열에 입력하거나 출력할 경우 index를 통해서 수행해야 한다.
		
		arr[0]=80;
		arr[1]=60;
		arr[2]=33;
		
		System.out.println(arr[2]);
		
	} //main 종료
} //class 종료