package exam01.ex01;

import java.util.Scanner;

public class Problem_12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b;
		char ch;

		System.out.println("ù��° ���� �Է��ϼ���:");
		a = s.nextInt();

		System.out.println("����� �����ڸ� �Է��ϼ���:");
		ch = s.next().charAt(0); // next������� nextLine ��������.. charAt(0)���ڿ����� �����ϳ� �޾ƿ�

		System.out.println("�ι�° ���� �Է��ϼ���");
		b = s.nextInt();

		if (ch == '+')
			System.out.printf("%d+%d=%d�Դϴ�. \n", a, b, a + b);
		else if (ch == '-')
			System.out.printf("%d-%d=%d�Դϴ�. \n", a, b, a - b);
		else if (ch == '*')
			System.out.printf("%d*%d=%d�Դϴ�. \n", a, b, a * b);
		else if (ch == '/')
			System.out.printf("%d/%d=%f�Դϴ�. \n", a, b, a / (float) b);
		if (ch == '%')
			System.out.printf("%d %% %d=%d�Դϴ�. \n", a, b, a % b);
		else
			System.out.println("EZEN");
		
		//if���� ���� üũ��
		
	}

}
