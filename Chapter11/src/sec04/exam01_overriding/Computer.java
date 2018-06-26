package sec04.exam01_overriding;

public class Computer extends Calculator {
	
	@Override  //어노테이션 = 제대로 오버라이딩이 되었나 틀리면 표시해줌
	
	double areaCircle(double r) {  //overriding
		System.out.println("computer 객체의 areaCircle() 실행");
		System.out.println(Math.PI);
		return Math.PI*r*r;
		
	}

}
