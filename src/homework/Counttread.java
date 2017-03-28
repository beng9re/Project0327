package homework;

import javax.swing.JLabel;

public class Counttread extends Thread {

	JLabel lb1;
	int interver;
	int i;
	String name;
	
	public Counttread(JLabel lb1,int interver,String name) {
		this.lb1=lb1;
		this.interver=interver;
		this.name=name;
		
		
		// TODO Auto-generated constructor stub
	 
	
	}
	public void count(){
		i++;
		lb1.setText(name+Integer.toString(i));
		
	
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			try {
				Thread.sleep(interver);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			count();
			
		}
	}
	
	
}
