package Naming;

public class name {
	public static void main(String[] args) {
		//변수 작명기법
		//1. 이름은 대소문자를 엄격하게 구별한다(int a;와 int A; 는 다름)
		//2. 이름에는 띄어쓰기를 사용할 수 없다 kim u ju (x)
		//3. 특수문자는 _와 $ 만 사용할 수 있다 d3@% (X) kim_u_ju(o)
		//4. 이름은 숫자로 시작할 수 없다. 숫자가 들어가는 건 상관없음 1a3f(x)
		
		int iot_programing;
		iot_programing=25;
		System.out.println(iot_programing);
		
		//변수이름 작명시 참조할 수 있는 관습
		//1. 파스칼표기 : 모든 글자의 첫번째 글자를 대문자로 적는 것(ex. java html css -> JavaHtmlCss), class이름 지을 때 사용
		//2. 카멜표기 : javaHtmlCss, 첫단어는 소문자, 두번째 세번째부터 대문자로 표기, 동작method의 이름을 지을 때
		//3. 팟홀표기 : java_html_css, 변수이름 지을 때 사용
	}
}
