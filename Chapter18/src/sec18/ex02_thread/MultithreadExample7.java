package sec18.ex02_thread;

class CalcThread extends Thread{
	SharedArea sharedArea;
	
	public void run() {
		double total=0.0;
		for(int cnt=1;cnt<1000000;cnt+=2) {
		
			if(cnt/2%2==0)
				total+=1.0/cnt;
			else
				total-=1.0/cnt;
		sharedArea.result=total*4;
		synchronized (sharedArea){
			sharedArea.notify();//계산이 끝날경우 출력 클래스에 "나 area다썻어"라고 말함
			  }

			

		}
		
	}
	
}

class PrintThread extends Thread{
	SharedArea sharedArea;
	
	public void run() {
		 if(sharedArea.isReady != true)
		  {
		   try{
		    synchronized (sharedArea){//객체가 괄호안에 있으면 객체 동기화 
		    	sharedArea.wait();//계산 클래스에서  "나 area다썻어"라는 말을 듣고 "자다 깸"
		    }
		   }
		   catch(InterruptedException e){
		    System.out.println(e.getMessage());//wait()의 익셉션 처리 
		   }
		  }
	
		System.out.println(sharedArea.result);
	
	}
}

class SharedArea{  //공유 영역 객체
	double result;
	boolean isReady;
}


public class MultithreadExample7 {

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
