package sec07.exam03_final_polymorphism;

public class CarExample {
		public static void main(String[] args) {
			Car car=new Car();
			
			for(int i=1;i<=5;i++) {
				
				int problemLocation=car.num();
				
				switch(problemLocation) {
				
				case 1:
					System.out.println("앞왼쪽 HannkookTire로 교체");
					car.frontLeftTire=new HankookTire("앞왼쪽",15);
					break;
				case 2:
					System.out.println("앞오른쪽 KumhoTire로 교체");
					car.frontRightTire=new kumhoTire("앞오른쪽",13);
					break;
				case 3:
					System.out.println("뒤왼쪽 HannkookTire로 교체");
					car.backLeftTire=new HankookTire("뒤왼쪽",14);
					break;
				case 4:
					System.out.println("뒤오른쪽 HannkookTire로 교체");
					car.backRightTire=new kumhoTire("뒤오른왼쪽",17);
					break;
				}
			}
			
			
			
			
			
		}
}
