package exam01.ex01;

public class Ex09_15 {
	
	
	static int a=100; //field(��) 
	
	static void func1() {
		int a=200; //local(����)���� func1�ȿ����� ��
		System.out.printf("func1()���� a�� ��==>%d\n",a);
		
		
	}
	
	
	
	public static void main(String[] args) {
		func1();
		System.out.printf("main()���� a�� ��==>%d\n",a);

	}

}
