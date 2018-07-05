package sec16.ex01_exception;

public class ExceptionExample3 {

	public static void main(String[] args) {
		try {
			int result=add(1,-2);
			System.out.println(result);
		}catch(Exception e) {
			System.err.println("에러 발생");
			e.printStackTrace();
		}

	}
	
	public static int add(int a, int b)throws Exception {
		int result=a+b;
		if(result<0)
			throw new Exception("에러 발생합니다");
		return result;
	}

}
