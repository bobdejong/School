package sec07.exam07_instanceof;

public class InstanceofExample {

	
		
		public static void method1(Parent parent) {
			if(parent instanceof Child) {
				Child child =(Child) parent;
				System.out.println("method1 - Child로 변환 성공");
			}else {
				System.out.println("method1 - Child로 변환되지 않음");
			}
		}

		public static void method2(Parent parent) {
			Child child=(Child) parent;
			System.out.println("method2 - Child로 변환 성공");
			
		}
		public static void main(String[] args) {	
		Parent parentA = new Child();  //자식개체가 만들어지면서 부모객체도 만들어짐
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();  //자식개체가 만들어 지지않음
		method1(parentB);
		method2(parentB);
		
		
		
	}

}
