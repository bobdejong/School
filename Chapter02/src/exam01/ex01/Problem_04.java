package exam01.ex01;

import java.io.IOException;
import java.util.Scanner;

public class Problem_04 {

	public static void main(String[] args) throws IOException {
		int a,b;
		int result;
		char k;
		
		Scanner s=new Scanner(System.in);
		System.out.println("첫번째 계산할 값을 입력하세요==>");
		a=s.nextInt();
		System.out.println("+-*/%==>");
		k=(char)System.in.read();
		System.out.println("두번째 계산할 값을 입력하세요==>");
		b=s.nextInt();
		
		if(k=='+') {
			result=a+b;
			System.out.println(a+"+"+b+"="+result);
			
			
		}
		if(k=='-') {
			result=a-b;
			System.out.println(a+"-"+b+"="+result);
			
			
		}
		if(k=='*') {
			result=a*b;
			System.out.println(a+"*"+b+"="+result);
			
			
		}
		if(k=='/') {
			if(b !=0) {
			result=a/b;
			System.out.println(a+"/"+b+"="+result);
			}else
				System.out.println("0으로 나누면 안됩니다.");
			
		}
		if(k=='%') {
			if(b !=0) {
				result=a%b;
				System.out.println(a+"%"+b+"="+result);
				}else
					System.out.println("0으로 나누면 나머지 값이 안됩니다.");
				
		}
		
	}

}
