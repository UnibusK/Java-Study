package trycatch;

import java.util.InputMismatchException.*;
import java.util.*;

public class Sample02 {
	public static void main(String[] args) {
		/*
	  	int[] arr = new int[3];
		arr[0] = 0;
		arr[1] = 10;
		arr[2] = 20;
		try {
			for(int i =0; i<4; i++) { //arr.length를 상수로 변경했을때 오류가 발생하고 프로그램이 정지함, 오류가 발생하는 위치에 try-catch
				System.out.println("배열 내부 데이터 확인중");
				System.out.println(arr[i]);
				System.out.println("배열 내부 데이터 "+(i+1)+"번째 확인 완료..");
			}
		}catch(Exception e) {
			System.out.println("배열 내부 확인 중 오류 발생");
		}
		System.out.println("배열내용 확인 완료! 다음내용을 수행합니다.");
		
		*/
		
		Scanner sc = new Scanner(System.in);
		int[] array = new int[2];
		System.out.println("숫자를 입력해주세요");
		int i;	
		try {
			array[1]=70;	// 오류가 나게 배열의 번호를 바꿔보기
			i = sc.nextInt();
		} catch(InputMismatchException e) {
			System.out.println("입력데이터가 맞지 않으면 여기가 수행");
			System.out.println(e);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 크기를 벗어나면 어기가 수행");
		}
	    System.out.println("예외가 발생되어도 프로그램은 수행됩니다. ");
	}
}
