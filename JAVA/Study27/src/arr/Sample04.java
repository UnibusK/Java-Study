package arr;

public class Sample04 {
	public static  void main(String[] args) {
		//try-catch(오류타입) : 오류가 발생하더라도 프로그램을 종료하지 않고 다른 부분은 실행되도록 하는 문법
		//트라이-캣 사이에 있는 내용에 대해서 오류를 잡고, 패치가 실행됨
		//프로그램이 종료되지 않고 실행됨
		//************매우중요!!!!!!!!!!
		System.out.println("배열을 만듭니다.");
		try {
			int[] a=new int[5];
			a[0] = 10;
			a[1] = 20;
			a[2] = 30;
			a[3] = 40;
			a[4] = 50;
			a[5] = 60; // 오류가 나는 지점 (배열 5칸 만들라고 했음)
			System.out.println("이부분은 실행되지 않습니다.");
		} catch(Exception e) {
			System.out.println("처리도중 오류가 발생했습니다.");
			System.out.println("###Sample04.jave::18 김우주###"+e); 	//오류 단서 달아두는 방법
			System.out.println("==================="+e);			//오류 단서 달아두는 방법
			//e.printStackTrace(); // 오류 찾는 문법이지만, 위의 방법으로 쓰는게 오류 찾는데 더 도움이 됨
		}
		System.out.println("배열 처리가 끝났습니다.");
		
	}
}
