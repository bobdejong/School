package verify.exam14;

import java.util.Scanner;

public class MemberServiceExample {

	public static void main(String[] args) {
		MemberService memberService=new MemberService();
		String name,password;
		Scanner scan=new Scanner(System.in);
		System.out.println("id를 입력하세요");
		name=scan.nextLine();
		System.out.println("password를 입력하세요");
		password=scan.nextLine();
		
		boolean result=memberService.login(name, password);
		
		if(result == true) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
		}else
			System.out.println("id또는 password가 올바르지 않습니다.");
		
	}

}
