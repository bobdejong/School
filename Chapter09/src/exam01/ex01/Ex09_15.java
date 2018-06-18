package exam01.ex01;

public class Ex09_15 {
	
	
	static int a=100; //field(필) 
	
	static void func1() {
		int a=200; //local(지역)변수 func1안에서만 씀
		System.out.printf("func1()에서 a의 값==>%d\n",a);
		
		
	}
	
	
	
	public static void main(String[] args) {
		func1();
		System.out.printf("main()에서 a의 값==>%d\n",a);

	}

}
