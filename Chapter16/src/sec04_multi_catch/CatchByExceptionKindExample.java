package sec04_multi_catch;

public class CatchByExceptionKindExample {

	public static void main(String[] args) {
		try {
			String data1=args[0];
			String data2=args[2];
			int value1=Integer.parseInt(data1);
			int value2=Integer.parseInt(data2);
			int result=value1+value2;
			System.out.println(data1+"+"+data2+"="+result);
		}catch(ArrayIndexOutOfBoundsException e) {  //Exception으로 하면 Exception이 아래있는  NumberFormatException까지
			System.out.println("실행 매개값의 수가 부족합니다."); //여기서 처리하게 되어서 오류 발생 Exception을 쓰려면 맨마지막에 써줘야함
			System.out.println("[실행 방법]");
			System.out.println("java TryCatchFinallyRuntimExceptionExample"+"num1 num2");
			
		}catch(NumberFormatException e) {
			
			System.out.println("숫자로 변환할 수 없습니다.");
		}finally {
			System.out.println("다시 실행하세요");
		}

	}

}
