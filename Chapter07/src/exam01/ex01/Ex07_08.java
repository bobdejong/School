package exam01.ex01;

import java.util.Scanner;

public class Ex07_08 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a,b;
		
		while(true) {
			System.out.print("더할 첫 번째 수 입력");
			a=s.nextInt();
			System.out.print("더할 두 번재 수 입력");
			b=s.nextInt();
			
			//
			
			System.out.printf("%d+%d=%d\n",a,b,a+b);
			if(a==0) 
				break;
			
			
		}
		
		System.out.println("0을 입력해서 반복문을 탈출했습니다.");

	}

}
