package exam01.ex02;

import java.util.Scanner;

public class ForControlTest_06 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int begin=0,end=0,total=0;
		int imsi=0; //���� ���� ������ ������ Ŭ ��� �� ���� ��ȯ�ϱ� ���ؼ� �ʿ�
		
		System.out.print("���� ��=");
		begin=in.nextInt();
		
		System.out.print("������ ��=");
		end=in.nextInt();
		
		if(begin > end) {
			 imsi=begin;
			 begin = end;
			 end = imsi;
			
		}
		
		for(int i=begin;i<=end;i++) {
			
			total+=i;
		}
		
		System.out.println(begin+"����"+end+"������ ���� "+total+"�Դϴ�.");

	}

}
