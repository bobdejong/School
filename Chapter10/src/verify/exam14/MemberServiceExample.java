package verify.exam14;

import java.util.Scanner;

public class MemberServiceExample {

	public static void main(String[] args) {
		MemberService memberService=new MemberService();
		String name,password;
		Scanner scan=new Scanner(System.in);
		System.out.println("id�� �Է��ϼ���");
		name=scan.nextLine();
		System.out.println("password�� �Է��ϼ���");
		password=scan.nextLine();
		
		boolean result=memberService.login(name, password);
		
		if(result == true) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			memberService.logout("hong");
		}else
			System.out.println("id�Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
		
	}

}
