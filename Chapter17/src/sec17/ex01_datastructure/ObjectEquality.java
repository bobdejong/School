package sec17.ex01_datastructure;

class IntNumber{
	int num;
	public IntNumber(int num) {
		this.num=num;
	}
	
	public boolean isEquals(Object obj) {
		if(obj instanceof IntNumber) {
			IntNumber intNum=(IntNumber)obj;
			return this.num==intNum.num;
			
		}else 
			return false;
			
		
	}
	
}


public class ObjectEquality {

	public static void main(String[] args) {
		IntNumber num1=new IntNumber(10);
		IntNumber num2=new IntNumber(12);
		IntNumber num3=new IntNumber(10);
		
		if(num1.isEquals(num2)) 
			System.out.println("num1과 num2는 동일한 정수");	
		
		else
			System.out.println("num1과 num2는 다른 정수");
		
		if(num1.isEquals(num3))
			System.out.println("num1과 num3은 동일한 정수");
		
		else
			System.out.println("num1과 num3은 다른 정수");
		
		
		
		
		
		
		
	}

}
