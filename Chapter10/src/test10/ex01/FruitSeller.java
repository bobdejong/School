	package test10.ex01;

public class FruitSeller {   //�������	
	final int APPLE_PRICE=1000;  //final���̸� �����Ұ� ���� �ʵ�� �������� (��ȣ���)
	int numOfApple=20;
	int myMoney=0;
	
	public int saleApple(int money) { //���� �Ǹ�
		int num=money/APPLE_PRICE;  //�Ǹ� ����
		numOfApple-=num;   //���
		myMoney=myMoney+money;
		
		return num;
		
		
	}

	public void showSaleResult() {
		System.out.println("���� ���:"+numOfApple);
		System.out.println("�Ǹ� ����:"+myMoney);
		
		
	}
	
	
	
	
}
