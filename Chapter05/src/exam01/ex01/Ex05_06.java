package exam01.ex01;
import java.util.Scanner;

public class Ex05_06 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a; //입력 받은 값 저장
		
		System.out.println("정수를 입력하세요:");
		
		a=s.nextInt();
		
		if(a%2 ==0) {
			System.out.println("짝수를 입력했군요");
			
		}
		else {
			System.out.println("홀수를 입력했군요");
			
		}
		

	}

}
