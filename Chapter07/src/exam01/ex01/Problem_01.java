package exam01.ex01;

import java.util.Scanner;

public class Problem_01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int start, end;
		int basu, i;
		int hap = 0;

		System.out.print("�հ��� ���۰�==>");
		start = s.nextInt();
		System.out.print("�հ��� ����==>");
		end = s.nextInt();
		System.out.print("���==>");
		basu = s.nextInt();

		i = start;
		while (i <= end) {

			if (i % basu == 0) 
				hap += i;

			i++;

		}

		System.out.printf("%d���� %d���� %d����� �հ�==>%d\n", start, end, basu, hap);

	}

}