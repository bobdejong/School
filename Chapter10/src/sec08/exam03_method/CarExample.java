package sec08.exam03_method;

public class CarExample {

	public static void main(String[] args) {
		Car mycar=new Car(); //��ü����(�޸𸮿� ����)
		mycar.keyTurnOn();
		mycar.run();
		
		int speed=mycar.getSpeed();
		System.out.println("����ӵ�"+speed+"km/h");
		
	}

}
