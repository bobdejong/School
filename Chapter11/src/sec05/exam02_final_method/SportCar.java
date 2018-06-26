package sec05.exam02_final_method;

public class SportCar extends Car{
	
	@Override
	
	public void speedUp() {
		speed=10;
	}
	
	/*public void stop() {    final이 붙으면 오버라이드 안됨
		System.out.println("스포츠카를 멈춤");
		speed=0;
		
	}*/
	
	
	

}
