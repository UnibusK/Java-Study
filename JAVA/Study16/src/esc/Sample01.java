package esc;

public class Sample01 {
	public static void main(String[] args) {

		//이스케이프(escape) 문자 : 역슬러시는 문자로 인식
		//명령 기호로 사용되는 문자 또는 표기가 어려운 문자를
		//역슬러시를 이용하여 표현하는 방법
		// \t : (역슬러시t) tap키는 로 작성-문자의 길이에 따라 적다히 거리를 벌려주는 문자
		// \n : 엔터키, 문자열 사이에 줄바꿈을 해주는 기능
		// ************* 매우 중요 : 프로그램 만들때 필요할수있음
		System.out.println("쌍따옴표는\"는 꼭 쌍을 맞춰야 한다.");
		System.out.println("문자열은\"이렇게\" 표현해야 한다");
		System.out.println("\t탭키");
		System.out.println("이영준"+"\t"+"103"+"\t"+"서울특별시");
		System.out.println("우주"+"\t"+"1210"+"\t"+"강원도");
		System.out.println("우주\t1210\t강원도");
		System.out.println("동해물과\n백두산이\n마르고\t닳도록");
		System.out.print("일반 print는 ");
		System.out.printf("줄바꿈이 이루어지지 않습니다.");
	}//main 종료	
}//class 종료
