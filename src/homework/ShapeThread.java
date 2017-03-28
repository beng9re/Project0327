package homework;

import java.awt.Color;
import java.awt.Graphics;

/*
 * 
 * 원이던,사각형이던, 어떤 도형을 표현한 객체 이던
 * 모두 이클래스의 자식으로 두자 
 * 왜?? 공통적 특징이 있으므로
 * 
 * */
abstract public class ShapeThread  extends Thread{
	int x;
	int y;
	int width;
	int height;
	int interval;
	Graphics g;
	
	public ShapeThread(Graphics g,int x,int y,int width,int height,int interval){
		this.g=g;
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
		this.interval=interval;
		
		
		
	}
	
	abstract public void render();
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
			while(true){
				try {
					Thread.sleep(interval);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				render();
			}
	}

}
