package exam01.ex02;

import java.util.Scanner;

public class SwitchControllTest_05 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		String menu="";  //���ڿ� �ʱ�ȭ�� ""
		double pay=0.0; //��
		short count=0; //�ֹ�����
		
		System.out.print("�ֹ�(¥���,«��,������)=");
		menu=in.nextLine();
		System.out.print("�=");
		count=in.nextShort();
		
		switch(menu) {
		case "¥���":
			pay=5500*count;
			break;
		case "«��":
			pay=6500*count;
			break;
		case "������":
			pay=11000*count;
			break;
			default:
				System.err.println("�޴��� ���� �׸��Դϴ�.");
				System.exit(0);
				//
				//
				
		}
		System.out.println();
		System.out.println("�ֹ��� �޴��� "+menu+"�̰�, "+count+"�� �ֹ��߽��ϴ�." );
		System.out.println("�� �ݾ��� "+pay+"�� �Դϴ�.");
	}

}
