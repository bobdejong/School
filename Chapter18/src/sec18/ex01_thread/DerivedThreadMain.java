package sec18.ex01_thread;

class DerivedThread extends Thread{
	public void run() {
		for(int i=0;i<50;i++) {
			System.out.print(i+"\t");
		}
		
	}
	
}


public class DerivedThreadMain {

	public static void main(String[] args) {
		System.out.println("���α׷� ����");
		Thread thread=new DerivedThread();
		thread.start();
		System.out.println("���α׷� ����");

	}

}
