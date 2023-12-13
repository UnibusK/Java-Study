package label;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import jave.awt.event.*;

public class Sample06 {
	public static void main(String[] args) {
		new Test();
	}
}

//Container : Component를 담을 수 있는 요소로 add 메서드를 이용해서 Component를 표현할 수 있다.
//Component : 버튼 등 배치되는 요소로 Container에 add되어야 화면에 표시된다.
//Panel : Container이자 Component로 동시에 사용 가능한 요소
class Test extends Frame{
	Test() {
		//화면의 구성 기본 모양은 한번만 지정해주면 바꿀 필요가 없으므로
		//단한번 무조건 실행되는 생성자에 넣어서 구현하면 편리하다.
		setTitle("Label");	//제목
		
		Label L=new Label("first");
		L.setBounds(50,100,100,30);
		add(L);
		
		Label L2 = new Label("second");
		L2.setBounds(50,150,100,30);
		add(L2);
		
		Button btn=new Button("Click!!!");
		btn.setBounds(50,200,100,30);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String data=L.getText();
				//System.out.println(data);
				//L.setText("IOT Welcome! Welcome!");
				String L2D=L2.getText();
				String L1D=L.getText();
				L.setText(L2D);
				L2.setText(L1D);
				System.out.println("두 위치 값이 바뀌었음");
			}
		});
		add(btn);
		
		
		setSize(400,400);	//창 크기
		setLayout(null);	//화면배치 규칙을 무규칙으로
		setVisible(true); 	//창이 보이도록
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
				System.out.println("종료버튼 눌렸음");
			}
		});
	}
}