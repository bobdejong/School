package sex08.exam01_abstract_class;

public class PhoneExample {

	public static void main(String[] args) {
		//Phone phone=new Phone("홍길수"); 추상클래스라 단독으로 객체생성 불가
		SmartPhone smartphone=new SmartPhone("홍길동");
		smartphone.turnOn();
		smartphone.internetSearch();
		smartphone.turnOff();

	}

}
