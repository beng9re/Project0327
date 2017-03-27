package file;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Dir extends JPanel implements ActionListener{
	JButton bt1;
	MyIcon open,close;
	FileExploer a;
	//패널이 버튼을가지고있음
	
	public Dir(FileExploer a,String name) {
			this.a=a;
			//이미지 아이콘을 생성하되,리소스폴도러부터 
			//URL url=this.getClass().getResource("folder_on.png");
			close=new MyIcon(this.getClass().getResource("/folder_on.png"),50,50); 
			open=new MyIcon(this.getClass().getResource("/folder_off.png"),50,50); 
			
			Image sc=open.getImage();
			
			//크기를 재 조정한후 결과적으로
			//Image result=sc.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
			//open.setImage(result);
			
			
			bt1 =new JButton(close);
			bt1.addActionListener(this);
			
			bt1.setBorderPainted(false);
			bt1.setContentAreaFilled(false);
			bt1.setFocusPainted(false);
			bt1.setOpaque(false);
		 	JLabel lb1=new JLabel(name);
		 	setLayout(new BorderLayout());
		 	add(bt1);
		 	add(lb1,BorderLayout.NORTH);
		 	this.a.add(this);
		 	bt1.setSize(400,400);
		 	
		 	
		 // TODO Auto-generated constructor stub
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < a.d.size(); i++) {
			if(a.d.get(i).bt1==this.bt1){
				if(this.bt1.getIcon()==open){this.bt1.setIcon(close);}	
				else{bt1.setIcon(open);
				}
					
			}
			else{
				a.d.get(i).bt1.setIcon(close);
				
			}
		}
		
	
		

		
	}
	

	

}
