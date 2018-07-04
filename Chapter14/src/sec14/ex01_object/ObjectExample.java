package sec14.ex01_object;

class GoodsStock{
	String goodsCode;
	int stockNum;
	GoodsStock(String goodsCode, int stockNum){
		this.goodsCode=goodsCode;
		this.stockNum=stockNum;
		
	}
	
	@Override
	public String toString() {  //Overriding
		String str="상품코드"+goodsCode+"재고수량"+stockNum;
		return str;
	}
	
	
}


public class ObjectExample {

	public static void main(String[] args) {
		GoodsStock obj= new GoodsStock("57293",100);
		//String str=obj.toString(); //Object Class
		String str="재고정보"+obj;
		
		System.out.println(str);
		System.out.println(obj);

	}

}
