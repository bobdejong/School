package exam01.ex02;

public class TypeConversion {

	public static void main(String[] args) {
		byte b=127;
		int i= 100;
		
		System.out.println(b+i);
		System.out.println(10/4); //정수와 정수의 연산은 실수가 나올수 없어서 2가 나옴
		System.out.println(10.0/4);
		System.out.println((char)0x12340041);
		System.out.println((char)0x0042);
		System.out.println(0x0042);
		System.out.println((byte)(b+i));
		System.out.println((int)(2.9+1.8));
		System.out.println((int)2.9+(int)1.8);
		System.out.println();
		

	}

}
