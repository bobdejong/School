package exam01.ex01;

import java.util.Scanner;

public class Ex07_03 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a,b;
		
		while(true) {  //���ѹݺ�
			System.out.println("�� �� ù ��° �� �Է�:");
			a=s.nextInt();
			System.out.println("�� �� �� ��° �� �Է�:");
			b=s.nextInt();
			
			System.out.printf("%d+%d=%d\n",a,b,a+b);
		
			break;
		}

	}

}
