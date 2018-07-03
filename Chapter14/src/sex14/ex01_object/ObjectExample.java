package sex14.ex01_object;

class GoodsStock{
	String goodsCode;
	int stockNum;
	GoodsStock(String goodsCode, int stockNum){
		this.goodsCode=goodsCode;
		this.stockNum=stockNum;
		
	}
	
	
}


public class ObjectExample {

	public static void main(String[] args) {
		GoodsStock obj= new GoodsStock("57293",100);
		String str=obj.toString(); //Object Class
		System.out.println(str);
		

	}

}
