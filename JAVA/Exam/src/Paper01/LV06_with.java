package Paper01;

public class LV06_with {
	public static void main(String[] args ) {
		int a;
		int b;
		for (b=0; b<10; b++) {
			for(a=2; a<10; a++) {
				if(b==0) {
					System.out.print("<<"+a+">>단	"); 
				} else {
					System.out.print(a+"*"+b+"="+a*b+"\t");
				}
			}
			System.out.println();
		}
	}//main end.
}//class end.
