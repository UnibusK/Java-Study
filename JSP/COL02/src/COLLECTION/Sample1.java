package COLLECTION;

import java.util.*; //자바 컬렉션은 이 경로에 들어있습니다.

public class Sample1 {
	public static void main(String[] args) {
		//자바컬렉션은 interface형태로 구현되어 있어서 바로 객체로 만들어 사용할 수 없다.
		//사용자가 별도로 implements하지 않아도 사용할 수 있도록 class가 미리 마련되어 있다.
			//	List L; //가능
			//	List L = new List(); //물가능
		List L = new ArrayList(); //노란줄 : ArrayList는 제네릭을 지정하지 않아서 노란줄 오류가 생김
		//List.add(Data); : 해당 데이터를 다음 순서로 입력
		// 데이터를 입력한 순서대로 리스트를 저장함
		//Array : 처음 만들때 데이터 칸을 지정하고 만들어야 함
		//Vector : 데이터의 칸을 10칸씩 증가시켜서 낭비가 많음
		//ArrayList : 만들 때 마다 칸이 하나씩 늘어나고, 순서대로 입력됨
		L.add(1);
		L.add(5);
		L.add(2);
		L.add(3);
		L.add(5985);
		L.add(1);
		System.out.println(L);
		
			//	Set s = new Set(); //불가능
		Set s = new HashSet();
		//Set.add(Data); : 해당 데이터를 입력, 순서가 엉망, 중복 데이터는 삭제 됨
		//index가 없어서 for문 으로 반복을 시킬 수 없다.
		//대소문자 구분을 엄격히 한다.
		s.add("Red");
		s.add("Orange");
		s.add("Green");
		s.add("Blue");
		s.add("Yellow");
		s.add("Navy");
		s.add("BLUE");
		System.out.println(s);
		
			//Map p = new Map(); //당연히 불가능!!!!!
		Map m = new HashMap();
		//Map.put(Key, Value); : 해당 데이터를 입력, 순서 없음, 엉망임, 키가 중볼될 경우 중복제거
		m.put("red", "빨강");
		m.put("blue", "파랑");
		m.put("green", "녹색");
		//키값이 같을 경우 나중에 들어온 데이터로 덮어서 저장하게 됨, 먼저 있던 데이터는 소거됨
		m.put("red", "뻘건");
		//값의 중복은 상관이 없음
		m.put("purple", "녹색");

		System.out.println(m);
		
	}
}
