package exam01.ex01;

public class Ex03_07 {

	public static void main(String[] args) {

		int a;  //정수 (4byte)
		float b; //실수 (4byte)
		double c;  //실수(8byte)
		
		
		a=(int) 123.45;  // 강제 형변
		b=123.45f; // 실수의 기본 크기는 8byte f를 붙이면 4byte로 변경 
		System.out.printf("b의 값==>%f\n",b);
		b=200;
		
		System.out.printf("a의 값==>%d\n",a);
		System.out.printf("b의 값==>%f\n",b);
		
		c=123.45;
		System.out.printf("b의 값==>%f\n",c);
		
		
	}

}
