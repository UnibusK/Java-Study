package number;

public class Number {
	public static void main (String[] args) {
		//byte:바이트, 아주 작은 수만 저장할 수 있는 규격
		byte b;
		b=125;
		System.out.println(b);
		b=-128;
		System.out.println(b);
		
		//short : 숏, 짧은 수만 저장할 수 있는 규격
		short s;
		s=10000;
		System.out.println(s);
		
		//int : 인티져(인트) 일상생활에서 사용하는 대부분의 수를 저장할 수 있는 규격
		int i;
		i = 4000000;
		System.out.println(i);
		
		//long : 롱, 긴 수를 저정할 수 있는 규격
		//숫자가 너무 길어서 제일 뒤에 소문자 또는 대문자 L을 붙여야 사용 가능하다
		long m;
		m = 100000000000l;
		System.out.println(m);
	}
}