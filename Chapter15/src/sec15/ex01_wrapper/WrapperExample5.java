package sec15.ex01_wrapper;

public class WrapperExample5 {

	public static void main(String[] args) {
		printDouble(new Double(123.45));
		printDouble(123.4544);  //auto Boxing

	}
	
	public static void printDouble(Double obj) {
		
		System.out.println(obj);
	}

}
