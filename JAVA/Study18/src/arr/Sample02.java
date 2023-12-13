package arr;

public class Sample02 {
	public static void main(String[] args) {
		//배열 하나의 변수에 여러개의 데이터를 담는 방법
		Student[] a;
		a=new Student[5];
		a[0]=new Student(1, "김우주");
		a[4]=new Student(2, "박대박");
		a[2]=new Student(3, "이학생");
		a[3]=new Student(4, "윤찬");
		a[1]=new Student(5, "선우이범");
		System.out.println(a[0].name);
//		a[0].speak();
//		a[1].speak();
//		a[2].speak();
//		a[3].speak();
//		a[4].speak();
//		
		//리턴타입이 없는 경우 (void 메서드)
		int i;
		for(i=0;i<a.length;i++) {
			a[i].speak();
		}//for end.
		
		// 리턴타입이 있는경우
		for(i=0;i<a.length;i++) {
			System.out.println(a[i].speak2());
		}//for string 반복 end.
		
	}//main end.
}//class end.

class Student{
	int number;
	String name;
	
	Student(int x, String y){
		number=x;
		name=y;
		System.out.println("이름:"+y+", 	학번:"+ x + " 학생이 생성되었습니다.");
	}//student end.
	
	void speak() {
		System.out.println(number+"번 학생인 " + name +" 입니다.");
	}//메서드 end.
	
	String speak2() {
		return number+"번 학생인 " + name +" 입니다.";
	}//String 타입 end.
}//Student class end.