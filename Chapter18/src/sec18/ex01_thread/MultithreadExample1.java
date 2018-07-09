package sec18.ex01_thread;

//스레드(thread):프로그램 실행 흐름
//하나의 프로그램내에서 독립적으로 실행되는 메서드

public class MultithreadExample1 {

	public static void main(String[] args) {
		Thread thread=new DigitThread(); 
		thread.start();
		for(char ch='A';ch<'Z';ch++) {
			System.out.print(ch);
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		}
	}

}

class DigitThread extends Thread{
	public void run() {
		for(int cnt=0;cnt<10;cnt++) {
		System.out.print(cnt);
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		}
		}
	
}
