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
		String str="��ǰ�ڵ�"+goodsCode+"������"+stockNum;
		return str;
	}
	
	
}


public class ObjectExample {

	public static void main(String[] args) {
		GoodsStock obj= new GoodsStock("57293",100);
		//String str=obj.toString(); //Object Class
		String str="�������"+obj;
		
		System.out.println(str);
		System.out.println(obj);

	}

}
