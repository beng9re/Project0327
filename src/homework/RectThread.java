package homework;

import java.awt.Color;
import java.awt.Graphics;

public class RectThread extends ShapeThread{
	
	public RectThread(Graphics g,int x,int y,int width,int height,int interval) {
		// TODO Auto-generated constructor stub
		super(g,x,y,width,height,interval);
	
	
	}
	@Override
	public void render() {
		// TODO Auto-generated method stub
		g.setColor(Color.YELLOW);
		
		g.fillRect(0, 0, 700, 700);
		
		g.setColor(Color.black);
		g.drawRect(x, y,width,height);
		x=x+2;
		
	}

}
