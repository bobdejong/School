package sec08.exam01_method_declaration;

public class CaculatorExample {

	public static void main(String[] args) {
		Calculator mycalc=new Calculator();
		mycalc.powerOn();
		int result1=mycalc.plus(5, 6);
		System.out.println("result1:"+result1);
		
		byte x=10;
		byte y=4;
		double result2=mycalc.divide(x, y);//call by value, byte-->int 자동 형변환
		System.out.println("result2:"+result2);
		
		mycalc.powerOff();
		
		
		
	}

}
