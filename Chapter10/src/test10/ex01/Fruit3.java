package test10.ex01;

public class Fruit3 {

	public static void main(String[] args) {
		FruitSeller seller=new FruitSeller();
		FruitBuyer buyer=new FruitBuyer();
		
		buyer.buyApple(seller, 2000);
		
		System.out.println("���� �Ǹ����� ���� ��Ȳ");
		seller.showSaleResult();
		System.out.println("���� �������� ���� ��Ȳ");
		buyer.showBuyResult();

	}

}
