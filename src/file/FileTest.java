package file;

import java.io.File;

import javax.swing.JButton;

/*
 �ڹٿ����� ���丮�� �����ϱ� ���� Ŭ������ ������ ���������ʰ�,
 ���丮�� ���Ϸΰ��� 
 ��� java.io.FileŬ������ ����+���丮���� ó���Ѵ�.
 *
 */


public class FileTest {
	

	
	public FileTest() {
		// TODO Auto-generated constructor stub
	
	
	
	
	}
	
	
	
	
	public static void main(String[] args) {
			//C����̺��� �Ͽ��ӿ� �����ϴ� ��� ���丮��
		//������ ����غ���
		File file=new File("C:/");
		File[] dir=file.listFiles();
		for (int i = 0; i < dir.length; i++) {
			//���� ���丮 �� ������ ��� ��������

			if(dir[i].isDirectory())
			System.out.println(dir[i].getName());
		}
		
				
	}

}
