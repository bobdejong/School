package test11.ex01;

class Car5{
	protected String color;
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
		sedan5.setColor("����");
		
		System.out.println("�¿��� �ӵ�:"+sedan5.speed);
		System.out.println("�¿��� ����:"+sedan5.color);

	}

}
