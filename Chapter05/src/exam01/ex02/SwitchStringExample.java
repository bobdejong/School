package exam01.ex02;

public class SwitchStringExample {

	public static void main(String[] args) {
		String position="����";
				
				switch(position) {
				
				case "����":  //version 7.0���� ���ڿ� ����
					System.out.println("700����");
					break;
				case "����":
					System.out.println("500����");
					break;
					default:
						System.out.println("300����");
				
				}

	}

}
