package COLLECTION;

import java.util.*;

public class Sample7 {
	public static void main(String[] args) {
		
		//전반적인 성능은 ArrayList가 우월하다.
		
		LinkedList<String> L = new LinkedList<String>();
		//ArrayList와 사용법은 동일
		//데이터 간의 연결 링크가 남아 있는 형태로 구현되어 인근값의 검색이 빠르고
		//첫값(first)과 끝값(last)을 찾아내는데 특화된 기능을 가지고 있다.
		L.add("A");
		L.add("B");
		L.add("C");
		L.add("D");
		L.add("E");
		L.add("F");
		L.add("G");
		System.out.println(L);
		
		//첫번째에 값을 추가
		L.addFirst("H");
		//마지막에 값을 추가
		L.addLast("I");
		System.out.println(L);
		//첫번째 값 삭제
		L.removeFirst();
		//두번째 값 삭제
		L.removeLast();
		System.out.println(L);
		
	}
}
