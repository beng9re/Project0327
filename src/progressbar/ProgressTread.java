package progressbar;

import java.awt.Dimension;

import javax.swing.JProgressBar;

public class ProgressTread extends Thread {

	
	JProgressBar bar;
	int speed;
	public ProgressTread(JProgressBar bar,int speed) {
		this.speed=speed;
		this.bar=bar;
		this.start();
		
		// TODO Auto-generated constructor stub
	}
	public void add(){
		
		bar.setValue(bar.getValue()+speed);
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	
		while(true){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			add();
		}
		
		
	}
}
