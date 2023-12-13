package Paper01;

public class LV12 {
	public static void main(String[] args) {
		ㅇ.run();
	}
}

class outer{
	int number;
	String msg;
	outer(middle m){
		number=m.number;
		msg=m.str;
	}
	void run() {
		for(int i=0; i<number; i++) {
			System.out.println(msg);
		}
	}
}

class middle{
	String str;
	int number;
	middle(inner i, String s){
		if(i.bool) {
			str=s;
			number=i.number;
		}
	}
}
class inner{
	boolean bool;
	int number;
	inner(boolean b, int a) {
		bool=b;
		number=a;
	}
}