package thread;

import java.awt.Canvas;
import java.awt.Graphics;

import javax.swing.JPanel;

//������ ������ ��� �ɾ�����
public class MyAniThread  extends Thread{
	//�����ڴ� ���� ������ �ڵ带 run�� ����
	//JVM�� rum�� �˾Ƽ� ȣ�����ش�.
	
	AniTest animain;
	JPanel pa;
	Canvas can;
	int x,y;
	int speed;
	

	public MyAniThread(AniTest animain,int type,int x,int y) {
		// TODO Auto-generated constructor stub
		this.animain=animain;
		this.x=x;
		this.y=y;
		pa=new JPanel();
		if(type==0){
			drowCan();
		}
		else{
			drowRect();
			
		}
		this.animain.pan.add(pa);
	
		
	}
	
	public void drowCan(){
		
		can =new Canvas(){
			@Override
			public void paint(Graphics g) {
				// TODO Auto-generated method stub
				g.drawOval(x, y, 50, 50);
				animain.repaint();
			}
		};
		pa.add(can);
	
	}
	public void drowRect(){
		can =new Canvas(){
			@Override
			public void paint(Graphics g) {
				// TODO Auto-generated method stub
				g.drawRect(x, y, 50, 50);
				animain.repaint();
			}
		};
		pa.add(can);
	
	}
		public void move(){
		x+=speed;
	}
	
	public void run() {
		
		
		// TODO Auto-generated method stub
		while(true){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				move();
		}
	}
}
