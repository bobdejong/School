package exam01.ex02;

import java.util.Scanner;

public class MultipleGradePointManagerTest_07 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		String[] subjectName= {"����","����","����"};
		int[][] subject=new int[3][subjectName.length+1];  //3�� 4��
		double[] avg=new double[3];
		
		for(int m=0;m<3;m++) {
			System.out.println(m+1+"��° ��� ���� �Է�!!");
			for(int n=0;n<subjectName.length;n++) {
				do {
					System.out.print(subjectName[n]+"����");
					subject[m][n]=in.nextInt();
					
				}while(subject[m][n]<0 || subject[m][n]>100);
				
				subject[m][subject[m].length-1]+=subject[m][n];
				
			}
			
			avg[m]=subject[m][subject[m].length-1]/(double)subjectName.length;
			}
		
		System.out.println();
		for(int m=0;m<3;++m) {
			System.out.println(m+1+"��° ��� ����!");
			System.out.println("����:"+subject[m][subject[m].length-1]+"��");
			System.out.printf("���:%.2f��\n",avg[m]);
			
			
		}

	}

}
