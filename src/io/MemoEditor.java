package io;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Area;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MemoEditor extends JFrame{
	
	
	JPanel p_north;
	JButton bt_open,bt_save;
	JTextArea area;
	JScrollPane scroll;
	
	ImageIcon icon;
	
	FileInputStream fis;
	InputStreamReader reader; //���ڱ�� �Է½�Ʈ��
	BufferedReader buffr; //����ó���� ���ڱ�� �Է½�Ʈ��;
	
	//���ڱ���� ��½�Ʈ��
	FileOutputStream fos;
	OutputStreamWriter writer;
	BufferedWriter buffw;
	PrintWriter writer2;
	
	
	String ori="C:/Java_workspace2/Project0327/res/memo.txt";
	String dest="C:/Java_workspace2/Project0327/res/memo222.txt";
	
	
	
	public MemoEditor() {
		// TODO Auto-generated constructor stub
		p_north=new JPanel();
		
		icon=new ImageIcon("C:/Java_workspace2/Project0327/res/folder_off.png");
		bt_open=new JButton("����",icon);
		bt_save=new JButton("����");
		area=new JTextArea();
		scroll=new JScrollPane(area);
		

		bt_open.setBorderPainted(false);
		bt_open.setContentAreaFilled(false);
		bt_open.setFocusPainted(false);
		bt_open.setOpaque(false);
	//	this.setPreferredSize(new Dimension(50, 50));
		//bt_open
		
		
		
		
		p_north.add(bt_open);
		p_north.add(bt_save);
		
		
		bt_open.addActionListener(new ActionListener() {
		
			
			
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				open();
				
				}
			} 
		);
		
		bt_save.addActionListener(new ActionListener(){
			
		
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				save();
			}
		});
		
		add(p_north,BorderLayout.NORTH);

		add(scroll);
		
		
		setSize(700, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public void open(){
		try {
			//���ڱ�� ��Ʈ���� �������ڵ� �Ӽ��� ������ ���ִ�
			
			fis=new FileInputStream(ori);
			reader=new InputStreamReader(fis,"utf-8");
			buffr=new BufferedReader(reader);
			
		String data;
		int count=0;
		while (true) {
			data=buffr.readLine(); //2����Ʈ��
			count++;
			if(data==null)break;
			
			 //2����Ʈ �� �о���δ�
			area.append(data+"\n");
			
		}
		System.out.println(count);	
		
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();//�����ڸ� ���� �α�����
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
		
			 try {
				if(reader!=null)reader.close();
				if(fis!=null)fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 System.out.println("���ೡ");
			
		}
		
		
	
		
	}
	public void save() {
		//���� �ƿ�ǲ��Ʈ���� �����Ѱ���� ���̸� �����ع����� ũ��� 0����Ʈ�� empty������
		
		try {
			fos=new FileOutputStream(dest);
			writer=new OutputStreamWriter(fos, "utf-8");
			
			writer2=new PrintWriter(fos); 
			
			//buffw=new BufferedWriter(writer);
			writer2.write(area.getText());
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
			if(writer2 !=null || fos !=null || writer!=null){
			
	
			try {
				//buffw.close();
				writer2.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
			}
		}
		
	}
	public static void main(String[] args) {
		new MemoEditor();
	}
	
	
}
