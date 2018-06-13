package exam01.ex02;

import java.util.Scanner;

public class WhileControlTest_08 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int kor=0,eng=0,math=0,total=0;
		double avg=0.0;
		char grade='\0'; //null(0)
		
		while(true) {
			System.out.print("국어=");
			kor=in.nextInt();
			if(kor>=0 && kor<=100)
				break;
			else
				System.out.println("0~100점 사이로 입력하세요");
			
				
		}
		
		do {			
			System.out.println("영어=");
			eng=in.nextInt();
			
		}while(eng <0 || eng>100);
		do {			
			System.out.println("수학=");
			math=in.nextInt();
			
		}while(math <0 || math>100);
		
		total=kor+eng+math;
		avg=total/3.0;
		
		switch((int)(avg/10)) {
		case 10:
			
		case 9:
			grade='A';
			break;
		case 8:
			grade='B';
			break;
		case 7:
			grade='C';
			break;
		case 6:
			grade='D';
			break;
		default :
			grade='F';
			break;
			
		
		}
		System.out.println();
		System.out.printf("총점은 %d점이고, 평균은 %1.2f점입니다.\n",total,avg);
		System.out.println("따라서 학점은 "+grade+"학점입니다.");
		
	}

}
