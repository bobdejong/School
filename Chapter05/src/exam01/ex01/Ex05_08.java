package exam01.ex01;

import java.util.Scanner;

public class Ex05_08 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num;
		
		System.out.print("점수를 입력하세요 :");
		num=s.nextInt();
		
		if(num>90) {
			System.out.print("A");
		}
		else if(num>80) {
			System.out.print("B");
		}
		else if(num>70) {
			System.out.print("C");
		}
		else if(num>60) {
			System.out.print("D");
		}
		else {
			System.out.print("F");
		}
		System.out.println("학점 입니다.");
	}

}
