package file;

import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;

/*
 * 아이콘 생성시 크기를 조정하면 코드가 복잡하므로,앞으로 재사용 가능성을 염두해두고 나만의 재조정이미지를 아이콘을 새로정의
 * 
 * */
public class MyIcon  extends ImageIcon{
	
	
	public MyIcon(URL url,int w,int h) {
	
		super(url);
		
		Image sc=this.getImage();
		
		//크기를 재 조정한후 결과적으로
		Image result=sc.getScaledInstance(w, h, Image.SCALE_SMOOTH);
		this.setImage(result);
		
		// TODO Auto-generated constructor stub
	}
	
}
