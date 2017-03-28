/*
 * 	 서로다른 그래픽,속도,기타값을 갖는 물체를 움직이게하자
 * 
 * */

package homework;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MultAni extends JFrame {
	JButton bt;
	Canvas can;
	CirCleThread ct;
	Graphics gp;
	public MultAni(){
		bt=new JButton("각자움직이기");
		can=new Canvas(){
			@Override
			public void paint(Graphics g) {
				// TODO Auto-generated method stub
				//gp=g;
			}
		};
		
	
		can.setBackground(Color.YELLOW);
		add(bt,BorderLayout.NORTH);
		bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Graphics g=can.getGraphics();
				ct=new CirCleThread(g, 0,0, 50, 50, 100);
				RectThread rt=new RectThread(g, 0, 50, 50, 50, 20);
				rt.start();
				ct.start();
			}
		});
		add(can);
		
		setSize(700, 700);
		
		setSize(700, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	
	}

	public static void main(String[] args) {
		new MultAni();
	}
	

}
