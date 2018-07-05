package sec03_try_catch_finally;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		try {
		Class clazz=Class.forName("java.lang.String");
		}catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
		
		finally {  //예외가 발생하든 안하든 무조건 실행 (생략가능)
			System.out.println("존재합니다");
		}
	}

}
