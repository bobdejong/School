package exam01.ex01;

import java.io.IOException;
import java.util.Scanner;

public class Ex07_04 {

	public static void main(String[] args) throws IOException {
		Scanner s=new Scanner(System.in);
		int a,b;
		char ch;
		
		while(true) {
			System.out.print("����� ù��° ���� �Է�:");
			a=s.nextInt();
			System.out.print("����� �ι�° ���� �Է�:");
			b=s.nextInt();
			System.out.println("����� �����ڸ� �Է��ϼ���:");
			ch=(char)System.in.read(); //43�� +�� ó��
			
			switch(ch) {
			case '+':
				System.out.printf("%d+%d=%d�Դϴ�.",a,b,a+b);
				break;
			case '-':
				System.out.printf("%d-%d=%d�Դϴ�.",a,b,a-b);
				break;
			case '/':
				System.out.printf("%d/%d=%f�Դϴ�.",a,b,a/(float)b);
				break;
			case '*':
				System.out.printf("%d*%d=%d�Դϴ�.",a,b,a*b);
				break;
			case '%':
				System.out.printf("%d%%%d=%d�Դϴ�.",a,b,a%b);
				break;
			default:
			
			}
			
		}
		
		
		
		
		
		
		
		
		
	}

}
