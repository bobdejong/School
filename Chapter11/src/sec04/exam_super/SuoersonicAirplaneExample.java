package sec04.exam_super;

public class SuoersonicAirplaneExample {

	public static void main(String[] args) {
		SupersonicAirplane sa=new SupersonicAirplane();
		sa.takeoff();
		sa.fly();
		sa.flyMode=SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode=SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
		
	}

}
