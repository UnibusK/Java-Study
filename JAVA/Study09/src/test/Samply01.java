package test;

public class Samply01 {
	public static void main (String [] args) {
		// 각 변수마다 데이터 하나씩 넣기
		int a=114;		//**중요** 상수, 일상적인 숫자
		boolean b=true;	//**중요** true or false만 들어감
		char c='가';		//65 숫자를 쓰면, A를 출력함 (아스키코드 65=A라서)
		byte d=2;		
		short e=34;		
		long f=2332000000L;	
		float g=3.123456789123456789123456789f;	
		double h=2.123587872421234567891234597545612354897;	//**중요** 소수점 이하 많을 때
		String i="안녕하세요";	//**중요** 많은 문자
		
		// 아스키 코드 - 문자 1개마다 숫자를 대입해 놓은 것 //
		
		System.out.println(a);
		System.out.println(b);		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
	}
}
