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
	//�����ڰ� �����带 ����Ͽ� ���� �Ҽ� ������ 
	//�̹� �ٸ�Ŭ������ �ڽ��� ���, ����� �Ұ��ϴ� ,�̷��� ����� �� �ִ� ��ü�� �ٷ�
	//Runable �������̽��̴�
	JButton bt;
	Canvas can;
	int x;
	int y;
	Thread thread;
	
	

	public Animain() {
		// TODO Auto-generated constructor stub
		//Runnable�� ��ü�� �μ��� �ѱ�� �׷��� run�޼����� ȣ����
		//runnable�� �������� ��ü�� run�� ȣ���Ѵ�
	
		thread=new Thread(this);
		
		bt=new JButton("��ü�̵�");
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
