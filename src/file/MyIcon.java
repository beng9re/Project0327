package file;

import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;

/*
 * ������ ������ ũ�⸦ �����ϸ� �ڵ尡 �����ϹǷ�,������ ���� ���ɼ��� �����صΰ� ������ �������̹����� �������� ��������
 * 
 * */
public class MyIcon  extends ImageIcon{
	
	
	public MyIcon(URL url,int w,int h) {
	
		super(url);
		
		Image sc=this.getImage();
		
		//ũ�⸦ �� �������� ���������
		Image result=sc.getScaledInstance(w, h, Image.SCALE_SMOOTH);
		this.setImage(result);
		
		// TODO Auto-generated constructor stub
	}
	
}
