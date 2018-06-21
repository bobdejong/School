package sec08.exam04_overloading;

public class Calculator {

	
		
		double areaRetangle(double width) {  //method overloading 동일 메소드명에 매개변수가 서로 다른것
			return width*width;
			
		}

		double areaRetangle(double width,double height ) {
			return width*height;
			
		}
		
}


