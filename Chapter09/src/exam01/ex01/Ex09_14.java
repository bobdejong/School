package exam01.ex01;

import java.util.Scanner;

public class Ex09_14 {

	static int calc(int v1,int v2,int op) {
			int result=0;  //case 에서 1~4번이 안눌리면 반환할 값이 없어서 미리 0값을 주거나
							//default에서 0의 값을 주어야함
			
			switch(op) {
			case 1:
				result=v1+v2;
				break;
			case 2:
				result=v1-v2;
				break;
			case 3:
				result=v1*v2;
				break;
			case 4:
				result=v1/v2;
				break;
			default:
				System.out.println("잘못 입력했습니다.");
				break;
			}
		
			return result;
			
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int res;
		int oper,a,b;
		
		System.out.printf("계산 입력(1:+,2:-,3:*,4:/):");
		oper=s.nextInt();
		
		System.out.printf("첫번째 숫자를 입력:");
		a=s.nextInt();
		
		System.out.printf("두번째 숫자를 입력:");
		b=s.nextInt();
		
		res=calc(a,b,oper);
		
		System.out.printf("계산 결과는 :%d\n",res);
		
		
		
	}

}
