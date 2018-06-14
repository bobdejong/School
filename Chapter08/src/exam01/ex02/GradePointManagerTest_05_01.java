package exam01.ex02;

import java.util.Scanner;

public class GradePointManagerTest_05_01 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int[] subject=new int[4];
		double avg=0.0;
		
		do {
			System.out.print("국어점수=");
			subject[0]=in.nextInt();
		}while(subject[0]<0 || subject[0]>100);
		
		do {
			System.out.print("영어점수=");
			subject[1]=in.nextInt();
		}while(subject[1]<0 || subject[0]>100);
		
		do {
			System.out.print("수학점수=");
			subject[2]=in.nextInt();
		}while(subject[2]<0 || subject[0]>100);
		
		subject[3]=subject[0]+subject[1]+subject[2];
		avg=subject[3]/3.0;
		
		System.out.println();
		System.out.println("총점:"+subject[3]+"점");
		System.out.printf("평균:%.2f점",avg);
		
		

	}

}
