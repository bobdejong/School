package exam01.ex02;

import java.util.Scanner;

public class GradePointManagerTest_05_03 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		String[] subjectName= {"����","����","����","����"};
		int[] subject=new int[subjectName.length+1];
		double avg=0.0;
		
		for(int n=0;n<subjectName.length;++n) {
			do {
				System.out.print(subjectName[n]+"����=");
				subject[n]=in.nextInt();
			}while(subject[n]<0 || subject[n]>100);
			
		}
		
		
		for(int n=0;n<subjectName.length;++n) {
				
			subject[subjectName.length]+=subject[n];  //�迭�� �ڵ� �ʱ�ȭ��
			
		}
		avg=subject[subjectName.length]/(double)subjectName.length;
		
		System.out.printf("������ %d�̰� ����� %.2f�Դϴ�.",subject[subjectName.length],avg);
		
	}

}
