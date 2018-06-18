package exam01.ex01;

import java.util.Scanner;

public class problem_24 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String in,out="";
		char ch;
		int count,i;
		int diff='a'-'A'; //97-65 ==>32
		
		System.out.printf("문자열을 입력하세요:");
		in=s.nextLine();
		
		count=in.length();
		
		for(i=0;i<count;i++) {
			ch=in.charAt(i);
			if(('A'<=ch) && (ch<='Z')) //대문자냐?
				out+=(char)(ch+diff);  //대문자를 소문자로 바꿔라
			else if(('a'<=ch) && (ch<='z'))  //소문자냐?
				out+=(char)(ch-diff);  //대문자로 바꿔라
			else
				out+=(char)ch; //대문자도 소문자도 아니면 그냥 처리
		}
			
		
		System.out.printf("변환된 문자열==>%s\n",out);
		

	}

}
