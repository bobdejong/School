package sec08.exam03_method;

public class Calculator {
	
		int plus(int x,int y) {
			int result=x+y;
			return result;
			
			
			
		}

		double avg(int x, int y) {  //10 20
			double sum=plus(x,y);
			double result=sum/2;
			return result;
			
		}
		
		void execute() {
			double result=avg(7,10);
			println("������"+result);  //+:����: ���ڿ�
			
		}
		
		void println(String message) { //void ��ȯ���� ����.       �޼ҵ�� ���� ȣ���� �����ϴ�.
			System.out.println(message);
			
			
		}
	

}
