package exam01.ex02;

import java.util.Scanner;

public class MutipleGradePointManagerTest_07_01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String[] subjectName = { "����", "����", "����" };
		int[][] subject = new int[3][subjectName.length + 2]; // 3�� 5��
		double[] avg = new double[3];

		for (int m = 0; m < 3; m++) {
			System.out.println(m + 1 + "��° ��� ���� �Է�!!");
			for (int n = 0; n < subjectName.length; n++) {
				do {
					System.out.print(subjectName[n] + "����");
					subject[m][n] = in.nextInt();

				} while (subject[m][n] < 0 || subject[m][n] > 100);

				subject[m][subject[m].length - 2] += subject[m][n];

			}
			subject[m][subject[m].length - 1] = 1;
			avg[m] = subject[m][subject[m].length - 2] / (double) subjectName.length;
		}
		
		for(int m=0;m<subject.length;m++) {  //subject.length=3   subject[m].length=5
			for(int n=0;n<subject.length;n++) {
				if(subject[m][subject[m].length-2] < subject[n][subject[n].length-2]) {
					     subject[m][subject[m].length - 1]++;
					
					
				}
				
			}
			
		}
		
		System.out.println();
		for (int m = 0; m < 3; ++m) {
			System.out.println(m + 1 + "��° ��� ����!");
			System.out.println("����:" + subject[m][subject[m].length - 2] + "��");
			System.out.printf("���:%.2f��\n", avg[m]);
			System.out.println("����:"+subject[m][subject[m].length - 1]);
		}

	}

}
