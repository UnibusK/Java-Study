package Paper01;



public class LV10 {
	public static void main(String[] args) {
		//다음의 배열을 내림차순으로 정렬하시오
		int[] arr= {50,90,88,72,60,10};
		
		int i;
		int n=arr.length;
		int k;
		for(k=0; k<n-1; k++) {
			arr[k]=arr[k+1];
			System.out.print(arr[k]+" ");
		}
		System.out.println("배열의 수는 "+arr.length+" 입니다.");
		
	} //main종료
} //class종료