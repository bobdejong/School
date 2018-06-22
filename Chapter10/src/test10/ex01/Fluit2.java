package test10.ex01;

import java.util.Scanner;

public class Fluit2 {

	public static void main(String[] args) {
		FruitSeller seller=new FruitSeller();
		FruitBuyer buyer=new FruitBuyer();
		Scanner s=new Scanner(System.in);
		int numOfApple;
		int appleMoney;
		
		
		while(buyer.myMoney >0) {
			
			System.out.println("사과 몇개 구매 할래?");
			numOfApple=s.nextInt();
			appleMoney=numOfApple*1000;
			
			if(appleMoney <= buyer.myMoney ) {
			System.out.println("판매자");
			seller.saleApple(appleMoney);
			seller.showSaleResult();
			
			System.out.println();
			
			System.out.println("구매자");
			buyer.buyApple(seller, appleMoney);
			buyer.showBuyResult();
			}
						
			else if (buyer.myMoney != 0) {
			
				System.out.println("돈이 모자랍니다.");
				continue;
			}
			
			else break;
			
			
			
		}
		
		System.out.println("돈이 없습니다.");
		
		
		
		

	}

}
