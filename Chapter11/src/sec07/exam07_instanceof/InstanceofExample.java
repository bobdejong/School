package sec07.exam07_instanceof;

public class InstanceofExample {

	
		
		public static void method1(Parent parent) {
			if(parent instanceof Child) {
				Child child =(Child) parent;
				System.out.println("method1 - Child�� ��ȯ ����");
			}else {
				System.out.println("method1 - Child�� ��ȯ���� ����");
			}
		}

		public static void method2(Parent parent) {
			Child child=(Child) parent;
			System.out.println("method2 - Child�� ��ȯ ����");
			
		}
		public static void main(String[] args) {	
		Parent parentA = new Child();  //�ڽİ�ü�� ��������鼭 �θ�ü�� �������
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();  //�ڽİ�ü�� ����� ��������
		method1(parentB);
		method2(parentB);
		
		
		
	}

}