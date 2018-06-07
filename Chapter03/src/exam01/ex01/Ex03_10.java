package exam01.ex01;

public class Ex03_10 {

	public static void main(String[] args) {
		int a=100;
		int b=200;
		float result;
		
		
		result=a/b;  // 정/정 ==> 정

		System.out.printf("%f\n",result);
		
		
		result=a/(float)b;  // 정/실 ==> 실
		

		System.out.printf("%f\n",result);
	}

}
