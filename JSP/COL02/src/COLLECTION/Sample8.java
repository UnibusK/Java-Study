package COLLECTION;

import java.util.*;
import java.util.function.Consumer;


public class Sample8 {
	public static void main(String[] args) {
		HashSet<String> s=new HashSet<String>();
		//Set은 순서가 없다. 중복데이터를 허용하지 않는다.
		s.add("apple");
		s.add("mango");
		s.add("grape");
		s.add("orange");
		s.add(null);		//데이터가 없는 공백 
		s.add("0");		//String 타입의 null이라는 문자열, "null"이라는 문자는 가급적 저장하지 않는다.
							//default 값을 넣을 때는 "0"으로 넣는 편
		System.out.println(s);
		//Set.add(): return boolean, 값이 없어서 잘 들어가면 true, 값이 있어서 안들어가면 false
					//값이 몇번 들어갔는지 알아보려면 false의 횟수를 if문으로 사용해서 체크하면 됨
		s.add("apple");
		boolean result = s.add("orange");
		//값이 안들어 갔다.		
		System.out.println(result);
		result = s.add("cat");
		//값이 잘 들어갔다.
		System.out.println(result);
		System.out.println(s);
		
		//Sst.clear() : 셋안에 들어 있는 모든 자료를 소거
		//s.clear();
		System.out.println(s);
		
		//Set은 순서가 없기 때문에 index에 해당하는 값을 참조할 수 없다. int i이 무용지물이다.
		//Set을 출력하는 방법
		//1. 배열로 변경해서 for문으로 출력하는 방법
		String[] arr=new String[s.size()];			//Set과 동일한 크기의 배열 생성
		s.toArray(arr);								//만들어진 배열에 set을 변환하여 저장
		for(int i = 0 ; i < arr.length; i++) {		//일반 배열을 for문으로 출력
			System.out.println(arr[i]);
		}
		System.out.println("================================");
		
		//2. List타입으로 변경해서 출력하는 방법
		List<String> L=new ArrayList<String>(s);	//Set과 동일한 내용을 갖은 List 생성
		System.out.println(s);
		for(int i=0; i<s.size(); i++) {
			System.out.println(L.get(i));
		}
		System.out.println("================================");
		
		//3. 향상된 for문을 사용하면 변환없이 사용 가능
		for(String str:s) {
			System.out.println(str);
		}
		System.out.println("================================");
		
		//4. iterator를 이용하는 방법
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("================================");
		
		//위쪽방식, 특히 향상된 for사용방법이 잘 숙지 된 후에 나중에 공부 다하고 볼것!!!
		//5. Set이 가지고 있는 forEach를 사용하는 방법
		//forEach(Consumer c) : Consumer 인터페이스를 구현한 객체를 매게변수로 사용하는 방법
		s.forEach(new Consumer<String>() {
			public void accept(String t) {
				System.out.println(t);
			}
		});
		System.out.println("================================");
		//동일한 방법 람다식으로 사용함
		s.forEach((str)->{System.out.println(str);});
		
		
		//////////////////////////////
		//LinkedHashSet : Set인데 링크로 연결되어 있어 순서가 생김, 중복은 제거를 할 수 있는 편리함
			//데이터의 입력순서를 기억하면서도 중복되는 데이터의 입력을 방지해야되는 경우 사용
		LinkedHashSet LHS = new LinkedHashSet();
		LHS.add(1);
		LHS.add(499);
		LHS.add(49);
		LHS.add(5);
		LHS.add(9000);
		LHS.add(5);
		System.out.println(LHS);
	}
}
