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
			
			System.out.println("��� � ���� �ҷ�?");
			numOfApple=s.nextInt();
			appleMoney=numOfApple*1000;
			
			if(appleMoney <= buyer.myMoney ) {
			System.out.println("�Ǹ���");
			seller.saleApple(appleMoney);
			seller.showSaleResult();
			
			System.out.println();
			
			System.out.println("������");
			buyer.buyApple(seller, appleMoney);
			buyer.showBuyResult();
			}
						
			else if (buyer.myMoney != 0) {
			
				System.out.println("���� ���ڶ��ϴ�.");
				continue;
			}
			
			else break;
			
			
			
		}
		
		System.out.println("���� �����ϴ�.");
		
		
		
		

	}

}
