package exam01.ex01;

import java.util.Scanner;

public class Ex06_09 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int hap=0;
		int i;
		int num;
		
		System.out.print("값 입력:");
		num=s.nextInt();
		
		for(i=1;i<=num;i++) {
			hap=hap+i;
			
		}
		
		System.out.printf("1부터 %d까지의 합은 %d입니다.",num,hap);

	}

}
