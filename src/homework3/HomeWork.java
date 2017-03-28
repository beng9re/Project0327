package homework3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

import org.omg.Messaging.SyncScopeHelper;

public class HomeWork extends JFrame implements Runnable{
	
	JProgressBar bar;
	JButton bt_open,bt_save,bt_capy;
	JTextField tf_open,tf_save;
	JLabel lb1;
	JFileChooser choser;
	FileInputStream fis;
	FileOutputStream fos;
	Thread tf;
	public HomeWork() {
	  bar=new JProgressBar();
	  bar.setForeground(Color.YELLOW);
	  bt_open=new JButton("열기");
	  bt_save=new JButton("저장");
	  bt_capy=new JButton("복사하기");
	  lb1=new JLabel("0%");
	  
	  lb1.setFont(new Font("고딕", Font.BOLD, 20));
	  
	  tf_open=new JTextField(20);
	  tf_save=new JTextField(20);
	  choser=new JFileChooser();
	  
	  bar.setPreferredSize(new Dimension(290, 50));
	  //bt_open.setPreferredSize(new Dimension(70, 25));
	  add(bar);
	  add(lb1);
	  add(bt_open);
	  add(tf_open);
	  add(bt_save);
	  add(tf_save);
	  add(bt_capy);
	  
	  setLayout(new FlowLayout());
		
	  bt_open.addActionListener(new ActionListener(){
		 
		  
		 public void actionPerformed(ActionEvent e) {
			choser.showOpenDialog(HomeWork.this);
			String path=choser.getSelectedFile().getPath();
			tf_open.setText(path);
			
		}
	});
	  bt_save.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			choser.showSaveDialog(HomeWork.this);
			File a =choser.getCurrentDirectory();
			String name=choser.getSelectedFile().getName();
			String path=a.getAbsolutePath();
			
			tf_save.setText(path+"/"+name);
			
		}
	});
	  bt_capy.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			
			
			
			
			try {
				 fis=new FileInputStream(tf_open.getText());
				 fos=new FileOutputStream(tf_save.getText());
				tf =new Thread(HomeWork.this);
				tf.start();
					
					while(true){
							int a=fis.read();	
							if(a==-1)break;
						
							fos.write(a);
						}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}finally {
				
						try {
							if(fis!=null)fis.close();
							if(fos!=null)fos.close();
						

						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
				
			}
			
		}
	});
		
		
		
		setVisible(true);
		setSize(370, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// TODO Auto-generated constructor stub
	}
	
	public void move(){
		bar.setValue(bar.getValue()+2);
		lb1.setText(Integer.toString(bar.getValue())+"%");
		if(bar.getValue()==100){
			JOptionPane.showMessageDialog(HomeWork.this,"복사완료");
			tf.stop();
			return;
		}
			
	}
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			move();
		}
		
	}
	
	public static void main(String[] args) {
		new HomeWork();
	}


	

}
