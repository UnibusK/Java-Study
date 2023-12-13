package str;

import java.io.*;
import java.util.*;

public class Sample04 {
	public static void main(String[] args) throws IOException {
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("문자열을 입력해주세요.");
		String msg=br.readLine() ;
		System.out.println(msg);
		*/
		
		//Scanner sc = new Scanner(System.in);
		//String data=sc.next();
		
		StringBuffer sb = new StringBuffer("기본값"); 	//출력 : 기본값
		sb.append("추가데이터");							//출력 : 기본값추가데이터
		sb.deleteCharAt(3);								//출력 : 기본값가데이터 (추 단어 삭제)
		sb.insert(5, "반값습니다.");						//출력 : 기본값가데반값습니다.이터
		sb.replace(3,8,"교체");							//출력 : 기본값교체니다.이터
		sb.reverse();									//출력 : 터이.다니체교값본기
		int  size = sb.length();
		System.out.println(sb);
	}
}

//StringBuffer : 글자를 추가하거나 더해도 원본을 유지해주는 데이터
//문자열에 값을 더하거나 빼기 편리하게 고현된 String 객체
//StringBuffer.append(String) : 문자열 뒤에 다른 문자열을 추가 void
//StringBuffer.deleteCharAt(int) : 해당순번의 문자열을 제거
//StringBuffer.insert(int, String) : 해당 순번에 해당 문자열을 추가
//StringBuffer.legnth() : 현재 버퍼 내부에 존재하는 문자열을 반환 return int
//StringBuffer.replace(int, int, String) : 해당 순번의 문자열을 교체 
//StringBuffer.reverse() : 해당 문자열을 거꾸로 변환