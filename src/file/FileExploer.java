package file;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.io.File;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class FileExploer extends JFrame {
	
	
	
	
	File[] dir;
	File file;
	
	ArrayList<Dir> d;
	Dir dira;
	int size;
	
	public FileExploer() {
		// TODO Auto-generated constructor stub
		
		d=new ArrayList<Dir>();
		setLayout(new FlowLayout());
		
		
		
		
		addfile();
		
		
		
		
		
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void addfile(){
		file=new File("C:/");
		dir=file.listFiles();
		
		
		for (int i = 0; i < dir.length; i++) {
			//하위 디렉토리 및 파일을 목록 추출하자
				
			if(dir[i].isDirectory()){
				d.add(new Dir(this,dir[i].getName()));
				//this.size++;	
			}
		
		} 
	
	}
	


	public static void main(String[] args) {
		new FileExploer();
	}

}
