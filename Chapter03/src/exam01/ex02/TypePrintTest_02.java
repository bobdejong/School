package exam01.ex02;

public class TypePrintTest_02 {

	public static void main(String[] args) {
		boolean boolType = true; //false
		byte byteType=100; //-128~127
		char charType='A';// 0~65535
		short shortType=-32000;// -32768~ 32767
		int intType=2147483647; // -2147483648~2147483647
		int intType2=Integer.MIN_VALUE;
		long longType=12345L; // -922°æ ~922°æ
		float floatType= 175.74F; //
		double doubleType= 3.1415924554391239459435; //4.9E-324~1.8E308
		
		System.out.println("booleanType="+boolType);
		System.out.println("byteType="+byteType);
		System.out.println("charType="+charType);
		System.out.println("shortType="+shortType);
		System.out.println("intType="+intType);
		System.out.println("intType2="+intType2);
		System.out.println("longType="+longType);
		System.out.println("floatType="+floatType);
		System.out.println("doubleType="+doubleType);
		
		
		
	}

}
