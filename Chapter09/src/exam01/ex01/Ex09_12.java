package exam01.ex01;

import java.util.Scanner;

public class Ex09_12 {
	//�Ű������� �ܺηκ��� ���� ���� �޴´�.
	//�޼ҵ�� ȣ������ ������ ���� ���Ѵ�.
	static int coffee_machine(int button) { //   ��ȯ�ڷ���method��(�Ű�����){    }
		System.out.printf("#1.(�ڵ�����)�߰ſ� ���� �غ��Ѵ�.\n");
		System.out.printf("#2.(�ڵ�����)�������� �غ��Ѵ�.\n");
		
		switch(button) {
		case 1:
			System.out.println("#3.(�ڵ�����)����Ŀ�Ǹ� ź��.");
			break;
		case 2:
			System.out.println("#3.(�ڵ�����)����Ŀ�Ǹ� ź��.");
			break;
		case 3:
			System.out.println("#3.(�ڵ�����)����Ŀ�Ǹ� ź��.");
			break;
			default:
				System.out.println("#3.(�ڵ�����)�ƹ��ų� ź��.");
				break;
			
		}
		
		System.out.println("#4.(�ڵ�����)���� �״´�.");
		System.out.println("#5.(�ڵ�����)��Ǭ���� ��� ���δ�.");
		
		return 0;
		
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int coffee;
		int ret;
		
		System.out.println("A��,� Ŀ�� �帱���?(1:����,2:����,3:����)");
		coffee=s.nextInt();
		ret=coffee_machine(coffee);
		System.out.println("A�� �մ�~Ŀ�� ���� �ֽ��ϴ�.\n");
		
		System.out.println("B��,� Ŀ�� �帱���?(1:����,2:����,3:����)");
		coffee=s.nextInt();
		ret=coffee_machine(coffee);
		System.out.println("B�� �մ�~Ŀ�� ���� �ֽ��ϴ�.\n");
		
		System.out.println("C��,� Ŀ�� �帱���?(1:����,2:����,3:����)");
		coffee=s.nextInt();
		ret=coffee_machine(coffee);
		System.out.println("C�� �մ�~Ŀ�� ���� �ֽ��ϴ�.\n");
		
		
		
		
		
		
		
		
		

	}

}