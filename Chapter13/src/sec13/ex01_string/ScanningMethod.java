package sec13.ex01_string;

import java.util.Scanner;

public class ScanningMethod {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		System.out.println("����� �̸���?");
		String str=keyboard.nextLine();  //���ڿ�
		
		System.out.println("�ȳ��ϼ��� "+str+"��");
		System.out.println("����� ���İ�Ƽ�� �����Ѵٴµ�, ����Դϱ�?");
		boolean isTrue=keyboard.nextBoolean(); //true false
		if(isTrue==true)
			System.out.println("�� �����ϴ±���");
		else
			System.out.println("�̷� �ƴϿ�����");
		System.out.println("��Ű� ������ Ű�� ��� �ǳ���?");
		double num1=keyboard.nextDouble();
		double num2=keyboard.nextDouble();
		double diff=num1-num2;
		if(diff>0)
			System.out.println("�����"+diff+"��ŭ ũ����");
		else
			System.out.println("�����"+diff+"��ŭ �۱���");
		
		System.out.println(keyboard);
	}

}
