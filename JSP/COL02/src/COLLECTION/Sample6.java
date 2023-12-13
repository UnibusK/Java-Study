package COLLECTION;

import java.util.*;

public class Sample6 {
	public static void main(String[] args) {
		ArrayList<Student> AL=new ArrayList<Student>();
		Student s1=new Student(100, "김우주", 20);
		AL.add(s1);
		// AL에 추가 같은 방법
		AL.add(new Student(200, "윤찬", 40));
		AL.add(new Student(300, "김똥깨", 30));
		System.out.println(AL);
		
//		for(int i = 0 ; i<=AL.size(); i++) {
//			System.out.println(AL.get(i));
//		}
		
		//향상된 for문으로 출력해보자
		for(Student SD:AL) {
			System.out.println(SD);
		}
		
		// Object이기 때문에 sort의 기준이 아니기 때문에 작동을 할수 없다.
		Collections.sort(AL);
	}
}


class Student implements Comparable{
	int number;
	String name;
	int age;
	Student(int a, String b, int c){
		number=a;
		name=b;
		age=c;
	}
	public String toString() {
		return "학번 : " + number +" 이름 : "+name+ " 나이 : "+age;
	}

	@Override
	public int compareTo(Object o) {
		int cage=((Student)o).age;
		return this.age-cage;
		//리턴값이 0이라는 건 두 값이 서로 같다.
		//리턴값이 0보다 크면 비교전 값이 비교 후 보다 크다.
		//리턴값이 0보다 작으면 비교전 값이 비교 후 보다 작다.
	}
	
	//공부할때는 temp변수를 잡은 다음에 if문으로 비교하고, 잘 된다면 아래 방법을 사용해 볼것!
	//Collections.srot(AL, Student.ageComp);
	//기준점 별로 정렬 처리가 가능하다.
	public static Comparator<Student> ageComp=new Comparator<Student>() {
		public int compare(Student o1, Student o2) {
			int age1=o1.age;
			int age2=o2.age;
			return age1-age2;
		}
	};
}