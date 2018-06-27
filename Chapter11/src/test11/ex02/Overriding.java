package test11.ex02;

class Speaker{  //final:��� ����
	private int volumeRate;
	
	public void showCurrentState() {    //final:�������̵� ����
		System.out.println("����ũ��:"+volumeRate);
	}
	
	public void setVolume(int vol) {
		volumeRate=vol;
	}
	
}

class BaseEnSpeaker extends Speaker{
	private int baseRate;
	
	public void showCurrentState() {
		super.showCurrentState();   //�θ�޼ҵ� ������ super
		System.out.println("���̽� ũ��:"+baseRate);
	}
	
	public void setBaseRate(int base) {
		baseRate=base;
	}
}


public class Overriding {

	public static void main(String[] args) {
		BaseEnSpeaker bs=new BaseEnSpeaker();
		bs.setVolume(10);
		bs.setBaseRate(20);
		bs.showCurrentState();
		
	}

}
