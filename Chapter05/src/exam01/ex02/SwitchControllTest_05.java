package exam01.ex02;

import java.util.Scanner;

public class SwitchControllTest_05 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		String menu="";  //문자열 초기화는 ""
		double pay=0.0; //돈
		short count=0; //주문수량
		
		System.out.print("주문(짜장면,짬뽕,탕수육)=");
		menu=in.nextLine();
		System.out.print("몇개=");
		count=in.nextShort();
		
		switch(menu) {
		case "짜장면":
			pay=5500*count;
			break;
		case "짬뽕":
			pay=6500*count;
			break;
		case "탕수육":
			pay=11000*count;
			break;
			default:
				System.err.println("메뉴에 없는 항목입니다.");
				System.exit(0);
				//
				//
				
		}
		System.out.println();
		System.out.println("주문한 메뉴는 "+menu+"이고, "+count+"개 주문했습니다." );
		System.out.println("총 금액은 "+pay+"원 입니다.");
	}

}
