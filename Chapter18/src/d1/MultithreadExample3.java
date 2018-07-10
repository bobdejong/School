package d1;

class SmallLeters implements Runnable{  //다중상속이 안되서 인터페이스 사용, 다른 클래스 상속받을때 Thread는 상속 못받음 
	public void run() {					//extends frame extends Thread(x) extends frame implements Runnable (o) 
		for(char ch='a';ch<='z';ch++) {
			System.out.print(ch);
		}
		
	}
	
	
}

public class MultithreadExample3 {

	public static void main(String[] args) {
		//Runnable s=new SmallLeters();
		
		Thread thread=new Thread(new SmallLeters());

		thread.start();
		char arr[]= {'ㄱ','ㄴ','ㄷ','ㄹ','ㅁ','ㅂ','ㅅ','ㅇ','ㅈ','ㅊ','ㅋ','ㅌ','ㅍ','ㅎ'};
		for(char ch:arr) {
			System.out.print(ch);
		}
		
		
	}

}
