package thread;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AniTest extends JFrame {
	JButton bt;
	JPanel pan;
	int x,y;
	
	
	
	public AniTest() {
		// TODO Auto-generated constructor stub
		
		bt=new JButton("물체이동");
		add(bt,BorderLayout.NORTH);
		pan=new JPanel();
		add(pan);
		bt.addActionListener(new ActionListener(){
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				MyAniThread a2 =new MyAniThread(AniTest.this, 1, 20, 20);
				
				MyAniThread a =new MyAniThread(AniTest.this, 0, 20, 20);				
			
			}
		});
	
		
		setVisible(true);
		setSize(700, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	
	}
	
	public static void main(String[] args) {
		new AniTest();
	}
}
