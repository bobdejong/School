package exam01.ex02;

import java.util.Scanner;

public class SwitchCharExample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		String grade;
		System.out.println("입력");
		grade=s.nextLine();
		
		switch(grade) {
		case "A":
			System.out.println("우수 A");
			break;
		case "a":
			System.out.println("우수 회원입니다.");
			break;
		case "B":
			System.out.println("일반 A");
			break;
		case "b":
			System.out.println("일반 회원입니다.");
			break;
			default:
				System.out.println("손님입니다.");
		
		}

	}

}
