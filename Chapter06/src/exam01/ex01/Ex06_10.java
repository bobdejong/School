package exam01.ex01;

import java.util.Scanner;

public class Ex06_10 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int hap=0;
		int i;
		int num1,num2,num3;
		
		System.out.print("���۰� �Է�:"); //num1
		num1=s.nextInt();
		System.out.print("���� �Է�:"); //num2
		num2=s.nextInt();
		System.out.print("������ �Է�:"); //num3
		num3=s.nextInt();
		
		for(i=num1;i<=num2;i+=num3) {
			
			hap=hap+i;
			
		}
		System.out.printf("%d���� %d���� %d�� �������� ���� %d�Դϴ�.",num1,num2,num3,hap);

	}

}
