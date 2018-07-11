package sec18.ex04_thread;

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
			sharedArea.notifyAll();//모든 스레드로 신호를 보냄
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

class MonitorThread extends Thread{
	Thread thread;
	MonitorThread(Thread thread){
		this.thread=thread;
	}
	public void run() {
		while(true) {
			Thread.State state=thread.getState();      //RUNNABLE: 실행가능상태
			System.out.println("쓰레드의 상태"+state); 		//TERMINATED: 실행을 마친 상태
			if(state==Thread.State.TERMINATED)
				break;
			try {
				Thread.sleep(20000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
}

public class MultithreadExample9 {

	public static void main(String[] args) {
		CalcThread thread1=new CalcThread();
		PrintThread thread2=new PrintThread();
		MonitorThread thread3=new MonitorThread(thread1);
		SharedArea obj=new SharedArea();
		
		thread1.sharedArea=obj;
		thread2.sharedArea=obj;
		thread1.start();
		thread2.start();
		thread3.start();

	}

}
