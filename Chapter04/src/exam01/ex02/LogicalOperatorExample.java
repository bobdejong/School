package exam01.ex02;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		int charCode='A'; //65
		
		if((charCode >= 65) & (charCode <= 90)) {  //&�� ���� �� ��
			System.out.println("�빮�� �̱���");
		}
		if((charCode >= 97) && (charCode <=122)) {  //&&�� �̹� �տ��� �����̸� �ڿ����� ����
			
			System.out.println("�ҹ��� �̱���");
			
		}
		if(!(charCode<48) && !(charCode >57)) {
			System.out.println("0~9���� �̱���");
			
		}
		
		int value=6;
		
		if ((value % 2==0)|(value=value+2)% 3==0) {
			System.out.println("2�Ǵ� 3�� ��� �̱���");
			System.out.println(value);
			
		}
		if((value %2 ==0)||(value=value+11)% 3==0) {  //�տ��� ���̸� �ڿ��� ����
			System.out.println("2�Ǵ� 3�� ��� �̱���");
			System.out.println(value);
		}
				
	}

}
