package input;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.*; //* 클래스를 모두 가져와

public class Sample01 {
	public static void main (String [] args) throws IOException {
		//외부 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("성함을 입력해주세요");
		String name;
		name=br.readLine();
		System.out.println("입력받은 내용 : "+name);
	}
}