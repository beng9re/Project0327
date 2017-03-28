package thread2;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Paint;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Animain extends JFrame{
	
	JButton bt;
	Canvas can;
	int x;
	int y;
	Animain aniMain;
	
	
	public Animain() {
		// TODO Auto-generated constructor stub
		aniMain=this;
		bt=new JButton("물체이동");
		add(bt,BorderLayout.NORTH);
		bt.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				MoveThread mv =new MoveThread(Animain.this);
				mv.start();
			}
		});
		can=new Canvas(){
			
			@Override
			public void paint(Graphics g) {
				// TODO Auto-generated method stub
				g.drawOval(x, y, 50, 50);
			
			
			}
			
			
		};
		can.setBackground(Color.YELLOW);
		
		add(can);
		
		setVisible(true);
		setSize(700, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	
	
	
	
	}
	public void move(){
		x+=5;
		can.repaint();
	}
	
	public Animain getAni(){
		return this;
	}
	
	
	public static void main(String[] args) {
		new Animain();
	}

}
