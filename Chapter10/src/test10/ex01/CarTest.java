package test10.ex01;

class Car{
	String color;
	String gearType;
	int door;
	
	//
	Car(){}
	
	Car(String c,String g, int d){
		color=c;
		gearType=g;
		door=d;
		
	}
	
}

public class CarTest {

	public static void main(String[] args) {
		Car c1=new Car();
		c1.color="white";
		c1.gearType="auto";
		c1.door=4;

	}

}
