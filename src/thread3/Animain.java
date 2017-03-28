package thread3;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Paint;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Animain extends JFrame implements Runnable{
	//개발자가 쓰레드를 상속하여 개발 할수 있으나 
	//이미 다른클래스의 자식일 경우, 상속은 불가하다 ,이럴때 사용할 수 있는 객체가 바로
	//Runable 인터페이스이다
	JButton bt;
	Canvas can;
	int x;
	int y;
	Thread thread;
	
	

	public Animain() {
		// TODO Auto-generated constructor stub
		//Runnable인 객체를 인수로 넘긴다 그러면 run메서드의 호출은
		//runnable을 재정의한 객체의 run을 호출한다
	
		thread=new Thread(this);
		
		bt=new JButton("물체이동");
		add(bt,BorderLayout.NORTH);
		bt.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
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
	
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	
			// TODO Auto-generated method stub
			
			while (true) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				move();
				
			}
		
	}
	public static void main(String[] args) {
		new Animain();
	}
}
