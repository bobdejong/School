package test10.ex01;

class Accumulator{
	int total=0;
	static int grandTotal=0;
	
	void accumulator(int amount) {
		total+=amount;
		grandTotal+=amount;
	}
	
	static int getGrandTotal() {
		return grandTotal;
	}
	
}

public class StaticMethodExample {

	public static void main(String[] args) {
		Accumulator obj1=new Accumulator();
		Accumulator obj2=new Accumulator();
		
		obj1.accumulator(10);
		obj2.accumulator(20);
		
		int grandTotal=Accumulator.getGrandTotal();
		
		System.out.println("obj1.total="+obj1.total);
		System.out.println("obj2.total="+obj2.total);
		System.out.println("ÃÑ°è");
		
		
	}

}
