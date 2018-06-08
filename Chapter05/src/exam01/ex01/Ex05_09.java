package exam01.ex01;

import java.util.Scanner;

public class Ex05_09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;

		System.out.println("1~4 중에 선택하세요:");
		a = s.nextInt();

		switch (a) {
		case 1:
			System.out.println("1을 선택함");
			break;
		case 2:
			System.out.println("2을 선택함");
			break;
		case 3:
			System.out.println("3을 선택함");
			break;
		case 4:
			System.out.println("4을 선택함");
			break;
		default:
			System.out.println("해당 번호 없음");
			
		}

	}

}
