package COLLECTION;

import java.util.*;

public class Sample4 {
	public static void main(String[] args) {
		ArrayList<String> AL = new ArrayList<String>(); //AL 변수 사용하기 전에 노란줄 가있음, 안쓸건데 왜 만들어 놨어!?
		//AL.add(100); //int 타입으로 오류남
		AL.add("Universe");
		AL.add("Kim");
		AL.add("힘내라");
		AL.add("할수있다");
		AL.add("해낸다");
		System.out.println(AL);
		
		//ArrayList.get(int); : 해당순번의 데이터를 참조
		System.out.println(AL.get(3)); //인덱스는 0부터 시작합니다.
		//ArrayList.set(int, data); : 해당 순번의 데이터를 변경
		AL.set(0, "우주");		//0번 인덱스를 "우주"로 변경
		System.out.println(AL);
		
		//하단 4가지 방법중에 하나를 사용해도 되지만, 모두 읽을 수 있어야 한다.
		//1. 일반 for문을 이용하는 방식, 배열운행은 array.lenght, ArrayList 운행은 ArrayList.size();
		/* for(int i=0; i<AL.size(); i++) {
			System.out.println(AL.get(i));
		} */
		
		//2. 향상된(improved) for문을  이용하는 방식 (다른 언어에서는 foreach라고 하는 문법, 자바에서는 foreach는 다른 문법이 있음)
			//처음부터 끝까지 차례대로 반복하기 때문에 일부 추출이 불가능,
		/* for(String str:AL) {
			System.out.println(str);
		} */
		
		//3. while문을 이용하는 방식
		/* int i=0;
		while(i<AL.size()) {
			System.out.println(AL.get(i));
			i++;
		} */
		
		//4. iterator(이터레이터)를 이용한 방법 // 이터레이터 - 눈에 안보이는 커서 같은 느낌
		//Iterator.next() : 현재위치 바로 뒤 데이터를 반환한 뒤 자신의 위치를 이동
		//Iterator.hasNext() : 현재위치 바로 뒤에 데이터가 있는지 여부를 확인
		Iterator itr=AL.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		//ArrayList를 제작하자마자 값을 넣어두는 방법
		ArrayList<Integer> AL2 = new ArrayList<Integer>(Collections.nCopies(10,3)); //nCopies(int, object)
		System.out.println(AL2);
	}
}
