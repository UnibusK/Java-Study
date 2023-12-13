package study;

public class ARRAY02 {
	public static void main(String[] args) {
		//타입[] 이름;
		//배열이름=new 타입[칸수]
		String[] str;
		str=new String[5];
		str[0]="봄";
		str[1]="여름";
		str[2]="가을";
		str[3]="겨울";
		str[4]="우기";
		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println(str[2]);
		System.out.println(str[3]);
		
		
		//배열형태의 데이터를 순서대로 출력해볼 수 있는 for문
		int i;
		for(i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}//for문 종료
		
		System.out.println(str.length);
		
		//집합 데이터를 바로 입력하는 방법
		int[] score= {100, 80, 60, 20, 30, 90, 49, 34, 39};
		System.out.println(score.length);
		
		int sum=0;
		for(i=0; i<score.length;i++) {
//			System.out.println("score["+i+"]="+score[i]);
			sum+=score[i]; // sum=sum+score[i]
		}
		System.out.println(sum);
	}//main 종료
}//class종료
