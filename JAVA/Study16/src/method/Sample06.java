package method;

public class Sample06 {
	public static void main(String[]args) {
		//Calc내부에 숫자 두개(150, 250)를 받아 더하는 메서드를 제작하고 그 결과를 출력하시오
		Calc result=new Calc();
		result.setScore(150, 250);
		int c=result.plus(150,250);
		System.out.println(c);
		
		result.numa_b(30, 90);
		
		
		//실행되면 1~100까지 출력하도록 메서드를 제작하시오

		
	}//main종료
}//class 종료

class Calc {
	int num1;
	int num2;
	
	void setScore(int n1, int n2) {
		num1=n1;
		num2=n2;
		System.out.println("결과는 "+(n1+ n2)+" 입니다.");
	}//getScore종료
	
	int plus(int a, int b) {
		return a+b;
	}//plus 종료

	void numa_b(int a, int b) {
		int i=0;
		for(i=a; i<=b; i++) {
			System.out.println(i);
		}
	}
}//Calc class종료