package exam01.ex01;

import java.util.Scanner;

public class Ex07_03 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a,b;
		
		while(true) {  //무한반복
			System.out.println("더 할 첫 번째 수 입력:");
			a=s.nextInt();
			System.out.println("더 할 두 번째 수 입력:");
			b=s.nextInt();
			
			System.out.printf("%d+%d=%d\n",a,b,a+b);
		
			break;
		}

	}

}
