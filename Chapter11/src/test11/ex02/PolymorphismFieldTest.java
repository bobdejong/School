package test11.ex02;

class FieldSuper{
	int x=100;
}

class FieldSub extends FieldSuper{
	//int y=200;
	int x=1001;
}


public class PolymorphismFieldTest {

	public static void main(String[] args) {
		FieldSuper sup=new FieldSub();
		System.out.println("sup.x="+sup.x);
		// System.out.println("sup.x="+sup.y); �ڽ����δ� ���ٸ���
		
		FieldSub sup1=new FieldSub();
		System.out.println("sup.x="+sup1.x);
	}

}
