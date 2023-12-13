package method;

public class Sample01 {
	public static void main(String[] args) {
		//1~10까지 출력하는 for문 작성
		int i=0;
		for(i=1;i<=10;i++) {
			System.out.println(i);
		}//for end.
		//객체 : 설계도가 조립된 결과물(제품)
		exam num=new exam();
		num.run(4,15);
//		num.run2(20, 25);
		
		
		//메서드를 실행히 "안녕하세요"를 출력하도록 제작해보세요.
		num.hi();
		
		
	}//main end.
}//class end.

//이름이 exam인 클래스 제작 후, 1~10 반복문하는 메서드 만들기
//리턴타입이 void이고 이름이 run인 메서드를 제작해 보기
//public static void main 내부에서 메서드를 실행시켜 보기
class exam{
	/* 메서드 제작법 : 리턴타입 이름(){} */
	//메서드란 설계도에 작성되어 객체가 수행하는 동작이다.
	//그동안 배워온 제어문(if, for, while, switch)은 메서드 내부에서 사용 가능하다.
	int i; //**변수 먼저 지정하기
	void run(int a, int b) {
		for(i=a;i<=b;i++) {
			System.out.println(i);
		}//for end.
	}//void num1_10 end.
	
//	int[] in;
//	int run2(int c, int d) {
//		for(in=c;c>=d;c--) {
//			int++;
//		}//for end.
//		return in;
//	}//run2 end. -> 배열로 가져와야 함
	
	void hi() {
		System.out.println("안녕하세요");
	}//hi end.	
}//exam end.


//java는 컴퓨터와 소통하기 위한 언어이다.
//class : 클래스는 설계도다 => 조립하지 않으면 쓸 수 없다. => 조립된 결과물을 객체(object)다.
//동작은 설계도에 적혀있지만 실행은 조립된 결과물이 해야한다.
//== 메서드는 클래스에 적혀있지만 실행은 객체가 해야한다.
//객체는 new 생성자()로 만들 수 있지만, 컴퓨터와 소통하기 위해서는 변수에 담아야 한다.
//객체를 담기 위한 변수는 그 크기자리에 클래스명을 적어서 크기를 특정한다.
/* 클래스명 변수명;
   변수명 = new 클래스명() */
//or 클래스명 변수명=new 클래스명()
