package exam01.ex01;

public class Ex09_16 {

	static void func1() {
		System.out.println("void�� �޼ҵ�� �����ٰ� ����");
		
	}
	static int func2() {
		return 100;
		
	}
	
	public static void main(String[] args) {
		int a;
		func1();
		
		a=func2(); //100
		System.out.printf("int �� �޼ҵ忡�� ������ ��==>%d\n",a);

	}

}
