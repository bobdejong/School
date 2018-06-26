package sec07.exam02_promotion_access;

public class ChildExample {

	public static void main(String[] args) {
		Child child=new Child();
		
		Parent parent=child;  // 公炼扒 何葛 困林肺 贸府
		
		parent.method1();
		
		parent.method2();
		
		//parent.method3();

	}

}
