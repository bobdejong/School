package sec18.ex01_thread;

class DerivedThread2 extends Thread{
	public void run() {
		for(int i=0;i<50;i++) {
			System.out.print(i+"\t");
		}
		
	}
	
}

public class DerivedThreadMain2 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		DerivedThread2 d1=new DerivedThread2();
		DerivedThread2 d2=new DerivedThread2();
		d1.start();
		d2.start();
		System.out.println("프로그램 종료");

	}

}
