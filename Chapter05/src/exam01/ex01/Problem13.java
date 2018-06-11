package exam01.ex01;

import java.util.Scanner;

public class Problem13 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=0,b=0;
		char ch;
		String[] str;
		
		System.out.println("수식을 한줄로 띄어쓰기로 입력하세요:");
		str=s.nextLine().split(" ");
		//str[0][1][2] 5+5순서대로  split=공백제거
		a=Integer.parseInt(str[0]);
		ch=str[1].charAt(0);
		b=Integer.parseInt(str[2]);
		
		
		switch(ch) {
		case '+':
			System.out.printf("%d+%d=%d 입니다.\n",a,b,a+b);
			break;
		case '-':
			System.out.printf("%d-%d=%d 입니다.\n",a,b,a-b);
			break;
		case '*':
			System.out.printf("%d*%d=%d 입니다.\n",a,b,a*b);
			break;
		case '/':
			System.out.printf("%d/%d=%d 입니다.\n",a,b,a/b);
			break;
		case '%':
			System.out.printf("%d %% %d=%d 입니다.\n",a,b,a%b);
			break;
		default:
			System.out.println("연산자를 잘못 입력했습니다.");
		}
		
		
		
	}

}
