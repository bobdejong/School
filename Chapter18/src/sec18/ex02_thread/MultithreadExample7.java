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
			sharedArea.notify();//����� ������� ��� Ŭ������ "�� area�ٛ���"��� ����
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
		    synchronized (sharedArea){//��ü�� ��ȣ�ȿ� ������ ��ü ����ȭ 
		    	sharedArea.wait();//��� Ŭ��������  "�� area�ٛ���"��� ���� ��� "�ڴ� ��"
		    }
		   }
		   catch(InterruptedException e){
		    System.out.println(e.getMessage());//wait()�� �ͼ��� ó�� 
		   }
		  }
	
		System.out.println(sharedArea.result);
	
	}
}

class SharedArea{  //���� ���� ��ü
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
