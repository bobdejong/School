package test10.ex01;

public class FruitBuyer { //me
	int myMoney=5000;  //현금
	int numOfApple=0;  //소유 과일
	
	
	public void buyApple(FruitSeller seller, int money) {
		numOfApple+=seller.saleApple(money);
		myMoney-=money;  //
		
	} //구매행위
	
	public void showBuyResult() {  //보고서
		System.out.println("현재 잔액:"+myMoney);
		System.out.println("사과 개수:"+numOfApple);
		
		
	}

}
