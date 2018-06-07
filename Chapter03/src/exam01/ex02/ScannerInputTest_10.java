package exam01.ex02;

import java.io.BufferedReader;
import java.util.Scanner;

public class ScannerInputTest_10 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.print("이름=");
		String name=in.nextLine();
		System.out.print("나이=");
		int age=in.nextInt();
		System.out.print("몸무게=");
		//in.nextFloat()
		double weight=in.nextDouble();
		
		System.out.println();
		System.out.println(name+"님!");
		System.out.print("당신의 나이는"+age+"이고");
		System.out.println("당신의 몸무게는"+weight+"kg 입니다.");

	}

}
