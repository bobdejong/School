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
		}catch(ArrayIndexOutOfBoundsException e) {  //Exception���� �ϸ� Exception�� �Ʒ��ִ�  NumberFormatException����
			System.out.println("���� �Ű����� ���� �����մϴ�."); //���⼭ ó���ϰ� �Ǿ ���� �߻� Exception�� ������ �Ǹ������� �������
			System.out.println("[���� ���]");
			System.out.println("java TryCatchFinallyRuntimExceptionExample"+"num1 num2");
			
		}catch(NumberFormatException e) {
			
			System.out.println("���ڷ� ��ȯ�� �� �����ϴ�.");
		}finally {
			System.out.println("�ٽ� �����ϼ���");
		}

	}

}
