package thread;
//움직임 로직을 담게 될쓰레드
public class MoveThread  extends Thread{
	//개발자는 독립 실행할 코드를 run에 기재
	//JVM이 rum을 알아서 호출해준다.
	
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
