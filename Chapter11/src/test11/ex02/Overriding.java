package test11.ex02;

class Speaker{  //final:상속 금지
	private int volumeRate;
	
	public void showCurrentState() {    //final:오버라이드 금지
		System.out.println("볼륨크기:"+volumeRate);
	}
	
	public void setVolume(int vol) {
		volumeRate=vol;
	}
	
}

class BaseEnSpeaker extends Speaker{
	private int baseRate;
	
	public void showCurrentState() {
		super.showCurrentState();   //부모메소드 쓰려면 super
		System.out.println("베이스 크기:"+baseRate);
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
