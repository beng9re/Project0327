
//원을 표현한 객체
package homework;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.RepaintManager;

public class CirCleThread extends ShapeThread{
	
	
	
	
	public CirCleThread(Graphics g,int x,int y,int width,int height,int interval){
		// TODO Auto-generated constructor stub
		super(g,x,y,width,height,interval);

		start();
	}

	@Override
	public void render() {
		// TODO Auto-generated method stub
		g.setColor(Color.yellow);
		g.fillRect(0, 0, 700, 700);
		
		g.setColor(Color.black);
		g.drawOval(x, y, width, height);
		x+=5;
		
	}
	
	
	
	
		
}
