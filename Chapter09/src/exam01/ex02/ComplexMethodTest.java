package exam01.ex02;

import java.util.Scanner;

public class ComplexMethodTest {
	private static Scanner in=new Scanner(System.in);
	
	public static int maxNumber() {
		System.out.print("ù��° ��=");
		int first=in.nextInt();
		System.out.print("�ι�° ��=");
		int second=in.nextInt();
		if(first > second)
			return first;
		else
			return second;
		
	}
	
	public static void betweenPlus() {
		System.out.println("���� ��=");
		int begin=in.nextInt();
		System.out.println("�� ��=");
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
		System.out.println(begin+"~"+end+"������ ����"+total+"�Դϴ�.");
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
		
		return first+">"+next+">"+last;   //��ü���� ���ڿ��� ����� String���� return
	}
	
	
	
	public static void main(String[] args) {
		
		int command=0;
		while(true) {
			System.out.print("1.�ִ�� 2.������ 3.������ 4.����=");
			command=in.nextInt();
			switch(command) {
			case 1:
				int max=maxNumber();
				System.out.println("�ִ����"+max+"�Դϴ�.");
				break;
			case 2:
				betweenPlus();
				break;
			case 3: 
				System.out.print("ù��° ��=");
				int first=in.nextInt();
				System.out.print("�ι�° ��=");
				int next=in.nextInt();
				System.out.print("����° ��=");
				int last=in.nextInt();
				String result=arrayNumber(first,next,last);
				System.out.println("��������"+result+"�Դϴ�.");
				break;
			case 4:
				System.out.println("�����ϼ̽��ϴ�.");
				System.exit(0); //����
				default:
					System.out.println("���� �Է� �ϼ̽��ϴ�.");
			
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
