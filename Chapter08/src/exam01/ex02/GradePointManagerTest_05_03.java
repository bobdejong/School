package exam01.ex02;

import java.util.Scanner;

public class GradePointManagerTest_05_03 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		String[] subjectName= {"국어","영어","수학","과학"};
		int[] subject=new int[subjectName.length+1];
		double avg=0.0;
		
		for(int n=0;n<subjectName.length;++n) {
			do {
				System.out.print(subjectName[n]+"점수=");
				subject[n]=in.nextInt();
			}while(subject[n]<0 || subject[n]>100);
			
		}
		
		
		for(int n=0;n<subjectName.length;++n) {
				
			subject[subjectName.length]+=subject[n];  //배열은 자동 초기화됨
			
		}
		avg=subject[subjectName.length]/(double)subjectName.length;
		
		System.out.printf("총점은 %d이고 평균은 %.2f입니다.",subject[subjectName.length],avg);
		
	}

}
