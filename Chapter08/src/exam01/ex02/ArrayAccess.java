package exam01.ex02;

import java.util.Scanner;

//���� 5���� �Է� �޾� �迭�� �����ϰ� ���� ū���� ����ϴ� ���α׷�

public class ArrayAccess {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] intArray = new int[5];
		int max = 0;

		// for, if

		for (int i = 0; i < 5; ++i) {
			intArray[i] = s.nextInt();
			if (intArray[i] > max)
				max = intArray[i];

		}

		System.out.println("�Էµ� ������ ���� ū����" + max + "�Դϴ�.");

	}

}
