package Paper01;

public class LV11 {
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		Student s4=new Student();
		Student s5=new Student();

		s1.number=22; s1.name="홍길동";
		s2.number=19; s2.name="이순신";
		s3.number=61; s3.name="김세홍";
		s4.number=13; s4.name="박혁거세";
		s5.number=77; s5.name="왕건";
		

// 문제풀이
		Student[] a;
		a= new Student[5];
//		a[0]=(s1);
//		a[1]=(s2);
//		a[2]=(s3);
//		a[3]=(s4);
//		a[4]=(s5);
		int i;
		for(i=1; i<5; i++) {
			System.out.println(a[i]);
		} // for end.		
	}//main 종료
}//class 종료


class Student{
	int number;
	String name;
	
}//class종료
