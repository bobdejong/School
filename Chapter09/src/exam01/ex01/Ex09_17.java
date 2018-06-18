package exam01.ex01;

public class Ex09_17 {

	static void func1(int a) {
		//int a=100; 매개변수와 똑같은 변수를 쓸수 없다.
		a=a+1; //11
		System.out.printf("전달받은 a==>%d\n",a);
		
		
	}
	
	
	
	public static void main(String[] args) {
		int a=10;
		
		func1(a);
		System.out.printf("func1() 실행 후의 a==>%d\n",a);

	}

}
