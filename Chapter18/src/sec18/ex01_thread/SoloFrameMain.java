package sec18.ex01_thread;

import java.awt.Frame;

class SoloFrame extends Frame{
	
	public SoloFrame() {
		SoloThread r=new SoloThread(this);
		
		r.start();
	}
	
}

class SoloThread extends Thread{
	private Frame f=null;
	public SoloThread(Frame f) {
		this.f=f;
		
	}
	
	public void run() {
		int i=0;
		System.out.println("������ ����!");
		while(i<20) {
			System.out.print(i+"\t");
			f.setTitle("������ ������"+i++);
		try {
			this.sleep(500);
		}catch(InterruptedException e) {
			System.out.println(e);
		}
		}
		System.out.println("������ ����");
	}
	
}
	



public class SoloFrameMain {

	public static void main(String[] args) {
		SoloFrame s=new SoloFrame();
		s.setSize(300,100);
		s.setVisible(true);
		

	}

}
