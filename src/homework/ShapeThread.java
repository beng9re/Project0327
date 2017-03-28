package homework;

import java.awt.Color;
import java.awt.Graphics;

/*
 * 
 * ���̴�,�簢���̴�, � ������ ǥ���� ��ü �̴�
 * ��� ��Ŭ������ �ڽ����� ���� 
 * ��?? ������ Ư¡�� �����Ƿ�
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
