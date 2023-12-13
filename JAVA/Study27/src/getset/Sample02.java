package getset;

public class Sample02 {
	public static void main(String [] args) {
		
	}
}

class Student {
	private int number;		//학번
	private String name;	//이름
	//get, set 빈공간 우클릭 > source > Generate Getter and Setter 클릭 > 필드 선택 > Generate 클릭 
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toStirng() {
		return "이름 : "+name+ "\t 학번 : " +number;
	}
}