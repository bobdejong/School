package exam01.ex02;

import java.util.Scanner;

public class IfControlTest_01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int firstsu = 0, secondsu = 0;

		System.out.println("ù��° �� = ");
		firstsu = in.nextInt();
		System.out.println("�ι�° �� = ");
		secondsu = in.nextInt();

		if (firstsu > secondsu) {

			System.out.println("ù��° ��(" + firstsu + ")");
			System.out.println("�� �ι�° ��(" + secondsu + ")");
			System.out.println("���� ū �� �Դϴ�.");
		} else {
			System.out.println("ù��° ��(" + firstsu + ")");
			System.out.println("�� �ι�° ��(" + secondsu + ")");
			System.out.println("���� ���� �� �Դϴ�.");

		}

	}

}
