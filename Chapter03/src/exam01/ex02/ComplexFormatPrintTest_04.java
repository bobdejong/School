package exam01.ex02;

public class ComplexFormatPrintTest_04 {

	public static void main(String[] args) {
		System.out.printf("%s","홍길동");
		System.out.printf("%10s\n\n","홍길동");
		
		String name="홍길동";
		int age=20;
		System.out.printf("%10s님의 나이는 %05d세 입니다.",name, age);

	}

}
