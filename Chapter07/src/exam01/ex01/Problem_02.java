package exam01.ex01;

import java.util.Scanner;

public class Problem_02 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str;
		char ch;
		int upper_cnt=0,lower_cnt=0,digit_cnt=0;
		int i;
		
		System.out.println("���ڿ��� �Է�");
		str=s.nextLine();//ABcd12FFd89
		
		i=0;
		do {
			ch=str.charAt(i);
			if(ch>='A' && ch<='Z' )//�빮�� 
				upper_cnt++;
				
			if(ch>='a' && ch<='z')//�ҹ���
				lower_cnt++;
			if(ch>='0' && ch<='9')//����
				digit_cnt++;
			
			i++;
			
		}while(i<str.length());
		System.out.printf("�빮�� %d��, �ҹ��� %d��, ���� %d��\n",upper_cnt,lower_cnt,digit_cnt);
		
	}

}
