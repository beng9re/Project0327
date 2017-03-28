package progressbar;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class ProgressBarTest extends JFrame{
	JProgressBar[] bar=new JProgressBar[3];
	

	JButton bt;
	int x=0;
	
	public ProgressBarTest() {
		// TODO Auto-generated constructor stub
		bt=new JButton("Ω√¿€");
		
		
		
	
		for (int i = 0; i < bar.length; i++) {
					
			bar[i]=new JProgressBar();
			bar[i].setPreferredSize(new Dimension(400, 40));
			bar[i].setForeground(Color.BLUE);
			add(bar[i]);
	}
		
	
		
		
		
	
		add(bt);
		
		
		
		
		bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ProgressTread t1=new ProgressTread(bar[0],4);
				ProgressTread t2=new ProgressTread(bar[1],5);
				ProgressTread t3=new ProgressTread(bar[2],6);
			
			}
		});
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(450, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ProgressBarTest();
	}

}
