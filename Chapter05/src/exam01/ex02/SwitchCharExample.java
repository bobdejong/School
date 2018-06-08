package exam01.ex02;

public class SwitchCharExample {

	public static void main(String[] args) {
		char grade='B';
		
		switch(grade) {
		case 'A':
			System.out.println("우수 A");
			break;
		case 'a':
			System.out.println("우수 회원입니다.");
			break;
		case 'B':
			System.out.println("일반 A");
			break;
		case 'b':
			System.out.println("일반 회원입니다.");
			break;
			default:
				System.out.println("손님입니다.");
		
		}

	}

}
