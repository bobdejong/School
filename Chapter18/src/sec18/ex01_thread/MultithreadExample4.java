package sec18.ex01_thread;

class CalcThread extends Thread{
	SharedArea sharedArea;
	
	public void run() {
		double total=0.0;
		for(int cnt=1;cnt<1000;cnt+=2)
			if(cnt/2%2==0)
				total+=1.0/cnt;
			else
				total-=1.0/cnt;
		sharedArea.result=total*4;
		sharedArea.isReady=true;
		
	}
	
}

class PrintThread extends Thread{
	SharedArea sharedArea;
	
	public void run() {
		while(sharedArea.isReady !=true)
			continue;
		System.out.println(sharedArea.result);
	}
}

class SharedArea{  //공유 영역 객체
	double result;
	boolean isReady; //false
}


public class MultithreadExample4 {

	public static void main(String[] args) {
		CalcThread thread1=new CalcThread();
		PrintThread thread2=new PrintThread();
		SharedArea obj=new SharedArea();
		
		thread1.sharedArea=obj;
		thread2.sharedArea=obj;
		thread1.start();
		thread2.start();
		
	}

}
