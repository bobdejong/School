package exam01.ex01;

import java.util.Scanner;

public class Problem_12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b;
		char ch;

		System.out.println("첫번째 수를 입력하세요:");
		a = s.nextInt();

		System.out.println("계산할 연산자를 입력하세요:");
		ch = s.next().charAt(0); // next공백까지 nextLine 공백포함.. charAt(0)문자열에서 문자하나 받아옴

		System.out.println("두번째 수를 입력하세요");
		b = s.nextInt();

		if (ch == '+')
			System.out.printf("%d+%d=%d입니다. \n", a, b, a + b);
		else if (ch == '-')
			System.out.printf("%d-%d=%d입니다. \n", a, b, a - b);
		else if (ch == '*')
			System.out.printf("%d*%d=%d입니다. \n", a, b, a * b);
		else if (ch == '/')
			System.out.printf("%d/%d=%f입니다. \n", a, b, a / (float) b);
		if (ch == '%')
			System.out.printf("%d %% %d=%d입니다. \n", a, b, a % b);
		else
			System.out.println("EZEN");
		
		//if문은 전부 체크함
		
	}

}
