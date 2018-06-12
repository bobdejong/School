package exam01.ex01;

import java.io.IOException;
import java.util.Scanner;

public class Ex07_04 {

	public static void main(String[] args) throws IOException {
		Scanner s=new Scanner(System.in);
		int a,b;
		char ch;
		
		while(true) {
			System.out.print("계산할 첫번째 수를 입력:");
			a=s.nextInt();
			System.out.print("계산할 두번째 수를 입력:");
			b=s.nextInt();
			System.out.println("계산할 연산자를 입력하세요:");
			ch=(char)System.in.read(); //43을 +로 처리
			
			switch(ch) {
			case '+':
				System.out.printf("%d+%d=%d입니다.",a,b,a+b);
				break;
			case '-':
				System.out.printf("%d-%d=%d입니다.",a,b,a-b);
				break;
			case '/':
				System.out.printf("%d/%d=%f입니다.",a,b,a/(float)b);
				break;
			case '*':
				System.out.printf("%d*%d=%d입니다.",a,b,a*b);
				break;
			case '%':
				System.out.printf("%d%%%d=%d입니다.",a,b,a%b);
				break;
			default:
			
			}
			
		}
		
		
		
		
		
		
		
		
		
	}

}
