package exam01.ex02;

public class FormatPrintTest_03 {

	public static void main(String[] args) {
		System.out.printf("%c",'A');
		System.out.println();
		System.out.printf("%5c",'A');
		System.out.println();
		System.out.printf("%-5c",'A');
		System.out.println();
		System.out.println("===================================");
		System.out.printf("%d",12345);
		System.out.println();
		System.out.printf("%o",12345);
		System.out.println();
		System.out.printf("%x",12345);
		System.out.println();
		System.out.printf("%10d",12345);
		System.out.println();
		System.out.println("===================================");
		System.out.printf("%f",12.12745F);
		System.out.println();
		System.out.printf("%e",12.12745F);
		System.out.println();
		System.out.printf("%10.2f",12.12745F);
		System.out.println();
		System.out.printf("%010.2f",12.12745f);
		System.out.println();
		
		System.out.printf("%-10.2f",12.12745F);
		System.out.println();

	}

}
