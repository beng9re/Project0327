package thread;
//������ ������ ��� �ɾ�����
public class MoveThread  extends Thread{
	//�����ڴ� ���� ������ �ڵ带 run�� ����
	//JVM�� rum�� �˾Ƽ� ȣ�����ش�.
	
	Animain animain;
	
	public MoveThread(Animain animain) {
		// TODO Auto-generated constructor stub
		this.animain=animain;
	}
	
	
	public void run() {
		

		
		// TODO Auto-generated method stub
		while(true){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			animain.move();
		}
	}
}
