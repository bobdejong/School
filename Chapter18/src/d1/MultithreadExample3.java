package d1;

class SmallLeters implements Runnable{  //���߻���� �ȵǼ� �������̽� ���, �ٸ� Ŭ���� ��ӹ����� Thread�� ��� ������ 
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
		char arr[]= {'��','��','��','��','��','��','��','��','��','��','��','��','��','��'};
		for(char ch:arr) {
			System.out.print(ch);
		}
		
		
	}

}
