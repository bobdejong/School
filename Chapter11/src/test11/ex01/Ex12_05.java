package test11.ex01;

class Car5{
	protected String color;  //protected 상속에서만 허용
	int speed;
}

class Sedan5 extends Car5{
	void setSpeed(int speed) {
		this.speed=speed;
	}
	
	void setColor(String color) {
		this.color=color;
	}
	
}


public class Ex12_05 {

	public static void main(String[] args) {
		Sedan5 sedan5=new Sedan5();
		
		sedan5.setSpeed(300);
		sedan5.setColor("빨강");
		
		System.out.println("승용차 속도:"+sedan5.speed);
		System.out.println("승용차 색상:"+sedan5.color);
		
		Car5 mycar5=new Car5();
		mycar5.color="red";
		System.out.println("승용차 색상:"+sedan5.color);

	}

}
