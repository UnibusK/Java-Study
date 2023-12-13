package obj;

public class Sample01 {
	public static void main (String[] args) {
		Animal a1 = new Animal();
		a1.sound="멍멍";
		a1.race="개";
		a1.setAge(-100);
		//a1.age=15;
		// a1.number=20; //상수는 변수로 못 들어감
		Animal a2 = new Animal();
		a2.sound ="야옹";
		a2.race="고양이";
		// a2.number=30;
		System.out.println(a1.sound);
		System.out.println(a1);
		System.out.println(a2.sound);
		System.out.println(a2);
		Animal a3=new Animal(-100,"멍멍", "개");
		System.out.println(a3);
		System.out.println(a3.getAge());
		Animal s4=new Animal();
		s4.setSound("앙");
		System.out.println(s4.sound);
	}
}
//extends가 붙어있지 않은 모든 class는 extends Object로 본다.
//Object 클래스는 toString이라는 메서드를 가지고 있다. 객체의 내용을 String으로 변경

class Animal {
	//필드 != 변수
	String sound; 	//울음소리
	String race; 	//종족정보
	private int age;		//나이
	// private은 제한을 두기 위해서 사용함, 보안때문에 사용하는 것은 아님
	final int number=10;	//상수로는 객체간에 구별되는 속성을 저장할 수 없다.	
	
	Animal(int a, String b, String c){
		age = a;
		sound = b;
		race = c;
		if (age<1) {
			System.out.println("나이를 다시 입력해주세요.");
			age=1;
		} else {
			age=a;
		}
	}
	Animal(){
		
	}
	public String toString() {
		return "나이 : "+age+" \t종족 : " + race + " \t울음소리 : " + sound;
	}
	public void setAge(int a) { // 메서드 카멜기법으로 2개의 단어가 붙어있을 때, 두번째단어부터 대문자로 적기
		if ( a<1 ) {
			System.out.println("나이는 1살 이상을 적어야합니다.");
			age=1;
		} else {
			age= a;	
		}
		
	}
	public int getAge() {
		return age;
	}
	public void setSound(String s) {
		if (s.length() <2) {
			System.out.println("두글자 이상으로 적어주세요.");
			sound=s+s;
		} else {
			sound=s;
		}
	}
	
}