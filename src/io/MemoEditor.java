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
	InputStreamReader reader; //문자기반 입력스트림
	BufferedReader buffr; //버퍼처리된 문자기반 입력스트림;
	
	//문자기반의 출력스트릠
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
		bt_open=new JButton("열기",icon);
		bt_save=new JButton("저장");
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
			//문자기반 스트림에 문자인코딩 속성를 지정할 수있다
			
			fis=new FileInputStream(ori);
			reader=new InputStreamReader(fis,"utf-8");
			buffr=new BufferedReader(reader);
			
		String data;
		int count=0;
		while (true) {
			data=buffr.readLine(); //2바이트씩
			count++;
			if(data==null)break;
			
			 //2바이트 씩 읽어들인다
			area.append(data+"\n");
			
		}
		System.out.println(count);	
		
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();//개발자를 위한 로그정보
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
			 System.out.println("실행끝");
			
		}
		
		
	
		
	}
	public void save() {
		//파일 아웃풋스트림은 지정한경로의 파이릉 생성해버린드 크기는 0바이트는 empty빈파일
		
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
