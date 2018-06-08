package exam01.ex01;

import java.util.Scanner;

public class Problem_11 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a,b;
		char ch;
		
		System.out.println("첫번째 수를 입력하세요:");
		a=s.nextInt();

		System.out.println("계산할 연산자를 입력하세요:");
		
		System.out.println("두번째 수를 입력하세요");
		b=s.nextInt();
		
		//if(ch=='+')
			System.out.printf("%d+%d=%d입니다. \n",a,b,a+b);
		
		
	}

}
