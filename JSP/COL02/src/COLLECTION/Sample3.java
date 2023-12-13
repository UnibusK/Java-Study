package COLLECTION;

import java.util.*;

public class Sample3 {
	public static void main(String[] args) {
		ArrayList L = new ArrayList(); //유사배열형태의 여러 자료를 엄격한 순서로 젖아하는 규격
		//ArrayList.add(); : 데이터를 입력
		L.add("1");
		L.add("2");
		L.add("3");
		L.add("4");
		System.out.println(L);
		System.out.println(L.get(2)); //get방식으로 데이터를 뺌,
		
		ArrayList L2 = new ArrayList();
		L2.add("A");
		L2.add("B");
		L2.add("C");
		L2.add("D");
		System.out.println(L2);
		
		//ArrayList.addAll(ArrayList) : 기존 ArrayList에 다른 ArrayList 내용을 추간
		L.addAll(L2); //L에다가 L2를 통째로 붙이는 경우에 사용함
		System.out.println(L);
		//ArrayList.add(ArrayList) : 한 요소로 ArrayList가 2차원 형태로 추가
		L.add(L2);
		System.out.println(L);
		
		//ArrayList.add(int,data); : 해당 위치에 특정 데이터를 입력
		L.add(2,"가");
		System.out.println(L);
		
		//ArrayList.addAll(int, ArrayList); : 해당 위치에 특정 어레이리스트를 추가
		ArrayList L3=new ArrayList();
		L3.add("I");
		L3.add("O");
		L3.add("T");
		
		L.addAll(6, L3);
		System.out.println(L);
		
		//ArrayList.subList(int, int)l : 특정 부분의 데이터를 서브리스트로 제작. return 타입 List;
		List sub = L.subList(3, 9); // 3번부터 9번데이터 앞쪽까지 추출
		System.out.println(sub);
	}
}
