package exam01.ex02;

import java.util.Scanner;

public class WhilecontrolTest_09 {

	public static void main(String[] args) {
		boolean num=true;
		int balance=0;
		Scanner scanner=new Scanner(System.in);
		while(num) {
			System.out.println("--------------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("--------------------------");
			System.out.println("선택>");
	
			int menuNum=scanner.nextInt();
			
			switch(menuNum) {
			case 1:
				System.out.println("예금액");
				balance+=scanner.nextInt();
				break;
			case 2:
				System.out.println("출금액");
				balance-=scanner.nextInt();
				break;
			case 3:
				System.out.println("잔고>");
				System.out.println(balance);
				break;
			case 4:
				num=false;
				break;
				
				
			}
			
			System.out.println();
			
			
		}
			System.out.println("프로그램 종료");
	}

}
