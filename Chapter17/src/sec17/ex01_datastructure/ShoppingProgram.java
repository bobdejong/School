package sec17.ex01_datastructure;

import java.util.Iterator;
import java.util.LinkedList;

class CartItem {
	String code; // ��ǰ�ڵ� "50001"
	int num; // ���� 2
	int price; // �ܰ�

	CartItem(String code, int num, int price) {
		this.code = code;
		this.num = num;
		this.price = price;

	}

}

public class ShoppingProgram {
	// 3��
	public static void main(String[] args) {
		LinkedList<CartItem> list = new LinkedList<CartItem>();
		list.add(new CartItem("50001", 2, 2000));
		list.add(new CartItem("50002", 1, 7000));
		list.add(new CartItem("50003", 3, 22000));
		System.out.println("��ǰ�ڵ� ���� ����");
		System.out.println("------------------------");
		
		
		for (CartItem item : list) {
			System.out.printf("%5s %8d %8d %n",item.code,item.num,item.price);
		}

		
		list.remove(1);
		
		System.out.println("��ǰ�ڵ� ���� ����");
		System.out.println("------------------------");
		
		for (CartItem item : list) {
			System.out.printf("%5s %8d %8d %n",item.code,item.num,item.price);
		}
		
		
	}

}
















