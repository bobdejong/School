package sec16.ex01_exception;

class InvalidInputException extends Exception{
	InvalidInputException(){
		super("잘못된 입력입니다.");
	}
}

public class ExceptionExample11 {

	public static void main(String[] args) {
		try {
			int result=subtract(5,100);
			System.out.println(result);
		}catch(InvalidInputException e) {
			System.out.println(e.getMessage());
		}

	}
	public static int subtract(int a,int b)throws InvalidInputException{
		if(a<b)
			throw new InvalidInputException();
		return a-b;
	} 

}
