package test10.ex01;

public class FruitBuyer { //me
	int myMoney=5000;  //����
	int numOfApple=0;  //���� ����
	
	
	public void buyApple(FruitSeller seller, int money) {
		numOfApple+=seller.saleApple(money);
		myMoney-=money;  //
		
	} //��������
	
	public void showBuyResult() {  //����
		System.out.println("���� �ܾ�:"+myMoney);
		System.out.println("��� ����:"+numOfApple);
		
		
	}

}
