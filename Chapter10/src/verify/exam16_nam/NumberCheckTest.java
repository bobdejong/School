package verify.exam16_nam;

import java.util.Scanner;

public class NumberCheckTest {

	public static void main(String[] args) {
		String value;
		char ch;
		boolean isNumber=true;
		int count=0;
		
		Scanner scan=new Scanner(System.in);
		while(true) {
			value=null;
			isNumber=true;
			System.out.println("1.���ڿ��� �Է��ϼ���:");
			value=scan.nextLine();
			for(int i=0;i<value.length();i++) {
				ch=value.charAt(i);
				if(ch < '0' || ch>'9') {
					isNumber=false;
					break;
				}
				
			}
			if(isNumber) {
				System.out.println("value�� �����Դϴ�.");
				System.out.println("value="+value);
				break;
			}else {
				System.out.println("value�� ���ڰ� �ƴմϴ�.");
				System.out.println("value="+value);
				
			}
		}

	}

}
