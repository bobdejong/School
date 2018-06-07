package exam01.ex01;

import java.util.Scanner;

public class Ex02_02 {

	public static void main(String[] args) {
		//int a,b;
		int a;  // int : 정수(4byte)
		int b;
		int result;
		
		Scanner s = new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		result=a+b;
		
		System.out.println(a+"+"+b+"="+result);
		
		result=a+b;
		System.out.println(a+"+"+b+"="+result); // 주석 + 연결
		
		result=a-b;
		System.out.println(a+"-"+b+"="+result); 
		
		result=a*b;
		System.out.println(a+"*"+b+"="+result);
		
		result=a/b;
		System.out.println(a+"/"+b+"="+result);
		
	
	}
	
}
