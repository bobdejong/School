package exam01.ex02;

import java.util.Scanner;

public class SwitchControlTest_03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		byte jumin_07 = -1; // ������ �ֹι�ȣ�� ���� ���̹Ƿ� ������ �ʱ�ȭ
		short year = 0; // �¾ ������ ������ ����
		String gender = ""; // ������ ������ ����

		System.out.println("�ֹι�ȣ 7��° �ڸ�=");
		jumin_07 = in.nextByte();
		switch (jumin_07) {
		case 9:
		case 0:
			year = 1800;
			break;
		case 1:
		case 2:
			year = 1900;
			break;
		case 3:
		case 4:
			year = 2000;
			break;
		default:
			year=-1;

		}
		
		if(year !=-1) {
			//���� ������ (����)? ��:����
			gender=(jumin_07 % 2 ==0 )?"����":"����";
			
		}
		System.out.println();
		System.out.println("�����"+year+"��� "+gender+"�Դϴ�.");
		
		
	}

}
