package COLLECTION;

import java.util.*;

public class Sample5 {
	public static void main(String[] args) {
		//ArrayList 정렬 처리 하는 방법
		
		ArrayList<Integer> AL=new ArrayList<Integer>();
		AL.add(600);
		AL.add(4);
		AL.add(301);
		AL.add(80);
		AL.add(19);
		AL.add(0);
		System.out.println(AL);
		
		//오름차순 정렬
		Collections.sort(AL);
		System.out.println(AL);
		//내림차순 정렬
		Collections.sort(AL, Collections.reverseOrder());
		System.out.println(AL);
	
				
		//타입을 String으로 바꿔보자
		ArrayList<String> AL2= new ArrayList<String>();
		AL2.add("A");
		AL2.add("B");
		AL2.add("E");
		AL2.add("F");
		AL2.add("D");
		AL2.add("C");
		Collections.sort(AL2);
		System.out.println(AL2);
		
		//주의사항
		//1. 객체를 비교할 때는 다음의 sort를 사용할 수 없다.
		//2. 리스트는 순번이 업격하기 때문에 정렬된 내용이 영구적으로 반영된다.
		
	}
}
