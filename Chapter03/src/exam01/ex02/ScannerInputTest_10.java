package exam01.ex02;

import java.io.BufferedReader;
import java.util.Scanner;

public class ScannerInputTest_10 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.print("�̸�=");
		String name=in.nextLine();
		System.out.print("����=");
		int age=in.nextInt();
		System.out.print("������=");
		//in.nextFloat()
		double weight=in.nextDouble();
		
		System.out.println();
		System.out.println(name+"��!");
		System.out.print("����� ���̴�"+age+"�̰�");
		System.out.println("����� �����Դ�"+weight+"kg �Դϴ�.");

	}

}
