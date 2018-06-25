package sec02.exam01_inheritance;

public class DmbCellPhone extends CellPhone{   //상속
	int channel;
	
	DmbCellPhone(String model,String color,int channel){
		//super();  자동으로 컴파일러가 부모생성자 호출하여 부모객체생성
		this.model=model;
		this.color=color;
		this.channel=channel;
		
		
	}
		
	void turnOnDmb() {
		System.out.println("채널"+channel+"번 DMB 방송 수신을 시작합니다.");
	}
	
	void changeChannelDmb(int channel) {
		this.channel=channel;
		System.out.println("채널"+channel+"번으로 바꿉니다.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
	
	
	
}
