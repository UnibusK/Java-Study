package test;

public class Sample {
	public String name="홍길동";
	public int age=19;
	public String address="서울시 도봉구";
	public String tag;
	
	public String make(int a, int b) {
		String table="<table>";
		for(int i =0; i<a; i++) {
			table+="<tr>";
			for(int k=0; k<b; k++) {
				table+="<td>";
				table+="<td style='border:1px solid gray;'>";
				table+=(i+1)+", "+(k+1);
				table+="</td>";
			}
			table+="</tr>";
		}
		table+="</table>";
		return table;
	}
	
	public Sample(String nm, int a, int b) {
		name=nm;
		tag=make(a, b);
	}
}
