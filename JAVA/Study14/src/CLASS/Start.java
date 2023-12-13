package CLASS;

public class Start {
	public static void main(String[] args) {
		//class명 이름; class가 조립된 객체가 들어갈 수 있는 크기의 변수 제작
		Sample s1=new Sample(); //Sample이라는 class를 s라는 객체로 조립
		Sample s2=new Sample();
		
		s1.gold=10000;
		System.out.println(s1.gold);
		System.out.println(s1.name);
		
		System.out.println(s2.gold);
		System.out.println(s2.name);
		
		//System.out.println(Sample.name); 
		//아직 설계단위이기 때문에 객체가 아니라서 사용이 불가능하다. (static이 설계도 안에 붙어야 함)
	}//main종료
}//class 종료

//class는 class 이름{}으로 제작할 수 있다.
class Sample{
	//class:설계도, 객체로 조립하지 않으면 사용할 수 없다.
	//class는 필드, 메서드. 생성자를 가질 수 있다. **********매우 중요
	
	//필드: 객체의 속성을 담을 수 있는 공간, 다른 객체와 비교를 위한 데이터를 담는다.
	//메서드: 객체가 수행할 수 있는 동작
	//생성자: 객체를 조립하는 방식
	int gold=5000;
	String name="김우주";
}//두번째 class 종료