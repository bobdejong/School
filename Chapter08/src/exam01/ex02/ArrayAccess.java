package exam01.ex02;

import java.util.Scanner;

//정수 5개를 입력 받아 배열에 저장하고 제일 큰수를 출력하는 프로그램

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

		System.out.println("입력된 수에서 가장 큰수는" + max + "입니다.");

	}

}
