package data;

public class Student {
	public String name;
	public int kor;
	public int eng;
	public int math;
	
	public int sum() {
		return kor+eng+math;
	}
	
	public float avg() {
		float sum=sum();
		return sum()/3;
	}
	public String toString() {
		return name+", "+eng+", "+ math+", "+kor;				
	}
}
