package sec07.exam03_final_polymorphism;

public class CarExample {
		public static void main(String[] args) {
			Car car=new Car();
			
			for(int i=1;i<=5;i++) {
				
				int problemLocation=car.num();
				
				switch(problemLocation) {
				
				case 1:
					System.out.println("�տ��� HannkookTire�� ��ü");
					car.frontLeftTire=new HankookTire("�տ���",15);
					break;
				case 2:
					System.out.println("�տ����� KumhoTire�� ��ü");
					car.frontRightTire=new kumhoTire("�տ�����",13);
					break;
				case 3:
					System.out.println("�ڿ��� HannkookTire�� ��ü");
					car.backLeftTire=new HankookTire("�ڿ���",14);
					break;
				case 4:
					System.out.println("�ڿ����� HannkookTire�� ��ü");
					car.backRightTire=new kumhoTire("�ڿ�������",17);
					break;
				}
			}
			
			
			
			
			
		}
}
