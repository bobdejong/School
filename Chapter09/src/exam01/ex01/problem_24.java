package exam01.ex01;

import java.util.Scanner;

public class problem_24 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String in,out="";
		char ch;
		int count,i;
		int diff='a'-'A'; //97-65 ==>32
		
		System.out.printf("���ڿ��� �Է��ϼ���:");
		in=s.nextLine();
		
		count=in.length();
		
		for(i=0;i<count;i++) {
			ch=in.charAt(i);
			if(('A'<=ch) && (ch<='Z')) //�빮�ڳ�?
				out+=(char)(ch+diff);  //�빮�ڸ� �ҹ��ڷ� �ٲ��
			else if(('a'<=ch) && (ch<='z'))  //�ҹ��ڳ�?
				out+=(char)(ch-diff);  //�빮�ڷ� �ٲ��
			else
				out+=(char)ch; //�빮�ڵ� �ҹ��ڵ� �ƴϸ� �׳� ó��
		}
			
		
		System.out.printf("��ȯ�� ���ڿ�==>%s\n",out);
		

	}

}
