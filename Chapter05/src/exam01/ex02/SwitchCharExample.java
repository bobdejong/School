package exam01.ex02;

import java.util.Scanner;

public class SwitchCharExample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		String grade;
		System.out.println("�Է�");
		grade=s.nextLine();
		
		switch(grade) {
		case "A":
			System.out.println("��� A");
			break;
		case "a":
			System.out.println("��� ȸ���Դϴ�.");
			break;
		case "B":
			System.out.println("�Ϲ� A");
			break;
		case "b":
			System.out.println("�Ϲ� ȸ���Դϴ�.");
			break;
			default:
				System.out.println("�մ��Դϴ�.");
		
		}

	}

}
