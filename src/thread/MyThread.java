
//���� �����ϰ� ���� �ڵ�� �����ڰ� �����ؾ� �ϱ� ������ �����带 ������ �ؾ��Ѵ�.
package thread;

public class MyThread extends Thread{
	
	//�����ڴ� ���������� �����ϰ� ���� �ڵ带 �������� 
	//run �޼��� �ȿ� �ۼ��ϸ� �ȴ�
	@Override
	public void run() {
		 
		
		while(true){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("�ڡڡڡ�");
			
		}
			
		 
	 }
	
}
