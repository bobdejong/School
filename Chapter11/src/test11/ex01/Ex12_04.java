package test11.ex01;

class Car4{
	private String color;
	int speed;
}

class Sedan4 extends Car4{
	
	void setSpeed(int speed) {
		this.speed=speed;
	}
	
	/*void setColor(String color) {
		this.color=color; //private 접근 불가
	}*/
}


public class Ex12_04 {

	public static void main(String[] args) {
		Sedan4 sedan4=new Sedan4();
		
		sedan4.setSpeed(300);
		System.out.println("승용차 속도==>"+sedan4.speed);

	}

}
