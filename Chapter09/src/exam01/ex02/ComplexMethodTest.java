package exam01.ex02;

import java.util.Scanner;

public class ComplexMethodTest {
	private static Scanner in=new Scanner(System.in);
	
	public static int maxNumber() {
		System.out.print("첫번째 수=");
		int first=in.nextInt();
		System.out.print("두번째 수=");
		int second=in.nextInt();
		if(first > second)
			return first;
		else
			return second;
		
	}
	
	public static void betweenPlus() {
		System.out.println("시작 수=");
		int begin=in.nextInt();
		System.out.println("끝 수=");
		int end=in.nextInt();
		if(end <begin) {
			int imsi=begin;
			begin=end;
			end=imsi;	
		}
		int total=0;
		for(int n=begin;n<=end;++n) {
			total+=n;
		}
		System.out.println(begin+"~"+end+"사이의 합은"+total+"입니다.");
	}
	
	
	public static String arrayNumber(int first,int next,int last) {
		// String result="";
		int imsi=0;
		if(next > first && next > last) {
			imsi=first;
			first=next;
			next=imsi;
			
		}else if(last > first && last > next) {
			imsi=first;
			first=last;
			last=imsi;
		}
		if(last>next) {
			imsi=next;
			next=last;
			last=imsi;
			
		}
		
		return first+">"+next+">"+last;   //전체적인 문자열을 만들어 String으로 return
	}
	
	
	
	public static void main(String[] args) {
		
		int command=0;
		while(true) {
			System.out.print("1.최대수 2.사이합 3.수나열 4.종료=");
			command=in.nextInt();
			switch(command) {
			case 1:
				int max=maxNumber();
				System.out.println("최대수는"+max+"입니다.");
				break;
			case 2:
				betweenPlus();
				break;
			case 3: 
				System.out.print("첫번째 수=");
				int first=in.nextInt();
				System.out.print("두번째 수=");
				int next=in.nextInt();
				System.out.print("세번째 수=");
				int last=in.nextInt();
				String result=arrayNumber(first,next,last);
				System.out.println("수나열은"+result+"입니다.");
				break;
			case 4:
				System.out.println("수고하셨습니다.");
				System.exit(0); //종료
				default:
					System.out.println("절못 입력 하셨습니다.");
			
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
