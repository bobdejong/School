package exam01.ex01;

import java.util.Scanner;

public class Problem13 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=0,b=0;
		char ch;
		String[] str;
		
		System.out.println("������ ���ٷ� ����� �Է��ϼ���:");
		str=s.nextLine().split(" ");
		//str[0][1][2] 5+5�������  split=��������
		a=Integer.parseInt(str[0]);
		ch=str[1].charAt(0);
		b=Integer.parseInt(str[2]);
		
		
		switch(ch) {
		case '+':
			System.out.printf("%d+%d=%d �Դϴ�.\n",a,b,a+b);
			break;
		case '-':
			System.out.printf("%d-%d=%d �Դϴ�.\n",a,b,a-b);
			break;
		case '*':
			System.out.printf("%d*%d=%d �Դϴ�.\n",a,b,a*b);
			break;
		case '/':
			System.out.printf("%d/%d=%d �Դϴ�.\n",a,b,a/b);
			break;
		case '%':
			System.out.printf("%d %% %d=%d �Դϴ�.\n",a,b,a%b);
			break;
		default:
			System.out.println("�����ڸ� �߸� �Է��߽��ϴ�.");
		}
		
		
		
	}

}
