package exam01.ex02;

import java.util.Scanner;

public class ScannerInputTest_11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String name;
		int age;
		
		System.out.print("이름?");
		name=sc.next(); // 공백 구분  홍 길동하면 홍만 입력받고 길동은 age에서 받음 nextLine써야 공백써도 괜차늠
		
		System.out.print("나이?");
		age=sc.nextInt();
		
		System.out.println(name+":"+age);

	}

}
