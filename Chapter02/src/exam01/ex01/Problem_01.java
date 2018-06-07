package exam01.ex01;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Problem_01 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int d;
		int result;
		
		Scanner s=new Scanner(System.in);
		System.out.print("첫번째 값을 입력하세요===>");
		a=s.nextInt();
		System.out.print("두번째 값을 입력하세요===>");
		b=s.nextInt();
		System.out.print("세번째 값을 입력하세요===>");
		c=s.nextInt();
		System.out.print("네번째 값을 입력하세요===>");
		d=s.nextInt();
		
		
		
		result=a+b+c+d;
		
		System.out.println(result);
		
		
	}

}
