	package test10.ex01;

public class FruitSeller {   //과일장수	
	final int APPLE_PRICE=1000;  //final붙이면 수정불가 원래 필드는 수정가능 (기호상수)
	int numOfApple=20;
	int myMoney=0;
	
	public int saleApple(int money) { //과일 판매
		int num=money/APPLE_PRICE;  //판매 개수
		numOfApple-=num;   //재고
		myMoney=myMoney+money;
		
		return num;
		
		
	}

	public void showSaleResult() {
		System.out.println("남은 사과:"+numOfApple);
		System.out.println("판매 수익:"+myMoney);
		
		
	}
	
	
	
	
}
