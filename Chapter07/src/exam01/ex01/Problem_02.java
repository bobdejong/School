package exam01.ex01;

import java.util.Scanner;

public class Problem_02 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str;
		char ch;
		int upper_cnt=0,lower_cnt=0,digit_cnt=0;
		int i;
		
		System.out.println("문자열을 입력");
		str=s.nextLine();//ABcd12FFd89
		
		i=0;
		do {
			ch=str.charAt(i);
			if(ch>='A' && ch<='Z' )//대문자 
				upper_cnt++;
				
			if(ch>='a' && ch<='z')//소문자
				lower_cnt++;
			if(ch>='0' && ch<='9')//숫자
				digit_cnt++;
			
			i++;
			
		}while(i<str.length());
		System.out.printf("대문자 %d개, 소문자 %d개, 숫자 %d개\n",upper_cnt,lower_cnt,digit_cnt);
		
	}

}
