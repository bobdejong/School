package exam01.ex02;

import java.util.Scanner;

public class MultipleGradePointManagerTest_07 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		String[] subjectName= {"국어","영어","수학"};
		int[][] subject=new int[3][subjectName.length+1];  //3행 4열
		double[] avg=new double[3];
		
		for(int m=0;m<3;m++) {
			System.out.println(m+1+"번째 사람 점수 입력!!");
			for(int n=0;n<subjectName.length;n++) {
				do {
					System.out.print(subjectName[n]+"점수");
					subject[m][n]=in.nextInt();
					
				}while(subject[m][n]<0 || subject[m][n]>100);
				
				subject[m][subject[m].length-1]+=subject[m][n];
				
			}
			
			avg[m]=subject[m][subject[m].length-1]/(double)subjectName.length;
			}
		
		System.out.println();
		for(int m=0;m<3;++m) {
			System.out.println(m+1+"번째 사람 점수!");
			System.out.println("총점:"+subject[m][subject[m].length-1]+"점");
			System.out.printf("평균:%.2f점\n",avg[m]);
			
			
		}

	}

}
