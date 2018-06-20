package test10.ex01;

  class Number{   //하나의 파일에 여러 클래스를 만들때는 main클래스만 public을 가짐
	  int num=0;
	  
	  public void addNum(int n) {
		  num+=n;
		  
	  }
	  
	  public int getNumber() {
		  return num;
		  
	  }
	  
  }






public class PassInstance {

	public static void main(String[] args) {
		Number nInst=new Number();
		System.out.println("메소드 호출 전:"+nInst.getNumber());
		
		simpleMethod(nInst);		
		System.out.println("메소드 호출 후:"+nInst.getNumber());	
		
	}

	public static void simpleMethod(Number numb) {
		numb.addNum(12);
		
	}
	
	
	
	
	
}
