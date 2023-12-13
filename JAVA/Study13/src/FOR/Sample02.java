package FOR;

public class Sample02 {
	public static void main(String[] args) {
//		//1~10까지 반복하는 for문을 만들어 출력하시오
//		int i=0;
//		for(i=1; i<=10; i++) {
//			System.out.println(i);
//		} // 첫번째 for문 종료

		
		//1~10에서 홀수만 for문을 만들어 출력하시오
		int h=0;
		for(h=1; h<6 ; h++ ) {
			System.out.println(h*2 -1);
		} // 두번째 for문 종료
		
		int a=0;
		for(a=1; a<11; a++) {
			if(a%2==1) {
				System.out.println(a);
			}//if문 종료
		}//for문 종료
		
		for(a=1; a<=10; a++) {
			if(a%2==0) {
			} else { //if 종료
				System.out.println(a);
			}//else 종료
		}//for문 종료
		
		for(a=1; a<11; a+=2) {
			System.out.println(a);
		} // for문 종료
		
		for(a=1; a<11; a++) {
			if(a==3) { //if문은 실행한다음 마무리되면 없어진다고 생각해라
				break;
			}//if문 종료
			System.out.println(a);
		}//for문 종료
		System.out.println("for문 외부");
		
		for(a=1;a<=10; a++) {
			if(a==3) {
				continue; //continue 나오는 시점에 따라서 해당차수가 없어지는게 다르다
			}//if문 종료
			System.out.println(a);
		}//for문 종료
		
		
//		int cnt=0;
//		int a=0;
//		for(a=1; a<11; a++) {
//			cnt++
//			System.out.println(cnt*a);
//		}
	}//main종료
}//class종료
