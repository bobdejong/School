package exam01.ex01;

import java.util.Scanner;

public class Ex09_03 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str;
		
		System.out.print("���ڿ� �Է�==>");
		str=s.nextLine();  //Hello java
		
		System.out.println("��� ���ڿ�==>");
		
		if(!str.startsWith("("))
		System.out.print("(");
		
		for(int i=0;i<str.length();i++)
			System.out.printf("%c",str.charAt(i));
		
		if(!str.endsWith(")"))
			System.out.print(")");

	}

}
