package exam01.ex02;

import java.util.Scanner;

public class IfControlTest_01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int firstsu = 0, secondsu = 0;

		System.out.println("첫번째 수 = ");
		firstsu = in.nextInt();
		System.out.println("두번째 수 = ");
		secondsu = in.nextInt();

		if (firstsu > secondsu) {

			System.out.println("첫번째 수(" + firstsu + ")");
			System.out.println("가 두번째 수(" + secondsu + ")");
			System.out.println("보다 큰 수 입니다.");
		} else {
			System.out.println("첫번째 수(" + firstsu + ")");
			System.out.println("가 두번째 수(" + secondsu + ")");
			System.out.println("보다 작은 수 입니다.");

		}

	}

}
