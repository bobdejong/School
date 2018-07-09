package sec18.ex01_thread;

class DigitThread3 extends Thread{
	public void run() {
		for(int cnt=0;cnt<10;cnt++)
			System.out.print(cnt);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		
	}
	
	
}

class AlphabetThread extends Thread{
	public void run() {
		for(char ch='A';ch<='Z';ch++) {
			System.out.print(ch);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
}



public class MultithreadExample2 {

	public static void main(String[] args) {
		Thread d1=new DigitThread3();
		Thread d2=new DigitThread3();
		AlphabetThread a1=new AlphabetThread();
		d1.start();
		d2.start();
		a1.start();

	}

}
