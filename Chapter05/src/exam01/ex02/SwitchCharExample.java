package exam01.ex02;

public class SwitchCharExample {

	public static void main(String[] args) {
		char grade='B';
		
		switch(grade) {
		case 'A':
			System.out.println("��� A");
			break;
		case 'a':
			System.out.println("��� ȸ���Դϴ�.");
			break;
		case 'B':
			System.out.println("�Ϲ� A");
			break;
		case 'b':
			System.out.println("�Ϲ� ȸ���Դϴ�.");
			break;
			default:
				System.out.println("�մ��Դϴ�.");
		
		}

	}

}
