package exam01.ex01;

import java.util.Scanner;

public class Ex09_10 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int coffee;
		
		System.out.printf("� Ŀ�� �帱���?(1:����,2:����,3:��)");
		coffee=s.nextInt();
		
		System.out.printf("\n#1.�߰ſ� ���� �غ��Ѵ�.\n");
		System.out.printf("#2.�������� �غ��Ѵ�.\n");
		
		switch(coffee) {
		case 1:
			System.out.println("#3.����Ŀ�Ǹ� ź��.");
			break;
		case 2:
			System.out.println("#3.����Ŀ�Ǹ� ź��.");
			break;
		case 3:
			System.out.println("#3.��Ŀ�Ǹ� ź��.");
			break;
			default:
				System.out.println("#3.�ƹ��ų� ź��.");
				break;
			
		}
		
		System.out.println("#4.���� �״´�.");
		System.out.println("#5.��Ǭ���� ��� ���δ�.");
		
		System.out.println("�մ�~ Ŀ�� ���� �ֽ��ϴ�.");

	}

}
