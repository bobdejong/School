package exam01.ex01;

import java.util.Scanner;

public class Ex07_08 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a,b;
		
		while(true) {
			System.out.print("���� ù ��° �� �Է�");
			a=s.nextInt();
			System.out.print("���� �� ���� �� �Է�");
			b=s.nextInt();
			
			//
			
			System.out.printf("%d+%d=%d\n",a,b,a+b);
			if(a==0) 
				break;
			
			
		}
		
		System.out.println("0�� �Է��ؼ� �ݺ����� Ż���߽��ϴ�.");

	}

}