package sec20.ex01_system;

public class SystemExample7 {

	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Usage:java SystemExample7 <정수>  <정수>");
			System.exit(1);
		}
		try {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			int sum = num1 + num2;
			System.out.println("sum=" + sum);
			System.exit(0);

		}

		catch (NumberFormatException e) {
			System.err.println("잘못된 숫자 입니다.");
			System.exit(-1);
		}

	}

}
