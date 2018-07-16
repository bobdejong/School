package sec19.ex02_nestedclass;

import java.util.ArrayList;



class Cart{
	ArrayList<Item> list=new ArrayList<Item>();
	
	void addItem(String name,int num,int unitPrice) {
		list.add(new Item(name,num,unitPrice));
	}
	
	void remoneItem(int index) {
		list.remove(index);
	}
	
	int getItemNum() {
		return list.size();
	}
	Item getItem(int index) {
		return list.get(index);
	}
	int getTotalPrice() {
		int total=0;
		for(Item item:list)
			total+=item.getPrice();
		return total;
	}
	
	void changeItemNumber(int index,int num) {
		Item item=list.get(index);
		item.num=num;
	}
	class Item{  //상품 항목 클래스
		String name;
		int num;
		int unitPrice;
		Item(String name,int num,int unitPrice){
			this.name=name;
			this.num=num;
			this.unitPrice=unitPrice;
		}
		int getPrice() {
			return num*unitPrice;
			
		}
		
		
	}
	
}



public class NestedClassExample2 {

	public static void main(String[] args) {
		Cart cart=new Cart();
		cart.addItem("초콜릿", 3, 1000);
		cart.addItem("케이크", 1, 25000);
		cart.addItem("샴페인", 1, 7000);
		Cart.Item cart2=cart.new Item("꽃다발",1,50000);
		//Cart.Item cart3=new Cart.Item("꽃다발",1,50000);
		cart.list.add(cart2);
		printCart(cart);

	}
	
	static void printCart(Cart cart) {
		int num=cart.getItemNum();
		System.out.println("    상품명 수량 단가 금액");
		System.out.println("---------------------");
		
		for(int cnt=0;cnt<num;cnt++) {
			Cart.Item item = cart.getItem(cnt);
			System.out.printf("%3d%5s%5d%7d%7d%n",cnt+1,item.name,item.num,item.unitPrice,item.getPrice());
		}
		System.out.println("----------------------");
		System.out.printf("      총계           %10d%n",cart.getTotalPrice());
		
	}

}
