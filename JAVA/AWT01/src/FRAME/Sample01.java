package FRAME;

import java.awt.*;
import java.awt.event.*;

public class Sample01 {
	public static void main(String[] args) {
		new TestFrame();
	}
}

class TestFrame extends Frame {
	//기본화면은 보이지 않는 것이 원칙, X를 눌러도 꺼지지 않는 것이 원칙
	TestFrame() {
		//객체가 조립될 때 무조건 단 한번 실행된다. 크기나 배치조건, 눈에 보일지 여부, 제목 등
		//utf-8에서 한글이 깨질 수 있음. MS949타입에서 정상동작
		
		//기본화면의 권장사항
		super("Title"); //setTitle(String)로 대체가능, 제목을 입력해주는 부분
		//TestEvent TE = new TestEvent();
		Button b = new Button("click");
		b.setBounds(100,40,100,60); //요소에 등장 위치와 크기 지정(x좌표, y좌표, 너비, 높이)
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("클릭시 나오는 내용"); //가상으로 클래스가 있다고 가정하고 만드는 메서드
			}
		});
		//Component.addActionListener() : 특정 요소에 동작을 인식할 수 있는 기능 부여
		add(b);
	
		
		Button a = new Button("click_Two");
		a.setBounds(100,150,100,60);
		a.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("두번째 클릭");
			}
		});
		add(a);
		
		
		setSize(300,500); //가로, 세로, 크기 지정(단위, 픽셀)
		setLayout(null); //화면 배치 규칙, 배치규칙은 모든 배치에 우선하므로 무규칙권장
		setVisible(true); //화면 눈에 보일지 여부
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				// dispose(); 지금 켜져있는 창 끄기
				System.exit(0); //모든 프로그램 종료
			}
		});
	}
}

//
//var btn=document.getElementById("btn");
//btn.addEventlistner("click", function() {
//	console.log("동작확인");
//});

//class TestEvent implements ActionListener{
//	public void actionPerformed(ActionEvent e) {
//		System.out.println("클릭확인!");
//	}
//}