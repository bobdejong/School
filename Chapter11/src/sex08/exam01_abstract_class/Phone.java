package sex08.exam01_abstract_class;

public abstract class Phone {  //추상클래스
	public String owner;
	
	public Phone(String owner) {
		this.owner=owner;
	}
	
	public void turnOn() {
		System.out.println("본 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}


}
