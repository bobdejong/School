package sec08.exam04_overloading;

public class CaculatorExample {

	public static void main(String[] args) {
		Calculator myCalc=new Calculator();
		
		double result1=myCalc.areaRetangle(10);
		
		double result2=myCalc.areaRetangle(10,20);
		
		System.out.println("���簢�� ����="+result1);

		System.out.println("���簢�� ����="+result2);
	}

}
