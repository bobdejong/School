package exam01.ex02;

import java.util.Scanner;

public class ScannerInputTest_11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String name;
		int age;
		
		System.out.print("�̸�?");
		name=sc.next(); // ���� ����  ȫ �浿�ϸ� ȫ�� �Է¹ް� �浿�� age���� ���� nextLine��� ����ᵵ ������
		
		System.out.print("����?");
		age=sc.nextInt();
		
		System.out.println(name+":"+age);

	}

}
