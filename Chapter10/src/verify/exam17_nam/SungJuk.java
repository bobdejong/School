package verify.exam17_nam;

import java.text.DecimalFormat;
import java.util.Scanner;

class Student{
	int korean;
	int english;
	int math;
	
	Student(){
		
	}
	
	int getTotal() {

		return korean+english+math;
	}
	
	double getAverage() {
		 
		return getTotal()/3.0;
	}
	
	public String toString() {
		DecimalFormat dcf=new DecimalFormat("#.##");
		
		return korean+"  "+english+"  "+math+"   "+getTotal()+"  "+dcf.format(getAverage());
	}
	
	
}

public class SungJuk {

	public static void main(String[] args) {
		Student stu1=new Student();
		Student stu2=new Student();
		Student stu3=new Student();
		
		Student[] array= {stu1,stu2,stu3};
		Scanner scan=new Scanner(System.in);
		
		int koreanTotal=0;
		int englishTotal=0;
		int mathTotal=0;
		
		/*stu1.korean=scan.nextInt();
		stu1.english=scan.nextInt();
		stu1.math=scan.nextInt();
		
		stu2.korean=scan.nextInt();
		stu2.english=scan.nextInt();
		stu2.math=scan.nextInt();
		
		stu3.korean=scan.nextInt();
		stu3.english=scan.nextInt();
		stu3.math=scan.nextInt();*/
		
		for(int i=0;i<array.length;i++) {
			System.out.print("국어점수=");
			array[i].korean=scan.nextInt();
			System.out.print("영어점수=");
			array[i].english=scan.nextInt();
			System.out.print("수학점수=");
			array[i].math=scan.nextInt();
			
		}
		for(int i=0;i<array.length;i++) {
			koreanTotal+=array[i].korean;
			englishTotal+=array[i].english;
			mathTotal+=array[i].math;
					
		}
		
		System.out.println("번호 국어 영어 수학 총점 평균");
		System.out.println("========================");
		
		for(int i=0;i<array.length;i++) {
			/*System.out.printf("stu%d%3d %3d %3d %3d %3.1f\n",i+1,array[i].korean,array[i].english,
								array[i].math,array[i].getTotal(),array[i].getAverage() );*/
			
			System.out.println(" "+(i+1)+"  "+array[i]);
			
			
		}
		
		System.out.println("========================");
		System.out.println("총점:"+koreanTotal+" "+englishTotal+" "+mathTotal);
		
	}

}
