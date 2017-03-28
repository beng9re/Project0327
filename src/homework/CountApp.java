package homework;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CountApp extends JFrame{

	
	JLabel lb;
	JLabel lb2;
	
		
	
	public CountApp() {
		// TODO Auto-generated constructor stub
		lb=new JLabel("0");
		lb2=new JLabel("0");
		
		lb.setPreferredSize(new Dimension(200, 200));
		lb2.setPreferredSize(new Dimension(200, 200));

		
		lb.setFont(new Font("°íµñ",Font.BOLD,20));
		lb2.setFont(new Font("°íµñ",Font.BOLD,20));
		
		add(lb);
		add(lb2);
		setLayout(new FlowLayout());
		
		Counttread t1 =new Counttread(lb, 500,"Ã¹¹øÂ°:");
		Counttread t2 =new Counttread(lb2, 1000,"µÎ¹øÂ°:");
		t1.start();
		t2.start();
		
		setVisible(true);
		setSize(700,700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CountApp();

	}

}
