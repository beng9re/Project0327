package thread;

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
	Graphics g;
	//Thread thread;//내부 익명 스타일로 개발
	
	public Animain() {
		// TODO Auto-generated constructor stub
		
		bt=new JButton("물체이동");
		add(bt,BorderLayout.NORTH);
		bt.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				MoveThread mv=new MoveThread(Animain.this);
				mv.start();
			
			}
		});
		can=new Canvas(){
			
			@Override
			public void paint(Graphics g1) {
				// TODO Auto-generated method stub
				g=g1;
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
	public void drowDo(int x,int y,int t){
		switch (t) {
		case 1:
			g.drawOval(x, y, 50, 50);
			break;
		case 2:
			g.drawRect(x, y, 50, 50);
			break;
		case 3:
				
		break;		
		default:
			break;
		}
	}
		
	
	public static void main(String[] args) {
		new Animain();
	}

}
