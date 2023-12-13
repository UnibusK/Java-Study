package btn;

import java.awt.*;
import java.awt.event.*;

public class Sample07 {
	public static void main(String[] args) {
		new Test();
	}
}

class Test extends Frame{
	Test() {
		super("button");
		
		TextField tf1=new TextField();
		tf1.setBounds(50,50,150,20);
		add(tf1);
		
		TextField tf2=new TextField();
		tf2.setBounds(50,100,150,20);
		add(tf2);
		
		TextField tf3=new TextField();
		tf3.setBounds(50,150,150,20);
		add(tf3);
		
		Button b1=new Button("+");
		Button b2=new Button("-");
		b1.setBounds(50,200,50,50);
		b2.setBounds(120,200,50,50);
		ActionListener AL;
		AL = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data=tf1.getText();
				//System.out.println(data);
				//System.out.println(e.getActionCommand()); 	//버튼 이름이 같을때는 구별을 할수가없음
				//System.out.println(e.getSource());			//버튼의 정확한 구별을 할 수 있음
				String n1 = tf1.getText();
				String n2 = tf2.getText();
				int num1=Integer.parseInt(n1);
				int num2=Integer.parseInt(n2);
				
				if(e.getSource()==b1){
					System.out.println(num1+num2+" : 덧셈 결과입니다.");
					tf3.setText(""+(num1+num2));
				} else if (e.getSource()==b2) {
					System.out.println(num1-num2+" : 뺄셈 결과입니다.");
					tf3.setText(num1-num2+"");
				}
				
				
			}
		};
		
		b1.addActionListener(AL);
		b2.addActionListener(AL);
		add(b1);
		add(b2);
		
		
		TextArea ta = new TextArea();
		ta.setBounds(50,280,300,100);
		add(ta);
		
		Checkbox cb=new Checkbox("Java");
		cb.setBounds(220,50,50,10);
		add(cb);
		
		setSize(400,400);
		setLayout(null);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
	}
}
