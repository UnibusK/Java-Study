package COLLECTION;

import java.util.*;

public class Sample2 {
	public static void main(String[] args) {
		//List자료형의 원시적인 자료형태 
		//Stack : 데이터가 순서대로 입력되고, 역순으로 빠져나오는 자료형 // LIFO, 후입선출
		//Vector : 데이터가 순서대로 입력되고, 용량이 자동 증가(10칸씩) 하는 자료형
		
		Stack L = new Stack();
		//Stack.push() : 데이터를 입력
		//Stack.pop() : 데이터를 출력
		
		L.push("안녕");
		L.push("잘가");
		L.push("반가워");
		System.out.println(L);
		Object data=L.pop();
		System.out.println(data);
		System.out.println(L);
		//stack over flow : 코드 오류 공유하는 사이트
		System.out.println("==============================================");
		
		Vector v=new Vector(); //데이터가 들어오면 용량을 더 늘리는 배열
		//Vector.add(); : 데이터를 입력
		//Vector.get(); : 데이터를 출력
		v.add(1);
		v.add(2);
		v.add(3);
		for(int i = 4; i<=35; i++) {
			v.add(i);
		}
		System.out.println(v);
		//Vector.capacity(); : 벡터의 용량을 확인, return 타입 int
		//Vector.size(); : 벡터의 데이터 길이를 확인
		System.out.println("백터의 용량 : "+v.capacity());
		System.out.println("벡터의 사이즈 : " +v.size());
		System.out.println("10번 데이터 출력 : " +v.get(10));
	}
}
