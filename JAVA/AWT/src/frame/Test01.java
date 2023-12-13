package frame;

import java.awt.*;

public class Test01 extends Frame {
	public static void main(String[] args) {
		Test01 t=new Test01();

	}//main end.
	
	//생성자 : 1회만 무조건 객체가 조립될 때 실행
	//기본화면 세팅하는 용도로 아주 좋음
	
	//Component : 화면 내부에 배치되는 요소들
	//Container : Component를 비치할 수 있는 기반
	//Panel : 패널, Component이자 Container인 요소
	//Frame : 가장 외부에 거대한 틀
	Test01(){
		//setTitle("제목"); //제목 지정
		super("제목");
		
		Button b=new Button("Click");
		b.setBounds(100,40,100,60);
		b.setBackground(Color.yellow);
		add(b);
		
		setBackground(Color.blue);
		setSize(500,300);//화면 크기지정
		setLayout(null);//화면 배치 규칙결정
		setVisible(true);//화면이 눈에 보이도록 설정
	}//test 생성자 end.
}//class end.
