package exam01.ex02;

import java.util.Scanner;

public class WhilecontrolTest_09 {

	public static void main(String[] args) {
		boolean num=true;
		int balance=0;
		Scanner scanner=new Scanner(System.in);
		while(num) {
			System.out.println("--------------------------");
			System.out.println("1.����|2.���|3.�ܰ�|4.����");
			System.out.println("--------------------------");
			System.out.println("����>");
	
			int menuNum=scanner.nextInt();
			
			switch(menuNum) {
			case 1:
				System.out.println("���ݾ�");
				balance+=scanner.nextInt();
				break;
			case 2:
				System.out.println("��ݾ�");
				balance-=scanner.nextInt();
				break;
			case 3:
				System.out.println("�ܰ�>");
				System.out.println(balance);
				break;
			case 4:
				num=false;
				break;
				
				
			}
			
			System.out.println();
			
			
		}
			System.out.println("���α׷� ����");
	}

}
