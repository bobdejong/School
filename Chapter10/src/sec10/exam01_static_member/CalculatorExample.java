package sec10.exam01_static_member;

public class CalculatorExample {

	public static void main(String[] args) {
		double result1=10*10*Calculator.pi;
		int result2=Calculator.plus(10,5);
		int result3=Calculator.minus(10, 5);
		
		//	Calculator myCalc=new Calculator();
		//	double result4=10*10*Calculator.pi;
		Calculator myCalc2=new Calculator();
		double result4=14*10*myCalc2.pi;
		int result5=myCalc2.plus(20,10);
		int result6=myCalc2.minus(20, 10);
		

		System.out.println("result1:"+result1);
		System.out.println("result2:"+result2);
		System.out.println("result3:"+result3);
		System.out.println("result4:"+result4);
		System.out.println("result5:"+result5);
		System.out.println("result6:"+result6);
	}

}
