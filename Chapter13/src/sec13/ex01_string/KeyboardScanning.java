package sec13.ex01_string;

import java.util.Scanner;

public class KeyboardScanning {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		int sum=num1+num2+num3;
		
		System.out.printf("���ڿ��� ����� %d,%d,%d�� ���� %d\n",num1,num2,num3,sum);


	}

}
