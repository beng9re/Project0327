package thread;

/*OS�� ���� ���μ������� ���ÿ� ����ϸ鼭 ������ �� �ֵ�,(multi-tasking),�ϳ��� �ڹ�
���α׷� ������ ������ ���� ������ ����� ���ÿ� �����ų���ִ�
�̷��Ѽ��������� ������ ������� �Ѵ�

�ڹٴ� �����ڰ� ���� �����ʾƵ� �̹� �⺻������ ���� �Ǵ� ����� �����尡 ������ 
�̷��� �����带 ������ ���ξ����� ��� �Ѵ� �� �ڹٴ� ������ ����̴�
*
*
*/



public class ThreadTest {
	//���� ������ ����, �����ڰ� ���ϴ� ��������� ������ �ϳ����� ���ϴ� ����
	//�۾��� ���Ѻ���
	MyThread thread;
	
	public ThreadTest() {
		// TODO Auto-generated constructor stub
		
		//���ξ�����ʹ� ���������� ����ɼ� �ִ� ���ν��� ������ ������
		//�����尡 ����� ������ �����ڰ� �����ؾ� �ϱ� ������//
		
		thread=new MyThread(); 
		thread.start();
		//thread.run() ������ �Ϲݸ޼��� ����
		
		while(true){
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("�١١١١١�");
		}
		
	}
	
	
	public static void main(String[] args) {
		new ThreadTest();

	}

}
