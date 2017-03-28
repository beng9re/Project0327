package thread;

import java.awt.Canvas;
import java.awt.Graphics;

import javax.swing.JPanel;

//움직임 로직을 담게 될쓰레드
public class MyAniThread  extends Thread{
	//개발자는 독립 실행할 코드를 run에 기재
	//JVM이 rum을 알아서 호출해준다.
	
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
